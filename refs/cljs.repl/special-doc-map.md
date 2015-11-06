## cljs.repl/special-doc-map



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/clojure/cljs/repl.cljc#L981-L1066):

```clj
(def special-doc-map
  '{. {:forms [(.instanceMethod instance args*)
               (.-instanceField instance)]
       :doc "The instance member form works for methods and fields.
  They all expand into calls to the dot operator at macroexpansion time."}
    ns {:forms [(name docstring? attr-map? references*)]
        :doc "You must currently use the ns form only with the following caveats

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
                   [woz.core :as woz :refer [app jx]]))"}
    def {:forms [(def symbol doc-string? init?)]
         :doc "Creates and interns a global var with the name
  of symbol in the current namespace (*ns*) or locates such a var if
  it already exists.  If init is supplied, it is evaluated, and the
  root binding of the var is set to the resulting value.  If init is
  not supplied, the root binding of the var is unaffected."}
    do {:forms [(do exprs*)]
        :doc "Evaluates the expressions in order and returns the value of
  the last. If no expressions are supplied, returns nil."}
    if {:forms [(if test then else?)]
        :doc "Evaluates test. If not the singular values nil or false,
  evaluates and yields then, otherwise, evaluates and yields else. If
  else is not supplied it defaults to nil."}
    new {:forms [(Constructor. args*) (new Constructor args*)]
         :url "java_interop#new"
         :doc "The args, if any, are evaluated from left to right, and
  passed to the JavaScript constructor. The constructed object is
  returned."}
    quote {:forms [(quote form)]
           :doc "Yields the unevaluated form."}
    recur {:forms [(recur exprs*)]
           :doc "Evaluates the exprs in order, then, in parallel, rebinds
  the bindings of the recursion point to the values of the exprs.
  Execution then jumps back to the recursion point, a loop or fn method."}
    set! {:forms[(set! var-symbol expr)
                 (set! (.- instance-expr instanceFieldName-symbol) expr)]
          :url "vars#set"
          :doc "Used to set vars and JavaScript object fields"}
    throw {:forms [(throw expr)]
           :doc "The expr is evaluated and thrown."}
    try {:forms [(try expr* catch-clause* finally-clause?)]
         :doc "catch-clause => (catch classname name expr*)
  finally-clause => (finally expr*)
  Catches and handles JavaScript exceptions."}
    var {:forms [(var symbol)]
         :doc "The symbol must resolve to a var, and the Var object
itself (not its value) is returned. The reader macro #'x expands to (var x)."}})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:981-1066](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/clojure/cljs/repl.cljc#L981-L1066)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/special-doc-map` @ crossclj](http://crossclj.info/fun/cljs.repl/special-doc-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/special-doc-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "special-doc-map",
 :type "var",
 :source {:code "(def special-doc-map\n  '{. {:forms [(.instanceMethod instance args*)\n               (.-instanceField instance)]\n       :doc \"The instance member form works for methods and fields.\n  They all expand into calls to the dot operator at macroexpansion time.\"}\n    ns {:forms [(name docstring? attr-map? references*)]\n        :doc \"You must currently use the ns form only with the following caveats\n\n    * You must use the :only form of :use\n    * :require supports :as and :refer\n      - both options can be skipped\n      - in this case a symbol can be used as a libspec directly\n        - that is, (:require lib.foo) and (:require [lib.foo]) are both\n          supported and mean the same thing\n      - prefix lists are not supported\n    * The only option for :refer-clojure is :exclude\n    * :import is available for importing Google Closure classes\n      - ClojureScript types and records should be brought in with :use\n        or :require :refer, not :import ed\n    * Macros are written in Clojure, and are referenced via the new\n      :require-macros / :use-macros options to ns\n      - :require-macros and :use-macros support the same forms that\n        :require and :use do\n\n  Implicit macro loading: If a namespace is required or used, and that\n  namespace itself requires or uses macros from its own namespace, then\n  the macros will be implicitly required or used using the same\n  specifications. This oftentimes leads to simplified library usage,\n  such that the consuming namespace need not be concerned about\n  explicitly distinguishing between whether certain vars are functions\n  or macros.\n\n  Inline macro specification: As a convenience, :require can be given\n  either :include-macros true or :refer-macros [syms...]. Both desugar\n  into forms which explicitly load the matching Clojure file containing\n  macros. (This works independently of whether the namespace being\n  required internally requires or uses its own macros.) For example:\n\n  (ns testme.core\n  (:require [foo.core :as foo :refer [foo-fn] :include-macros true]\n            [woz.core :as woz :refer [woz-fn] :refer-macros [app jx]]))\n\n  is sugar for\n\n  (ns testme.core\n  (:require [foo.core :as foo :refer [foo-fn]]\n            [woz.core :as woz :refer [woz-fn]])\n  (:require-macros [foo.core :as foo]\n                   [woz.core :as woz :refer [app jx]]))\"}\n    def {:forms [(def symbol doc-string? init?)]\n         :doc \"Creates and interns a global var with the name\n  of symbol in the current namespace (*ns*) or locates such a var if\n  it already exists.  If init is supplied, it is evaluated, and the\n  root binding of the var is set to the resulting value.  If init is\n  not supplied, the root binding of the var is unaffected.\"}\n    do {:forms [(do exprs*)]\n        :doc \"Evaluates the expressions in order and returns the value of\n  the last. If no expressions are supplied, returns nil.\"}\n    if {:forms [(if test then else?)]\n        :doc \"Evaluates test. If not the singular values nil or false,\n  evaluates and yields then, otherwise, evaluates and yields else. If\n  else is not supplied it defaults to nil.\"}\n    new {:forms [(Constructor. args*) (new Constructor args*)]\n         :url \"java_interop#new\"\n         :doc \"The args, if any, are evaluated from left to right, and\n  passed to the JavaScript constructor. The constructed object is\n  returned.\"}\n    quote {:forms [(quote form)]\n           :doc \"Yields the unevaluated form.\"}\n    recur {:forms [(recur exprs*)]\n           :doc \"Evaluates the exprs in order, then, in parallel, rebinds\n  the bindings of the recursion point to the values of the exprs.\n  Execution then jumps back to the recursion point, a loop or fn method.\"}\n    set! {:forms[(set! var-symbol expr)\n                 (set! (.- instance-expr instanceFieldName-symbol) expr)]\n          :url \"vars#set\"\n          :doc \"Used to set vars and JavaScript object fields\"}\n    throw {:forms [(throw expr)]\n           :doc \"The expr is evaluated and thrown.\"}\n    try {:forms [(try expr* catch-clause* finally-clause?)]\n         :doc \"catch-clause => (catch classname name expr*)\n  finally-clause => (finally expr*)\n  Catches and handles JavaScript exceptions.\"}\n    var {:forms [(var symbol)]\n         :doc \"The symbol must resolve to a var, and the Var object\nitself (not its value) is returned. The reader macro #'x expands to (var x).\"}})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [981 1066]},
 :full-name "cljs.repl/special-doc-map",
 :full-name-encode "cljs.repl/special-doc-map",
 :history [["+" "0.0-2985"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/special-doc-map"]))
```

-->
