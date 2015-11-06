## clojure.string/split-lines



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/split-lines</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/split-lines)
</td>
</tr>
</table>


 <samp>
(__split-lines__ s)<br>
</samp>

---

Splits `s` on `\n` or `\r\n`.



---


###### See Also:

[`clojure.string/split`](../clojure.string/split.md)<br>

---


Source docstring:

```
Splits s on 
 or 
.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/clojure/string.cljs#L127-L130):

```clj
(defn split-lines
  [s]
  (split s #"\n|\r\n"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2322
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:127-130](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/clojure/string.cljs#L127-L130)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/split-lines` @ clojuredocs](http://clojuredocs.org/clojure.string/split-lines)<br>
[`clojure.string/split-lines` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/split-lines/)<br>
[`clojure.string/split-lines` @ crossclj](http://crossclj.info/fun/clojure.string/split-lines.html)<br>
[`clojure.string/split-lines` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/split-lines.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/split-lines.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Splits `s` on `\\n` or `\\r\\n`.",
 :ns "clojure.string",
 :name "split-lines",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["clojure.string/split"],
 :full-name-encode "clojure.string/split-lines",
 :source {:code "(defn split-lines\n  [s]\n  (split s #\"\\n|\\r\\n\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2322",
          :filename "src/cljs/clojure/string.cljs",
          :lines [127 130]},
 :full-name "clojure.string/split-lines",
 :clj-symbol "clojure.string/split-lines",
 :docstring "Splits s on \n or \r\n."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/split-lines"]))
```

-->
