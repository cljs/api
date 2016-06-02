## cljs.core/to-array



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/to-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/to-array)
</td>
</tr>
</table>

<samp>(to-array s)</samp><br>

---

 <samp>
(__to-array__ s)<br>
</samp>

---





Source docstring:

```
Naive impl of to-array as a start.
```


Source code @ [github]():

```clj
(defn to-array
  [s]
  (let [ary (array)]
    (loop [s s]
      (if (seq s)
        (do (. ary push (first s))
            (recur (next s)))
        ary))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/to-array` @ clojuredocs](http://clojuredocs.org/clojure.core/to-array)<br>
[`clojure.core/to-array` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/to-array/)<br>
[`clojure.core/to-array` @ crossclj](http://crossclj.info/fun/clojure.core/to-array.html)<br>
[`cljs.core/to-array` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/to-array.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/to-array.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "to-array",
 :signature ["[s]"],
 :name-encode "to-array",
 :history [["+" "0.0-927"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/to-array",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/to-array"},
 :full-name-encode "cljs.core/to-array",
 :source {:code "(defn to-array\n  [s]\n  (let [ary (array)]\n    (loop [s s]\n      (if (seq s)\n        (do (. ary push (first s))\n            (recur (next s)))\n        ary))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3329 3337],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/core.cljs#L3329-L3337"},
 :usage ["(to-array s)"],
 :full-name "cljs.core/to-array",
 :docstring "Naive impl of to-array as a start.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/to-array.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/to-array"]))
```

-->
