## cljs.core/unchecked-multiply



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-multiply</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-multiply)
</td>
</tr>
</table>

<samp>(unchecked-multiply)</samp><br>
<samp>(unchecked-multiply x)</samp><br>
<samp>(unchecked-multiply x y)</samp><br>
<samp>(unchecked-multiply x y & more)</samp><br>

---

 <samp>
(__unchecked-multiply__)<br>
</samp>
 <samp>
(__unchecked-multiply__ x)<br>
</samp>
 <samp>
(__unchecked-multiply__ x y)<br>
</samp>
 <samp>
(__unchecked-multiply__ x y & more)<br>
</samp>

---





Source docstring:

```
Returns the product of nums. (*) returns 1.
```


Function code @ [github]():

```clj
(defn ^number unchecked-multiply
  ([] 1)
  ([x] x)
  ([x y] (cljs.core/unchecked-multiply x y))
  ([x y & more] (reduce unchecked-multiply (cljs.core/unchecked-multiply x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---

Macro code @ [github]():

```clj
(core/defmacro ^::ana/numeric unchecked-multiply
  ([& xs] `(* ~@xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-multiply` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-multiply)<br>
[`clojure.core/unchecked-multiply` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-multiply/)<br>
[`clojure.core/unchecked-multiply` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-multiply.html)<br>
[`cljs.core/unchecked-multiply` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-multiply.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-multiply.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-multiply",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :name-encode "unchecked-multiply",
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :clj-equiv {:full-name "clojure.core/unchecked-multiply",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-multiply"},
 :full-name-encode "cljs.core/unchecked-multiply",
 :source {:code "(defn ^number unchecked-multiply\n  ([] 1)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-multiply x y))\n  ([x y & more] (reduce unchecked-multiply (cljs.core/unchecked-multiply x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2484 2489],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L2484-L2489"},
 :extra-sources [{:code "(core/defmacro ^::ana/numeric unchecked-multiply\n  ([& xs] `(* ~@xs)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [984 985],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/clojure/cljs/core.cljc#L984-L985"}],
 :usage ["(unchecked-multiply)"
         "(unchecked-multiply x)"
         "(unchecked-multiply x y)"
         "(unchecked-multiply x y & more)"],
 :full-name "cljs.core/unchecked-multiply",
 :docstring "Returns the product of nums. (*) returns 1.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-multiply.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-multiply"]))
```

-->
