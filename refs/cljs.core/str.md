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


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L1448-L1463):

```clj
(defn str
  ([] "")
  ([x] (cond
        (symbol? x) (. x (substring 2 (alength x)))
        (keyword? x) (str* ":" (. x (substring 2 (alength x))))
        (nil? x) ""
        :else (. x (toString))))
  ([x & ys]
     ((fn [sb more]
        (if more
          (recur (. sb  (append (str (first more)))) (next more))
          (str* sb)))
      (gstring/StringBuffer. (str x)) ys)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1448-1463](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L1448-L1463)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L175-L179):

```clj
(defmacro str [& xs]
  (let [strs (->> (repeat (count xs) "cljs.core.str(~{})")
                  (interpose ",")
                  (apply core/str))]
   (concat (list 'js* (core/str "[" strs "].join('')")) xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:175-179](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L175-L179)</ins>
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
 :source {:code "(defn str\n  ([] \"\")\n  ([x] (cond\n        (symbol? x) (. x (substring 2 (alength x)))\n        (keyword? x) (str* \":\" (. x (substring 2 (alength x))))\n        (nil? x) \"\"\n        :else (. x (toString))))\n  ([x & ys]\n     ((fn [sb more]\n        (if more\n          (recur (. sb  (append (str (first more)))) (next more))\n          (str* sb)))\n      (gstring/StringBuffer. (str x)) ys)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1448 1463]},
 :extra-sources [{:code "(defmacro str [& xs]\n  (let [strs (->> (repeat (count xs) \"cljs.core.str(~{})\")\n                  (interpose \",\")\n                  (apply core/str))]\n   (concat (list 'js* (core/str \"[\" strs \"].join('')\")) xs)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1535",
                  :filename "src/clj/cljs/core.clj",
                  :lines [175 179]}],
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