## cljs.core/min



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/min</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/min)
</td>
</tr>
</table>

<samp>(min x)</samp><br>
<samp>(min x y)</samp><br>
<samp>(min x y & more)</samp><br>

---

 <samp>
(__min__ x)<br>
</samp>
 <samp>
(__min__ x y)<br>
</samp>
 <samp>
(__min__ x y & more)<br>
</samp>

---

Returns the least number argument.



---

###### Examples:

```clj
(min 1 2 3 4)
;; => 1
```

Apply it to a collection:

```clj
(apply min [1 2 3 4])
;; => 1
```



---

###### See Also:

[`cljs.core/max`](../cljs.core/max.md)<br>
[`cljs.core/min-key`](../cljs.core/min-key.md)<br>

---


Source docstring:

```
Returns the least of the nums.
```


Function code @ [github]():

```clj
(defn ^number min
  ([x] x)
  ([x y] (cljs.core/min x y))
  ([x y & more]
   (reduce min (cljs.core/min x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---

Macro code @ [github]():

```clj
(core/defmacro ^::ana/numeric min
  ([x] x)
  ([x y] `(let [x# ~x, y# ~y]
            (~'js* "((~{} < ~{}) ? ~{} : ~{})" x# y# x# y#)))
  ([x y & more] `(min (min ~x ~y) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---


###### External doc links:

[`clojure.core/min` @ clojuredocs](http://clojuredocs.org/clojure.core/min)<br>
[`clojure.core/min` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/min/)<br>
[`clojure.core/min` @ crossclj](http://crossclj.info/fun/clojure.core/min.html)<br>
[`cljs.core/min` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/min.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/min.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the least number argument.",
 :return-type number,
 :ns "cljs.core",
 :name "min",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :name-encode "min",
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :clj-equiv {:full-name "clojure.core/min",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/min"},
 :related ["cljs.core/max" "cljs.core/min-key"],
 :full-name-encode "cljs.core/min",
 :source {:code "(defn ^number min\n  ([x] x)\n  ([x y] (cljs.core/min x y))\n  ([x y & more]\n   (reduce min (cljs.core/min x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2426 2431],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L2426-L2431"},
 :extra-sources [{:code "(core/defmacro ^::ana/numeric min\n  ([x] x)\n  ([x y] `(let [x# ~x, y# ~y]\n            (~'js* \"((~{} < ~{}) ? ~{} : ~{})\" x# y# x# y#)))\n  ([x y & more] `(min (min ~x ~y) ~@more)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.9.36",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [1091 1095],
                  :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/core.cljc#L1091-L1095"}],
 :usage ["(min x)" "(min x y)" "(min x y & more)"],
 :examples [{:id "ab2de5",
             :content "```clj\n(min 1 2 3 4)\n;; => 1\n```\n\nApply it to a collection:\n\n```clj\n(apply min [1 2 3 4])\n;; => 1\n```"}],
 :full-name "cljs.core/min",
 :docstring "Returns the least of the nums.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/min.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/min"]))
```

-->
