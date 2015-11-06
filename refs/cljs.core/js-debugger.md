## cljs.core/js-debugger



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-debugger__)<br>
</samp>

---

Creates breakpoint that will stop the debugger if the browser's devtools are
open.  Equivalent to `debugger;` in JavaScript.



---

###### Examples:

```clj
(defn foo []
  (println "HI")
  (js-debugger)
  (println "WORLD"))

(foo)
;; will print "HI" then pause JS inside this function
;; if browser devtools are open.
```



---





Source code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/core.clj#L293-L294):

```clj
(defmacro js-debugger []
  (core/list 'js* "debugger;"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:293-294](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/core.clj#L293-L294)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/js-debugger` @ crossclj](http://crossclj.info/fun/cljs.core/js-debugger.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-debugger.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates breakpoint that will stop the debugger if the browser's devtools are\nopen.  Equivalent to `debugger;` in JavaScript.",
 :ns "cljs.core",
 :name "js-debugger",
 :signature ["[]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.core/js-debugger",
 :source {:code "(defmacro js-debugger []\n  (core/list 'js* \"debugger;\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/clj/cljs/core.clj",
          :lines [293 294]},
 :examples [{:id "87f2fa",
             :content "```clj\n(defn foo []\n  (println \"HI\")\n  (js-debugger)\n  (println \"WORLD\"))\n\n(foo)\n;; will print \"HI\" then pause JS inside this function\n;; if browser devtools are open.\n```"}],
 :full-name "cljs.core/js-debugger"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-debugger"]))
```

-->
