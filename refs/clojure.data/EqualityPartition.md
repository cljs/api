## clojure.data/EqualityPartition



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.data/EqualityPartition</samp>](http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/EqualityPartition)
</td>
</tr>
</table>







Source docstring:

```
Implementation detail. Subject to change.
```


Source code @ [github]():

```clj
(defprotocol EqualityPartition
  "Implementation detail. Subject to change."
  (equality-partition [x] "Implementation detail. Subject to change."))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.data/EqualityPartition` @ clojuredocs](http://clojuredocs.org/clojure.data/EqualityPartition)<br>
[`clojure.data/EqualityPartition` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.data/EqualityPartition/)<br>
[`clojure.data/EqualityPartition` @ crossclj](http://crossclj.info/fun/clojure.data/EqualityPartition.html)<br>
[`clojure.data/EqualityPartition` @ crossclj](http://crossclj.info/fun/clojure.data.cljs/EqualityPartition.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.data/EqualityPartition.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.data",
 :name "EqualityPartition",
 :name-encode "EqualityPartition",
 :history [["+" "0.0-1503"]],
 :type "protocol",
 :clj-equiv {:full-name "clojure.data/EqualityPartition",
             :url "http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/EqualityPartition"},
 :full-name-encode "clojure.data/EqualityPartition",
 :source {:code "(defprotocol EqualityPartition\n  \"Implementation detail. Subject to change.\"\n  (equality-partition [x] \"Implementation detail. Subject to change.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/clojure/data.cljs",
          :lines [75 77],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/clojure/data.cljs#L75-L77"},
 :methods [{:name "equality-partition",
            :signature ["[x]"],
            :docstring "Implementation detail. Subject to change."}],
 :full-name "clojure.data/EqualityPartition",
 :docstring "Implementation detail. Subject to change.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.data/EqualityPartition.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.data/EqualityPartition"]))
```

-->
