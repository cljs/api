## cljs.core/bit-and-not



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-and-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-and-not)
</td>
</tr>
</table>

<samp>(bit-and-not x y)</samp><br>
<samp>(bit-and-not x y & more)</samp><br>

---

 <samp>
(__bit-and-not__ x y)<br>
</samp>
 <samp>
(__bit-and-not__ x y & more)<br>
</samp>

---

Bitwise "and" `x` with bitwise "not" `y`.  Same as `x & ~y` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-and-not 2r1100 2r1010)
;;=> 4
;; 4 = 2r0100
```

Same numbers in decimal:

```clj
(bit-and-not 12 10)
;;=> 4
```

Same result using `bit-and` and `bit-not`:

```clj
(bit-and 12 (bit-not 10))
;;=> 4
```



---

###### See Also:

[`cljs.core/bit-and`](../cljs.core/bit-and.md)<br>
[`cljs.core/bit-not`](../cljs.core/bit-not.md)<br>

---


Source docstring:

```
Bitwise and with complement
```


Function code @ [github]():

```clj
(defn bit-and-not
  ([x y] (cljs.core/bit-and-not x y))
  ([x y & more]
     (reduce bit-and-not (cljs.core/bit-and-not x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---

Macro code @ [github]():

```clj
(core/defmacro ^::ana/numeric bit-and-not
  ([x y] (core/list 'js* "(~{} & ~~{})" x y))
  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---


###### External doc links:

[`clojure.core/bit-and-not` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-and-not)<br>
[`clojure.core/bit-and-not` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-and-not/)<br>
[`clojure.core/bit-and-not` @ crossclj](http://crossclj.info/fun/clojure.core/bit-and-not.html)<br>
[`cljs.core/bit-and-not` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-and-not.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-and-not.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise \"and\" `x` with bitwise \"not\" `y`.  Same as `x & ~y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-and-not",
 :signature ["[x y]" "[x y & more]"],
 :name-encode "bit-and-not",
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :clj-equiv {:full-name "clojure.core/bit-and-not",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-and-not"},
 :related ["cljs.core/bit-and" "cljs.core/bit-not"],
 :full-name-encode "cljs.core/bit-and-not",
 :source {:code "(defn bit-and-not\n  ([x y] (cljs.core/bit-and-not x y))\n  ([x y & more]\n     (reduce bit-and-not (cljs.core/bit-and-not x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2603 2607],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/core.cljs#L2603-L2607"},
 :extra-sources [{:code "(core/defmacro ^::ana/numeric bit-and-not\n  ([x y] (core/list 'js* \"(~{} & ~~{})\" x y))\n  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.9.14",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [1107 1109],
                  :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/core.cljc#L1107-L1109"}],
 :usage ["(bit-and-not x y)" "(bit-and-not x y & more)"],
 :examples [{:id "16f35d",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-and-not 2r1100 2r1010)\n;;=> 4\n;; 4 = 2r0100\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-and-not 12 10)\n;;=> 4\n```\n\nSame result using `bit-and` and `bit-not`:\n\n```clj\n(bit-and 12 (bit-not 10))\n;;=> 4\n```"}],
 :full-name "cljs.core/bit-and-not",
 :docstring "Bitwise and with complement",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-and-not.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-and-not"]))
```

-->
