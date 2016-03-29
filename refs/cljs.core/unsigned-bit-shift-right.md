## cljs.core/unsigned-bit-shift-right



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2080"><img valign="middle" alt="[+] 0.0-2080" title="Added in 0.0-2080" src="https://img.shields.io/badge/+-0.0--2080-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unsigned-bit-shift-right</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unsigned-bit-shift-right)
</td>
</tr>
</table>

<samp>(unsigned-bit-shift-right x n)</samp><br>

---

 <samp>
(__unsigned-bit-shift-right__ x n)<br>
</samp>

---

Bitwise shift right with zero fill



---


###### See Also:

[`cljs.core/bit-shift-right`](../cljs.core/bit-shift-right.md)<br>

---


Source docstring:

```
Bitwise shift right with zero fill
```


Function code @ [github]():

```clj
(defn unsigned-bit-shift-right
  [x n] (cljs.core/unsigned-bit-shift-right x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---

Macro code @ [github]():

```clj
(core/defmacro ^::ana/numeric unsigned-bit-shift-right [x n]
  (core/list 'js* "(~{} >>> ~{})" x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---


###### External doc links:

[`clojure.core/unsigned-bit-shift-right` @ clojuredocs](http://clojuredocs.org/clojure.core/unsigned-bit-shift-right)<br>
[`clojure.core/unsigned-bit-shift-right` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unsigned-bit-shift-right/)<br>
[`clojure.core/unsigned-bit-shift-right` @ crossclj](http://crossclj.info/fun/clojure.core/unsigned-bit-shift-right.html)<br>
[`cljs.core/unsigned-bit-shift-right` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unsigned-bit-shift-right.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unsigned-bit-shift-right.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise shift right with zero fill",
 :ns "cljs.core",
 :name "unsigned-bit-shift-right",
 :signature ["[x n]"],
 :name-encode "unsigned-bit-shift-right",
 :history [["+" "0.0-2080"]],
 :type "function/macro",
 :clj-equiv {:full-name "clojure.core/unsigned-bit-shift-right",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unsigned-bit-shift-right"},
 :related ["cljs.core/bit-shift-right"],
 :full-name-encode "cljs.core/unsigned-bit-shift-right",
 :source {:code "(defn unsigned-bit-shift-right\n  [x n] (cljs.core/unsigned-bit-shift-right x n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2639 2641],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L2639-L2641"},
 :extra-sources [{:code "(core/defmacro ^::ana/numeric unsigned-bit-shift-right [x n]\n  (core/list 'js* \"(~{} >>> ~{})\" x n))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.8.40",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [1125 1126],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/core.cljc#L1125-L1126"}],
 :usage ["(unsigned-bit-shift-right x n)"],
 :full-name "cljs.core/unsigned-bit-shift-right",
 :docstring "Bitwise shift right with zero fill",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unsigned-bit-shift-right.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unsigned-bit-shift-right"]))
```

-->
