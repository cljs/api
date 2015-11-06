## cljs.core/and



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/and</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/and)
</td>
</tr>
</table>


 <samp>
(__and__)<br>
</samp>
 <samp>
(__and__ x)<br>
</samp>
 <samp>
(__and__ x & next)<br>
</samp>

---

Evaluates arguments one at a time from left to right. If an argument returns
logical false (nil or false), `and` returns that value and doesn't evaluate any
of the other arguments, otherwise it returns the value of the last argument.

`(and)` returns true.



---

###### Examples:

```clj
(and)
;;=> true

(and false)
;;=> false

(and true)
;;=> true

(and true true)
;;=> true

(and true false)
;;=> false

(and false false)
;;=> false
```



---
###### Examples:

`nil` and `false` are the only falsy values and everything else is truthy:

```clj
(and "foo" "bar")
;;=> "bar"

(and "foo" nil)
;;=> nil

(and "foo" false)
;;=> false

(and nil "foo")
;;=> nil

(and false "foo")
;;=> false
```



---

###### See Also:

[`cljs.core/or`](../cljs.core/or.md)<br>
[`if`](../special/if.md)<br>

---


Source docstring:

```
Evaluates exprs one at a time, from left to right. If a form
returns logical false (nil or false), and returns that value and
doesn't evaluate any of the other expressions, otherwise it returns
the value of the last expr. (and) returns true.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2655/src/clj/cljs/core.clj#L221-L237):

```clj
(defmacro and
  ([] true)
  ([x] x)
  ([x & next]
    (let [forms (concat [x] next)]
      (if (every? #(simple-test-expr? &env %)
            (map #(cljs.analyzer/analyze &env %) forms))
        (let [and-str (->> (repeat (count forms) "(~{})")
                        (interpose " && ")
                        (apply core/str))]
          (bool-expr `(~'js* ~and-str ~@forms)))
        `(let [and# ~x]
           (if and# (and ~@next) and#))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2655
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:221-237](https://github.com/clojure/clojurescript/blob/r2655/src/clj/cljs/core.clj#L221-L237)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/and` @ clojuredocs](http://clojuredocs.org/clojure.core/and)<br>
[`clojure.core/and` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/and/)<br>
[`clojure.core/and` @ crossclj](http://crossclj.info/fun/clojure.core/and.html)<br>
[`cljs.core/and` @ crossclj](http://crossclj.info/fun/cljs.core/and.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/and.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Evaluates arguments one at a time from left to right. If an argument returns\nlogical false (nil or false), `and` returns that value and doesn't evaluate any\nof the other arguments, otherwise it returns the value of the last argument.\n\n`(and)` returns true.",
 :ns "cljs.core",
 :name "and",
 :signature ["[]" "[x]" "[x & next]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/or" "special/if"],
 :full-name-encode "cljs.core/and",
 :source {:code "(defmacro and\n  ([] true)\n  ([x] x)\n  ([x & next]\n    (let [forms (concat [x] next)]\n      (if (every? #(simple-test-expr? &env %)\n            (map #(cljs.analyzer/analyze &env %) forms))\n        (let [and-str (->> (repeat (count forms) \"(~{})\")\n                        (interpose \" && \")\n                        (apply core/str))]\n          (bool-expr `(~'js* ~and-str ~@forms)))\n        `(let [and# ~x]\n           (if and# (and ~@next) and#))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/clj/cljs/core.clj",
          :lines [221 237]},
 :examples [{:id "a39a73",
             :content "```clj\n(and)\n;;=> true\n\n(and false)\n;;=> false\n\n(and true)\n;;=> true\n\n(and true true)\n;;=> true\n\n(and true false)\n;;=> false\n\n(and false false)\n;;=> false\n```"}
            {:id "766638",
             :content "`nil` and `false` are the only falsy values and everything else is truthy:\n\n```clj\n(and \"foo\" \"bar\")\n;;=> \"bar\"\n\n(and \"foo\" nil)\n;;=> nil\n\n(and \"foo\" false)\n;;=> false\n\n(and nil \"foo\")\n;;=> nil\n\n(and false \"foo\")\n;;=> false\n```"}],
 :full-name "cljs.core/and",
 :clj-symbol "clojure.core/and",
 :docstring "Evaluates exprs one at a time, from left to right. If a form\nreturns logical false (nil or false), and returns that value and\ndoesn't evaluate any of the other expressions, otherwise it returns\nthe value of the last expr. (and) returns true."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/and"]))
```

-->
