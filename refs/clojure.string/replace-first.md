## clojure.string/replace-first



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/replace-first</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/replace-first)
</td>
</tr>
</table>


 <samp>
(__replace-first__ s match replacement)<br>
</samp>

---

Replaces the first instance of `match` with `replacement` in `s`.

The options for match / replacement are:

| match  | replacement |
|--------|-------------|
| string | string      |
| regex  | string      |
| regex  | function    |



---




Source docstring:

```
Replaces the first instance of match with replacement in s.
match/replacement can be:

string / string
pattern / (string or function of match).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/clojure/string.cljs#L40-L47):

```clj
(defn replace-first
  [s match replacement]
  (.replace s match replacement))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:40-47](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/clojure/string.cljs#L40-L47)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/replace-first` @ clojuredocs](http://clojuredocs.org/clojure.string/replace-first)<br>
[`clojure.string/replace-first` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/replace-first/)<br>
[`clojure.string/replace-first` @ crossclj](http://crossclj.info/fun/clojure.string/replace-first.html)<br>
[`clojure.string/replace-first` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/replace-first.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/replace-first.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Replaces the first instance of `match` with `replacement` in `s`.\n\nThe options for match / replacement are:\n\n| match  | replacement |\n|--------|-------------|\n| string | string      |\n| regex  | string      |\n| regex  | function    |",
 :ns "clojure.string",
 :name "replace-first",
 :signature ["[s match replacement]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/replace-first",
 :source {:code "(defn replace-first\n  [s match replacement]\n  (.replace s match replacement))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/clojure/string.cljs",
          :lines [40 47]},
 :full-name "clojure.string/replace-first",
 :clj-symbol "clojure.string/replace-first",
 :docstring "Replaces the first instance of match with replacement in s.\nmatch/replacement can be:\n\nstring / string\npattern / (string or function of match)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/replace-first"]))
```

-->
