## cljs.core/replicate



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/replicate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/replicate)
</td>
</tr>
</table>

<samp>(replicate n x)</samp><br>

---

 <samp>
(__replicate__ n x)<br>
</samp>

---





Source docstring:

```
Returns a lazy seq of n xs.
```


Source code @ [github]():

```clj
(defn replicate
  [n x] (take n (repeat x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/replicate` @ clojuredocs](http://clojuredocs.org/clojure.core/replicate)<br>
[`clojure.core/replicate` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/replicate/)<br>
[`clojure.core/replicate` @ crossclj](http://crossclj.info/fun/clojure.core/replicate.html)<br>
[`cljs.core/replicate` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/replicate.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/replicate.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "replicate",
 :signature ["[n x]"],
 :name-encode "replicate",
 :history [["+" "0.0-927"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/replicate",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/replicate"},
 :full-name-encode "cljs.core/replicate",
 :source {:code "(defn replicate\n  [n x] (take n (repeat x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4474 4476],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L4474-L4476"},
 :usage ["(replicate n x)"],
 :full-name "cljs.core/replicate",
 :docstring "Returns a lazy seq of n xs.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/replicate.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/replicate"]))
```

-->
