## ns



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns)
</td>
</tr>
</table>


 <samp>
(__ns__ name & references)<br>
</samp>

---

Sets the namespace of the file.

`ns` must be the first form in a `.cljs` file and there can only be one `ns`
declaration per file. Namespaces must match the file name of their respective
`.cljs` files, with the exception that dashes in namespaces become underscores
in filenames. Thus, `(ns foo.bar-biz.baz)` should be the first form in file
`foo/bar_biz/baz.cljs`.

`references` can be zero or more forms used to import other namespaces, symbols,
and libraries into the current namespace.

```clj
(ns example.core

  ;; for excluding clojure symbols
  (:refer-clojure :exclude [])

  ;; for importing goog classes and enums
  (:import
    lib.ns
    [lib.ns Ctor*])

  (:require-macros
    [lib.ns :refer []
            :as alias
            :reload
            :reload-all])

  (:require
    [lib.ns :refer []
            :refer-macros []
            :include-macros true|false
            :as alias
            :reload
            :reload-all])

  (:use
    [lib.ns :only []
            :reload
            :reload-all])

  (:use-macros
    [lib.ns :only []
            :reload
            :reload-all]))
```



---


###### See Also:

[`in-ns (repl)`](../specialrepl/in-ns.md)<br>
[`load-namespace (repl)`](../specialrepl/load-namespace.md)<br>
[`import (repl)`](../specialrepl/import.md)<br>
[`require (repl)`](../specialrepl/require.md)<br>
[`require-macros (repl)`](../specialrepl/require-macros.md)<br>

---


Source docstring:

```
You must currently use the ns form only with the following caveats

  * You must use the :only form of :use
  * :require supports :as and :refer
    - both options can be skipped
    - in this case a symbol can be used as a libspec directly
      - that is, (:require lib.foo) and (:require [lib.foo]) are both
        supported and mean the same thing
    - prefix lists are not supported
  * The only option for :refer-clojure is :exclude
  * :import is available for importing Google Closure classes
    - ClojureScript types and records should be brought in with :use
      or :require :refer, not :import ed
  * Macros are written in Clojure, and are referenced via the new
    :require-macros / :use-macros options to ns
    - :require-macros and :use-macros support the same forms that
      :require and :use do

Implicit macro loading: If a namespace is required or used, and that
namespace itself requires or uses macros from its own namespace, then
the macros will be implicitly required or used using the same
specifications. This oftentimes leads to simplified library usage,
such that the consuming namespace need not be concerned about
explicitly distinguishing between whether certain vars are functions
or macros.

Inline macro specification: As a convenience, :require can be given
either :include-macros true or :refer-macros [syms...]. Both desugar
into forms which explicitly load the matching Clojure file containing
macros. (This works independently of whether the namespace being
required internally requires or uses its own macros.) For example:

(ns testme.core
(:require [foo.core :as foo :refer [foo-fn] :include-macros true]
          [woz.core :as woz :refer [woz-fn] :refer-macros [app jx]]))

is sugar for

(ns testme.core
(:require [foo.core :as foo :refer [foo-fn]]
          [woz.core :as woz :refer [woz-fn]])
(:require-macros [foo.core :as foo]
                 [woz.core :as woz :refer [app jx]]))
```


Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/analyzer.cljc#L1888-L1984):

```clj
(defmethod parse 'ns
  [_ env [_ name & args :as form] _ opts]
  (when-not (symbol? name)
    (throw (error env "Namespaces must be named by a symbol.")))
  (let [name (cond-> name (:macros-ns opts) macro-ns-name)]
    (let [segments (string/split (clojure.core/name name) #"\.")]
      (when (= 1 (count segments))
        (warning :single-segment-namespace env {:name name}))
      (when (some js-reserved segments)
        (warning :munged-namespace env {:name name}))
      (find-def-clash env name segments)
      #?(:clj
         (when (some (complement util/valid-js-id-start?) segments)
           (throw
             (AssertionError.
               (str "Namespace " name " has a segment starting with an invaild "
                    "JavaScript identifier"))))))
    (let [docstring    (if (string? (first args)) (first args))
          mdocstr      (-> name meta :doc)
          args         (if docstring (next args) args)
          metadata     (if (map? (first args)) (first args))
          form-meta    (meta form)
          args         (desugar-ns-specs (if metadata (next args) args))
          name         (vary-meta name merge metadata)
          excludes     (parse-ns-excludes env args)
          deps         (atom #{})
          aliases      (atom {:fns {} :macros {}})
          spec-parsers {:require        (partial parse-require-spec env false deps aliases)
                        :require-macros (partial parse-require-spec env true deps aliases)
                        :use            (comp (partial parse-require-spec env false deps aliases)
                                          (partial use->require env))
                        :use-macros     (comp (partial parse-require-spec env true deps aliases)
                                          (partial use->require env))
                        :import         (partial parse-import-spec env deps)}
          valid-forms  (atom #{:use :use-macros :require :require-macros :import})
          reload       (atom {:use nil :require nil :use-macros nil :require-macros nil})
          reloads      (atom {})
          {uses :use requires :require use-macros :use-macros require-macros :require-macros imports :import :as params}
          (reduce
            (fn [m [k & libs]]
              (when-not (#{:use :use-macros :require :require-macros :import} k)
                (throw (error env "Only :refer-clojure, :require, :require-macros, :use, :use-macros, and :import libspecs supported")))
              (when-not (@valid-forms k)
                (throw (error env (str "Only one " k " form is allowed per namespace definition"))))
              (swap! valid-forms disj k)
              ;; check for spec type reloads
              (when-not (= :import k)
                (when (some #{:reload} libs)
                  (swap! reload assoc k :reload))
                (when (some #{:reload-all} libs)
                  (swap! reload assoc k :reload-all)))
              ;; check for individual ns reloads from REPL interactions
              (when-let [xs (seq (filter #(-> % meta :reload) libs))]
                (swap! reloads assoc k
                  (zipmap (map first xs) (map #(-> % meta :reload) xs))))
              (apply merge-with merge m
                (map (spec-parsers k)
                  (remove #{:reload :reload-all} libs))))
            {} (remove (fn [[r]] (= r :refer-clojure)) args))]
      (set! *cljs-ns* name)
      (let [ns-info
            {:name           name
             :doc            (or docstring mdocstr)
             :excludes       excludes
             :use-macros     use-macros
             :require-macros require-macros
             :uses           uses
             :requires       requires
             :imports        imports}
            ns-info
            (if (:merge form-meta)
              ;; for merging information in via require usage in REPLs
              (let [ns-info' (get-in @env/*compiler* [::namespaces name])]
                (if (pos? (count ns-info'))
                  (let [merge-keys
                        [:use-macros :require-macros :uses :requires :imports]]
                    (merge
                      ns-info'
                      (merge-with merge
                        (select-keys ns-info' merge-keys)
                        (select-keys ns-info merge-keys))))
                  ns-info))
              ns-info)]
        (swap! env/*compiler* update-in [::namespaces name] merge ns-info)
        (merge {:op      :ns
                :env     env
                :form    form
                :deps    @deps
                :reload  @reload
                :reloads @reloads}
          (cond-> ns-info
            (@reload :use)
            (update-in [:uses]
              (fn [m] (with-meta m {(@reload :use) true})))
            (@reload :require)
            (update-in [:requires]
              (fn [m] (with-meta m {(@reload :require) true})))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:1888-1984](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/analyzer.cljc#L1888-L1984)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ns` @ clojuredocs](http://clojuredocs.org/clojure.core/ns)<br>
[`clojure.core/ns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ns/)<br>
[`clojure.core/ns` @ crossclj](http://crossclj.info/fun/clojure.core/ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Sets the namespace of the file.\n\n`ns` must be the first form in a `.cljs` file and there can only be one `ns`\ndeclaration per file. Namespaces must match the file name of their respective\n`.cljs` files, with the exception that dashes in namespaces become underscores\nin filenames. Thus, `(ns foo.bar-biz.baz)` should be the first form in file\n`foo/bar_biz/baz.cljs`.\n\n`references` can be zero or more forms used to import other namespaces, symbols,\nand libraries into the current namespace.\n\n```clj\n(ns example.core\n\n  ;; for excluding clojure symbols\n  (:refer-clojure :exclude [])\n\n  ;; for importing goog classes and enums\n  (:import\n    lib.ns\n    [lib.ns Ctor*])\n\n  (:require-macros\n    [lib.ns :refer []\n            :as alias\n            :reload\n            :reload-all])\n\n  (:require\n    [lib.ns :refer []\n            :refer-macros []\n            :include-macros true|false\n            :as alias\n            :reload\n            :reload-all])\n\n  (:use\n    [lib.ns :only []\n            :reload\n            :reload-all])\n\n  (:use-macros\n    [lib.ns :only []\n            :reload\n            :reload-all]))\n```",
 :ns "special",
 :name "ns",
 :signature ["[name & references]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["specialrepl/in-ns"
           "specialrepl/load-namespace"
           "specialrepl/import"
           "specialrepl/require"
           "specialrepl/require-macros"],
 :full-name-encode "special/ns",
 :source {:code "(defmethod parse 'ns\n  [_ env [_ name & args :as form] _ opts]\n  (when-not (symbol? name)\n    (throw (error env \"Namespaces must be named by a symbol.\")))\n  (let [name (cond-> name (:macros-ns opts) macro-ns-name)]\n    (let [segments (string/split (clojure.core/name name) #\"\\.\")]\n      (when (= 1 (count segments))\n        (warning :single-segment-namespace env {:name name}))\n      (when (some js-reserved segments)\n        (warning :munged-namespace env {:name name}))\n      (find-def-clash env name segments)\n      #?(:clj\n         (when (some (complement util/valid-js-id-start?) segments)\n           (throw\n             (AssertionError.\n               (str \"Namespace \" name \" has a segment starting with an invaild \"\n                    \"JavaScript identifier\"))))))\n    (let [docstring    (if (string? (first args)) (first args))\n          mdocstr      (-> name meta :doc)\n          args         (if docstring (next args) args)\n          metadata     (if (map? (first args)) (first args))\n          form-meta    (meta form)\n          args         (desugar-ns-specs (if metadata (next args) args))\n          name         (vary-meta name merge metadata)\n          excludes     (parse-ns-excludes env args)\n          deps         (atom #{})\n          aliases      (atom {:fns {} :macros {}})\n          spec-parsers {:require        (partial parse-require-spec env false deps aliases)\n                        :require-macros (partial parse-require-spec env true deps aliases)\n                        :use            (comp (partial parse-require-spec env false deps aliases)\n                                          (partial use->require env))\n                        :use-macros     (comp (partial parse-require-spec env true deps aliases)\n                                          (partial use->require env))\n                        :import         (partial parse-import-spec env deps)}\n          valid-forms  (atom #{:use :use-macros :require :require-macros :import})\n          reload       (atom {:use nil :require nil :use-macros nil :require-macros nil})\n          reloads      (atom {})\n          {uses :use requires :require use-macros :use-macros require-macros :require-macros imports :import :as params}\n          (reduce\n            (fn [m [k & libs]]\n              (when-not (#{:use :use-macros :require :require-macros :import} k)\n                (throw (error env \"Only :refer-clojure, :require, :require-macros, :use, :use-macros, and :import libspecs supported\")))\n              (when-not (@valid-forms k)\n                (throw (error env (str \"Only one \" k \" form is allowed per namespace definition\"))))\n              (swap! valid-forms disj k)\n              ;; check for spec type reloads\n              (when-not (= :import k)\n                (when (some #{:reload} libs)\n                  (swap! reload assoc k :reload))\n                (when (some #{:reload-all} libs)\n                  (swap! reload assoc k :reload-all)))\n              ;; check for individual ns reloads from REPL interactions\n              (when-let [xs (seq (filter #(-> % meta :reload) libs))]\n                (swap! reloads assoc k\n                  (zipmap (map first xs) (map #(-> % meta :reload) xs))))\n              (apply merge-with merge m\n                (map (spec-parsers k)\n                  (remove #{:reload :reload-all} libs))))\n            {} (remove (fn [[r]] (= r :refer-clojure)) args))]\n      (set! *cljs-ns* name)\n      (let [ns-info\n            {:name           name\n             :doc            (or docstring mdocstr)\n             :excludes       excludes\n             :use-macros     use-macros\n             :require-macros require-macros\n             :uses           uses\n             :requires       requires\n             :imports        imports}\n            ns-info\n            (if (:merge form-meta)\n              ;; for merging information in via require usage in REPLs\n              (let [ns-info' (get-in @env/*compiler* [::namespaces name])]\n                (if (pos? (count ns-info'))\n                  (let [merge-keys\n                        [:use-macros :require-macros :uses :requires :imports]]\n                    (merge\n                      ns-info'\n                      (merge-with merge\n                        (select-keys ns-info' merge-keys)\n                        (select-keys ns-info merge-keys))))\n                  ns-info))\n              ns-info)]\n        (swap! env/*compiler* update-in [::namespaces name] merge ns-info)\n        (merge {:op      :ns\n                :env     env\n                :form    form\n                :deps    @deps\n                :reload  @reload\n                :reloads @reloads}\n          (cond-> ns-info\n            (@reload :use)\n            (update-in [:uses]\n              (fn [m] (with-meta m {(@reload :use) true})))\n            (@reload :require)\n            (update-in [:requires]\n              (fn [m] (with-meta m {(@reload :require) true})))))))))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [1888 1984]},
 :full-name "special/ns",
 :clj-symbol "clojure.core/ns",
 :docstring "You must currently use the ns form only with the following caveats\n\n  * You must use the :only form of :use\n  * :require supports :as and :refer\n    - both options can be skipped\n    - in this case a symbol can be used as a libspec directly\n      - that is, (:require lib.foo) and (:require [lib.foo]) are both\n        supported and mean the same thing\n    - prefix lists are not supported\n  * The only option for :refer-clojure is :exclude\n  * :import is available for importing Google Closure classes\n    - ClojureScript types and records should be brought in with :use\n      or :require :refer, not :import ed\n  * Macros are written in Clojure, and are referenced via the new\n    :require-macros / :use-macros options to ns\n    - :require-macros and :use-macros support the same forms that\n      :require and :use do\n\nImplicit macro loading: If a namespace is required or used, and that\nnamespace itself requires or uses macros from its own namespace, then\nthe macros will be implicitly required or used using the same\nspecifications. This oftentimes leads to simplified library usage,\nsuch that the consuming namespace need not be concerned about\nexplicitly distinguishing between whether certain vars are functions\nor macros.\n\nInline macro specification: As a convenience, :require can be given\neither :include-macros true or :refer-macros [syms...]. Both desugar\ninto forms which explicitly load the matching Clojure file containing\nmacros. (This works independently of whether the namespace being\nrequired internally requires or uses its own macros.) For example:\n\n(ns testme.core\n(:require [foo.core :as foo :refer [foo-fn] :include-macros true]\n          [woz.core :as woz :refer [woz-fn] :refer-macros [app jx]]))\n\nis sugar for\n\n(ns testme.core\n(:require [foo.core :as foo :refer [foo-fn]]\n          [woz.core :as woz :refer [woz-fn]])\n(:require-macros [foo.core :as foo]\n                 [woz.core :as woz :refer [app jx]]))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/ns"]))
```

-->
