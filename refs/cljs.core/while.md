## cljs.core/while



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/while)
</td>
</tr>
</table>


 <samp>
(__while__ test & body)<br>
</samp>

---

Repeatedly executes `body` while `test` expression is true. Presumes some
side-effect will cause `test` to become false or nil.

Returns nil.



---


###### See Also:

[`cljs.core/loop`](../cljs.core/loop.md)<br>

---


Source docstring:

```
Repeatedly executes body while test expression is true. Presumes
some side-effect will cause test to become false/nil. Returns nil
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/clj/clojure/core.clj#L6087-L6095):

```clj
(defmacro while
  [test & body]
  `(loop []
     (when ~test
       ~@body
       (recur))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.8.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:6087-6095](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/clj/clojure/core.clj#L6087-L6095)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/while` @ clojuredocs](http://clojuredocs.org/clojure.core/while)<br>
[`clojure.core/while` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/while/)<br>
[`clojure.core/while` @ crossclj](http://crossclj.info/fun/clojure.core/while.html)<br>
[`cljs.core/while` @ crossclj](http://crossclj.info/fun/cljs.core/while.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/while.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Repeatedly executes `body` while `test` expression is true. Presumes some\nside-effect will cause `test` to become false or nil.\n\nReturns nil.",
 :ns "cljs.core",
 :name "while",
 :signature ["[test & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/loop"],
 :full-name-encode "cljs.core/while",
 :source {:code "(defmacro while\n  [test & body]\n  `(loop []\n     (when ~test\n       ~@body\n       (recur))))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.8.0",
          :filename "src/clj/clojure/core.clj",
          :lines [6087 6095]},
 :full-name "cljs.core/while",
 :clj-symbol "clojure.core/while",
 :docstring "Repeatedly executes body while test expression is true. Presumes\nsome side-effect will cause test to become false/nil. Returns nil"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/while"]))
```

-->
