## cljs.core/char



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/char</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char)
</td>
</tr>
</table>


 <samp>
(__char__ x)<br>
</samp>

---

Converts a number `x` to a character using `String.fromCharCode(x)` from
JavaScript.



---

###### Examples:

```clj
(char 81)
;;=> "Q"

(char "Q")
;;=> "Q"

(char "foo")
;; Error: Argument to char must be a character or number
```



---



Source docstring:

```
Coerce to char
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/cljs/core.cljs#L1491-L1497):

```clj
(defn char
  [x]
  (cond
    (number? x) (.fromCharCode js/String x)
    (and (string? x) (== (.-length x) 1)) x
    :else (throw (js/Error. "Argument to char must be a character or number"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1885
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1491-1497](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/cljs/core.cljs#L1491-L1497)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/char` @ clojuredocs](http://clojuredocs.org/clojure.core/char)<br>
[`clojure.core/char` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/char/)<br>
[`clojure.core/char` @ crossclj](http://crossclj.info/fun/clojure.core/char.html)<br>
[`cljs.core/char` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/char.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/char.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Converts a number `x` to a character using `String.fromCharCode(x)` from\nJavaScript.",
 :ns "cljs.core",
 :name "char",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core/char",
 :source {:code "(defn char\n  [x]\n  (cond\n    (number? x) (.fromCharCode js/String x)\n    (and (string? x) (== (.-length x) 1)) x\n    :else (throw (js/Error. \"Argument to char must be a character or number\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1885",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1491 1497]},
 :examples [{:id "4e1a56",
             :content "```clj\n(char 81)\n;;=> \"Q\"\n\n(char \"Q\")\n;;=> \"Q\"\n\n(char \"foo\")\n;; Error: Argument to char must be a character or number\n```"}],
 :full-name "cljs.core/char",
 :clj-symbol "clojure.core/char",
 :docstring "Coerce to char"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/char"]))
```

-->
