## cljs.core/copy-arguments



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(copy-arguments dest)</samp><br>

---

 <samp>
(__copy-arguments__ dest)<br>
</samp>

---







Source code @ [github]():

```clj
(core/defmacro copy-arguments [dest]
  `(let [len# (alength (js-arguments))]
     (loop [i# 0]
       (when (< i# len#)
         (.push ~dest (aget (js-arguments) i#))
         (recur (inc i#))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/copy-arguments` @ crossclj](http://crossclj.info/fun/cljs.core/copy-arguments.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/copy-arguments.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "copy-arguments",
 :signature ["[dest]"],
 :name-encode "copy-arguments",
 :history [["+" "1.7.10"]],
 :type "macro",
 :full-name-encode "cljs.core/copy-arguments",
 :source {:code "(core/defmacro copy-arguments [dest]\n  `(let [len# (alength (js-arguments))]\n     (loop [i# 0]\n       (when (< i# len#)\n         (.push ~dest (aget (js-arguments) i#))\n         (recur (inc i#))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [2741 2746],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/core.cljc#L2741-L2746"},
 :usage ["(copy-arguments dest)"],
 :full-name "cljs.core/copy-arguments",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/copy-arguments.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/copy-arguments"]))
```

-->
