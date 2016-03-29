## cljs.core/force



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/force</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/force)
</td>
</tr>
</table>

<samp>(force x)</samp><br>

---

 <samp>
(__force__ x)<br>
</samp>

---





Source docstring:

```
If x is a Delay, returns the (possibly cached) value of its expression, else returns x
```


Source code @ [github]():

```clj
(defn force
  [x]
  (if (delay? x)
    (deref x)
    x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/force` @ clojuredocs](http://clojuredocs.org/clojure.core/force)<br>
[`clojure.core/force` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/force/)<br>
[`clojure.core/force` @ crossclj](http://crossclj.info/fun/clojure.core/force.html)<br>
[`cljs.core/force` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/force.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/force.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "force",
 :signature ["[x]"],
 :name-encode "force",
 :history [["+" "0.0-927"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/force",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/force"},
 :full-name-encode "cljs.core/force",
 :source {:code "(defn force\n  [x]\n  (if (delay? x)\n    (deref x)\n    x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9444 9449],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L9444-L9449"},
 :usage ["(force x)"],
 :full-name "cljs.core/force",
 :docstring "If x is a Delay, returns the (possibly cached) value of its expression, else returns x",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/force.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/force"]))
```

-->
