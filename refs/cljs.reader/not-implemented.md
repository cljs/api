## cljs.reader/not-implemented



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(not-implemented rdr ch)</samp><br>

---

 <samp>
(__not-implemented__ rdr ch)<br>
</samp>

---







Source code @ [github]():

```clj
(defn not-implemented
  [rdr ch]
  (reader-error rdr "Reader for " ch " not implemented yet"))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.reader/not-implemented` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/not-implemented.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/not-implemented.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "not-implemented",
 :signature ["[rdr ch]"],
 :name-encode "not-implemented",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader/not-implemented",
 :source {:code "(defn not-implemented\n  [rdr ch]\n  (reader-error rdr \"Reader for \" ch \" not implemented yet\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [244 246],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/reader.cljs#L244-L246"},
 :usage ["(not-implemented rdr ch)"],
 :full-name "cljs.reader/not-implemented",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/not-implemented.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/not-implemented"]))
```

-->
