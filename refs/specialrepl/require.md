## require (repl)



 <table border="1">
<tr>
<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/require</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/require)
</td>
</tr>
</table>



Only usable from a REPL.

Loads libs, skipping any that are already loaded. Each argument is
either a libspec that identifies a lib or a flag that modifies how all the identified
libs are loaded.

## Libspecs

A libspec is a lib name or a vector containing a lib name followed by
options expressed as sequential keywords and arguments.

Recognized options:

- `:as` takes a symbol as its argument and makes that symbol an alias to the
  lib's namespace in the current namespace.
- `:refer` takes a list of symbols to refer from the namespace..
- `:refer-macros` takes a list of macro symbols to refer from the namespace.
- `:include-macros` takes a list of macro symbols to refer from the namespace.

## Flags

A flag is a keyword. Recognized flags:

- `:reload` forces loading of all the identified libs even if they are
  already loaded
- `:reload-all` implies :reload and also forces loading of all libs that the
  identified libs directly or indirectly load via require or use
- `:verbose` triggers printing information about each load, alias, and refer



---

###### Examples:

```clj
(require '[clojure/string :as string])
```



---

###### See Also:

[`require-macros (repl)`](../specialrepl/require-macros.md)<br>

---




repl specials table @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/repl.clj#L275-L336):

```clj
(def default-special-fns
  (let [load-file-fn
        (fn self
          ([repl-env env form]
            (self repl-env env form nil))
          ([repl-env env [_ file :as form] opts]
            (load-file repl-env file opts)))]
    {'in-ns
     (fn self
       ([repl-env env form]
         (self repl-env env form nil))
       ([repl-env env [_ [quote ns-name] :as form] _]
         ;; guard against craziness like '5 which wreaks havoc
         (when-not (and (= quote 'quote) (symbol? ns-name))
           (throw (IllegalArgumentException. "Argument to in-ns must be a symbol.")))
         (when-not (ana/get-namespace ns-name)
           (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})
           (-evaluate repl-env "<cljs repl>" 1
             (str "goog.provide('" (comp/munge ns-name) "');")))
         (set! ana/*cljs-ns* ns-name)))
     'require
     (fn self
       ([repl-env env form]
         (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
         (evaluate-form repl-env env "<cljs repl>"
           (with-meta
             `(~'ns ~ana/*cljs-ns*
                (:require
                  ~@(map
                      (fn [quoted-spec-or-kw]
                        (if (keyword? quoted-spec-or-kw)
                          quoted-spec-or-kw
                          (second quoted-spec-or-kw)))
                      specs)))
             {:merge true :line 1 :column 1})
           identity opts)))
     'require-macros
     (fn self
       ([repl-env env form]
         (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
         (evaluate-form repl-env env "<cljs repl>"
           (with-meta
             `(~'ns ~ana/*cljs-ns*
                (:require-macros
                  ~@(map
                      (fn [quoted-spec-or-kw]
                        (if (keyword? quoted-spec-or-kw)
                          quoted-spec-or-kw
                          (second quoted-spec-or-kw)))
                      specs)))
             {:merge true :line 1 :column 1})
           identity opts)))
     'load-file load-file-fn
     'clojure.core/load-file load-file-fn
     'load-namespace
     (fn self
       ([repl-env env form]
         (self env repl-env form nil))
       ([repl-env env [_ ns :as form] opts]
         (load-namespace repl-env ns opts)))}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:275-336](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/repl.clj#L275-L336)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/require` @ clojuredocs](http://clojuredocs.org/clojure.core/require)<br>
[`clojure.core/require` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/require/)<br>
[`clojure.core/require` @ crossclj](http://crossclj.info/fun/clojure.core/require.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl/require.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Only usable from a REPL.\n\nLoads libs, skipping any that are already loaded. Each argument is\neither a libspec that identifies a lib or a flag that modifies how all the identified\nlibs are loaded.\n\n## Libspecs\n\nA libspec is a lib name or a vector containing a lib name followed by\noptions expressed as sequential keywords and arguments.\n\nRecognized options:\n\n- `:as` takes a symbol as its argument and makes that symbol an alias to the\n  lib's namespace in the current namespace.\n- `:refer` takes a list of symbols to refer from the namespace..\n- `:refer-macros` takes a list of macro symbols to refer from the namespace.\n- `:include-macros` takes a list of macro symbols to refer from the namespace.\n\n## Flags\n\nA flag is a keyword. Recognized flags:\n\n- `:reload` forces loading of all the identified libs even if they are\n  already loaded\n- `:reload-all` implies :reload and also forces loading of all libs that the\n  identified libs directly or indirectly load via require or use\n- `:verbose` triggers printing information about each load, alias, and refer",
 :ns "specialrepl",
 :name "require",
 :history [["+" "0.0-2629"]],
 :type "special form (repl)",
 :related ["specialrepl/require-macros"],
 :full-name-encode "specialrepl/require",
 :source {:code "(def default-special-fns\n  (let [load-file-fn\n        (fn self\n          ([repl-env env form]\n            (self repl-env env form nil))\n          ([repl-env env [_ file :as form] opts]\n            (load-file repl-env file opts)))]\n    {'in-ns\n     (fn self\n       ([repl-env env form]\n         (self repl-env env form nil))\n       ([repl-env env [_ [quote ns-name] :as form] _]\n         ;; guard against craziness like '5 which wreaks havoc\n         (when-not (and (= quote 'quote) (symbol? ns-name))\n           (throw (IllegalArgumentException. \"Argument to in-ns must be a symbol.\")))\n         (when-not (ana/get-namespace ns-name)\n           (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})\n           (-evaluate repl-env \"<cljs repl>\" 1\n             (str \"goog.provide('\" (comp/munge ns-name) \"');\")))\n         (set! ana/*cljs-ns* ns-name)))\n     'require\n     (fn self\n       ([repl-env env form]\n         (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n         (evaluate-form repl-env env \"<cljs repl>\"\n           (with-meta\n             `(~'ns ~ana/*cljs-ns*\n                (:require\n                  ~@(map\n                      (fn [quoted-spec-or-kw]\n                        (if (keyword? quoted-spec-or-kw)\n                          quoted-spec-or-kw\n                          (second quoted-spec-or-kw)))\n                      specs)))\n             {:merge true :line 1 :column 1})\n           identity opts)))\n     'require-macros\n     (fn self\n       ([repl-env env form]\n         (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n         (evaluate-form repl-env env \"<cljs repl>\"\n           (with-meta\n             `(~'ns ~ana/*cljs-ns*\n                (:require-macros\n                  ~@(map\n                      (fn [quoted-spec-or-kw]\n                        (if (keyword? quoted-spec-or-kw)\n                          quoted-spec-or-kw\n                          (second quoted-spec-or-kw)))\n                      specs)))\n             {:merge true :line 1 :column 1})\n           identity opts)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace\n     (fn self\n       ([repl-env env form]\n         (self env repl-env form nil))\n       ([repl-env env [_ ns :as form] opts]\n         (load-namespace repl-env ns opts)))}))",
          :title "repl specials table",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/clj/cljs/repl.clj",
          :lines [275 336]},
 :examples [{:id "ab0355",
             :content "```clj\n(require '[clojure/string :as string])\n```"}],
 :full-name "specialrepl/require",
 :clj-symbol "clojure.core/require"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/require"]))
```

-->