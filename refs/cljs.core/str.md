## cljs.core/str



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/str)
</td>
</tr>
</table>


 <samp>
(__str__)<br>
</samp>
 <samp>
(__str__ x)<br>
</samp>
 <samp>
(__str__ x & ys)<br>
</samp>

---

`(str)` and `(str nil)` return the empty string.

`(str x)` returns `x.toString()`.

With more than one argument, returns the concatenation of the `str` values of
the arguments.



---




Source docstring:

```
With no args, returns the empty string. With one arg x, returns
x.toString().  (str nil) returns the empty string. With more than
one arg, returns the concatenation of the str values of the args.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L2033-L2045):

```clj
(defn str
  ([] "")
  ([x] (if (nil? x)
         ""
         (.toString x)))
  ([x & ys]
    (loop [sb (StringBuffer. (str x)) more ys]
      (if more
        (recur (. sb  (append (str (first more)))) (next more))
        (.toString sb)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2033-2045](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L2033-L2045)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/clj/cljs/core.clj#L207-L232):

```clj
(defmacro str [& xs]
  ;; Eagerly stringify any string or char literals.
  (let [clean-xs (reduce (fn [acc x]
                     (core/cond
                       (core/or (core/string? x) (core/char? x))
                       (if (core/string? (peek acc))
                         (conj (pop acc) (core/str (peek acc) x))
                         (conj acc (core/str x)))
                       (core/nil? x) acc
                       :else (conj acc x)))
                   [] xs)
        ;; clean-xs now has no nils, chars, or string-adjoining-string. bools,
        ;; ints and floats will be emitted literally to allow JS string coersion.
        strs (->> clean-xs
                  (map #(if (core/or (core/string? %) (core/integer? %)
                                     (core/float? %) (core/true? %)
                                     (core/false? %))
                            "~{}"
                            "cljs.core.str.cljs$core$IFn$_invoke$arity$1(~{})"))
                  (interpose "+")
                  (apply core/str))]
    ;; Google closure advanced compile will stringify and concat strings and
    ;; numbers at compilation time.
    (list* 'js* (core/str (if (core/string? (first clean-xs)) "(" "(''+")
                          strs ")")
           clean-xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:207-232](https://github.com/clojure/clojurescript/blob/r2307/src/clj/cljs/core.clj#L207-L232)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/str` @ clojuredocs](http://clojuredocs.org/clojure.core/str)<br>
[`clojure.core/str` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/str/)<br>
[`clojure.core/str` @ crossclj](http://crossclj.info/fun/clojure.core/str.html)<br>
[`cljs.core/str` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`(str)` and `(str nil)` return the empty string.\n\n`(str x)` returns `x.toString()`.\n\nWith more than one argument, returns the concatenation of the `str` values of\nthe arguments.",
 :ns "cljs.core",
 :name "str",
 :signature ["[]" "[x]" "[x & ys]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :full-name-encode "cljs.core/str",
 :source {:code "(defn str\n  ([] \"\")\n  ([x] (if (nil? x)\n         \"\"\n         (.toString x)))\n  ([x & ys]\n    (loop [sb (StringBuffer. (str x)) more ys]\n      (if more\n        (recur (. sb  (append (str (first more)))) (next more))\n        (.toString sb)))))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2033 2045]},
 :extra-sources [{:code "(defmacro str [& xs]\n  ;; Eagerly stringify any string or char literals.\n  (let [clean-xs (reduce (fn [acc x]\n                     (core/cond\n                       (core/or (core/string? x) (core/char? x))\n                       (if (core/string? (peek acc))\n                         (conj (pop acc) (core/str (peek acc) x))\n                         (conj acc (core/str x)))\n                       (core/nil? x) acc\n                       :else (conj acc x)))\n                   [] xs)\n        ;; clean-xs now has no nils, chars, or string-adjoining-string. bools,\n        ;; ints and floats will be emitted literally to allow JS string coersion.\n        strs (->> clean-xs\n                  (map #(if (core/or (core/string? %) (core/integer? %)\n                                     (core/float? %) (core/true? %)\n                                     (core/false? %))\n                            \"~{}\"\n                            \"cljs.core.str.cljs$core$IFn$_invoke$arity$1(~{})\"))\n                  (interpose \"+\")\n                  (apply core/str))]\n    ;; Google closure advanced compile will stringify and concat strings and\n    ;; numbers at compilation time.\n    (list* 'js* (core/str (if (core/string? (first clean-xs)) \"(\" \"(''+\")\n                          strs \")\")\n           clean-xs)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2307",
                  :filename "src/clj/cljs/core.clj",
                  :lines [207 232]}],
 :full-name "cljs.core/str",
 :clj-symbol "clojure.core/str",
 :docstring "With no args, returns the empty string. With one arg x, returns\nx.toString().  (str nil) returns the empty string. With more than\none arg, returns the concatenation of the str values of the args."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/str"]))
```

-->
