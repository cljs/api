## cljs.core/enable-console-print!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2060"><img valign="middle" alt="[+] 0.0-2060" title="Added in 0.0-2060" src="https://img.shields.io/badge/+-0.0--2060-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__enable-console-print!__)<br>
</samp>

---





Source docstring:

```
Set *print-fn* to console.log
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L51-L57):

```clj
(defn enable-console-print!
  []
  (set! *print-newline* false)
  (set! *print-fn*
    (fn [& args]
      (.apply (.-log js/console) js/console (into-array args)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:51-57](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L51-L57)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/enable-console-print!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/enable-console-print%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/enable-console-printBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "enable-console-print!",
 :signature ["[]"],
 :history [["+" "0.0-2060"]],
 :type "function",
 :full-name-encode "cljs.core/enable-console-printBANG",
 :source {:code "(defn enable-console-print!\n  []\n  (set! *print-newline* false)\n  (set! *print-fn*\n    (fn [& args]\n      (.apply (.-log js/console) js/console (into-array args)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/cljs/core.cljs",
          :lines [51 57]},
 :full-name "cljs.core/enable-console-print!",
 :docstring "Set *print-fn* to console.log"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/enable-console-print!"]))
```

-->
