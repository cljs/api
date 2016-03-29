## cljs.repl.node/seq->js-array



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(seq->js-array v)</samp><br>

---

 <samp>
(__seq->js-array__ v)<br>
</samp>

---







Source code @ [github]():

```clj
(defn seq->js-array [v]
  (str "[" (apply str (interpose ", " (map pr-str v))) "]"))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl.node/seq->js-array` @ crossclj](http://crossclj.info/fun/cljs.repl.node/seq-%3Ejs-array.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/seq-GTjs-array.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "seq->js-array",
 :signature ["[v]"],
 :name-encode "seq-GTjs-array",
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl.node/seq-GTjs-array",
 :source {:code "(defn seq->js-array [v]\n  (str \"[\" (apply str (interpose \", \" (map pr-str v))) \"]\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [75 76],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/repl/node.clj#L75-L76"},
 :usage ["(seq->js-array v)"],
 :full-name "cljs.repl.node/seq->js-array",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/seq-GTjs-array.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/seq->js-array"]))
```

-->
