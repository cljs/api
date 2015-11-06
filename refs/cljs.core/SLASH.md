## cljs.core//



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core//</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core//)
</td>
</tr>
</table>


 <samp>
(__/__ x)<br>
</samp>
 <samp>
(__/__ x y)<br>
</samp>
 <samp>
(__/__ x y & more)<br>
</samp>

---

If no denominators are supplied, returns 1/numerator, else returns numerator
divided by all of the denominators.



---

###### Examples:

```clj
(/ 6 3)
;;=> 2

(/ 6 3 2)
;;=> 1

(/ 10)
;;=> 0.1

(/ 1 3)
;;=> 0.3333333333333333
```



---

###### See Also:

[`cljs.core/*`](../cljs.core/STAR.md)<br>
[`cljs.core/quot`](../cljs.core/quot.md)<br>

---


Source docstring:

```
If no denominators are supplied, returns 1/numerator,
else returns numerator divided by all of the denominators.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L1407-L1412):

```clj
(defn /
  ([x] (/ 1 x))
  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//
  ([x y & more] (reduce / (/ x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1407-1412](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L1407-L1412)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L346-L349):

```clj
(defmacro /
  ([x] `(/ 1 ~x))
  ([x y] (list 'js* "(~{} / ~{})" x y))
  ([x y & more] `(/ (/ ~x ~y) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:346-349](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L346-L349)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core//` @ clojuredocs](http://clojuredocs.org/clojure.core/_fs)<br>
[`clojure.core//` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/%2F/)<br>
[`clojure.core//` @ crossclj](http://crossclj.info/fun/clojure.core/%2F.html)<br>
[`cljs.core//` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/%2F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/SLASH.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "If no denominators are supplied, returns 1/numerator, else returns numerator\ndivided by all of the denominators.",
 :ns "cljs.core",
 :name "/",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/*" "cljs.core/quot"],
 :full-name-encode "cljs.core/SLASH",
 :source {:code "(defn /\n  ([x] (/ 1 x))\n  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//\n  ([x y & more] (reduce / (/ x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1407 1412]},
 :extra-sources [{:code "(defmacro /\n  ([x] `(/ 1 ~x))\n  ([x y] (list 'js* \"(~{} / ~{})\" x y))\n  ([x y & more] `(/ (/ ~x ~y) ~@more)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1843",
                  :filename "src/clj/cljs/core.clj",
                  :lines [346 349]}],
 :examples [{:id "824bb7",
             :content "```clj\n(/ 6 3)\n;;=> 2\n\n(/ 6 3 2)\n;;=> 1\n\n(/ 10)\n;;=> 0.1\n\n(/ 1 3)\n;;=> 0.3333333333333333\n```"}],
 :full-name "cljs.core//",
 :clj-symbol "clojure.core//",
 :docstring "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core//"]))
```

-->
