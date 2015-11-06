## cljs.test/block



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__block__ fns)<br>
</samp>

---





Source docstring:

```
Tag a seq of fns to be picked up by run-block as injected
continuation.  See run-block.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/test.cljs#L426-L431):

```clj
(defn block
  [fns]
  (some-> fns
          (vary-meta assoc ::block? true)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:426-431](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/test.cljs#L426-L431)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/block` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/block.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/block.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "block",
 :signature ["[fns]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test/block",
 :source {:code "(defn block\n  [fns]\n  (some-> fns\n          (vary-meta assoc ::block? true)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/test.cljs",
          :lines [426 431]},
 :full-name "cljs.test/block",
 :docstring "Tag a seq of fns to be picked up by run-block as injected\ncontinuation.  See run-block."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/block"]))
```

-->
