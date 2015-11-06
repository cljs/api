## cljs.core/doto



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doto</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doto)
</td>
</tr>
</table>


 <samp>
(__doto__ x & forms)<br>
</samp>

---





Source docstring:

```
Evaluates x then calls all of the methods and functions with the
value of x supplied at the front of the given arguments.  The forms
are evaluated in order.  Returns x.

(doto (new java.util.HashMap) (.put "a" 1) (.put "b" 2))
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta1/src/clj/clojure/core.clj#L3698-L3713):

```clj
(defmacro doto
  [x & forms]
    (let [gx (gensym)]
      `(let [~gx ~x]
         ~@(map (fn [f]
                  (if (seq? f)
                    `(~(first f) ~gx ~@(next f))
                    `(~f ~gx)))
                forms)
         ~gx)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0-beta1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3698-3713](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta1/src/clj/clojure/core.clj#L3698-L3713)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/doto` @ clojuredocs](http://clojuredocs.org/clojure.core/doto)<br>
[`clojure.core/doto` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/doto/)<br>
[`clojure.core/doto` @ crossclj](http://crossclj.info/fun/clojure.core/doto.html)<br>
[`cljs.core/doto` @ crossclj](http://crossclj.info/fun/cljs.core/doto.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/doto.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "doto",
 :signature ["[x & forms]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/doto",
 :source {:code "(defmacro doto\n  [x & forms]\n    (let [gx (gensym)]\n      `(let [~gx ~x]\n         ~@(map (fn [f]\n                  (if (seq? f)\n                    `(~(first f) ~gx ~@(next f))\n                    `(~f ~gx)))\n                forms)\n         ~gx)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0-beta1",
          :filename "src/clj/clojure/core.clj",
          :lines [3698 3713]},
 :full-name "cljs.core/doto",
 :clj-symbol "clojure.core/doto",
 :docstring "Evaluates x then calls all of the methods and functions with the\nvalue of x supplied at the front of the given arguments.  The forms\nare evaluated in order.  Returns x.\n\n(doto (new java.util.HashMap) (.put \"a\" 1) (.put \"b\" 2))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/doto"]))
```

-->
