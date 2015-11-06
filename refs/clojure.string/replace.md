## clojure.string/replace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/replace)
</td>
</tr>
</table>


 <samp>
(__replace__ s match replacement)<br>
</samp>

---

Replaces all instance of `match` with `replacement` in `s`.

The options for match / replacement are:

| match  | replacement |
|--------|-------------|
| string | string      |
| regex  | string      |
| regex  | function    |



---


###### See Also:

[`cljs.core/subs`](../cljs.core/subs.md)<br>
[`clojure.string/split`](../clojure.string/split.md)<br>
[`clojure.string/replace-first`](../clojure.string/replace-first.md)<br>

---


Source docstring:

```
Replaces all instance of match with replacement in s.
match/replacement can be:

string / string
pattern / (string or function of match).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/clojure/string.cljs#L27-L38):

```clj
(defn replace
  [s match replacement]
  (cond (string? match)
        (.replace s (js/RegExp. (gstring/regExpEscape match) "g") replacement)
        (.hasOwnProperty match "source")
        (.replace s (js/RegExp. (.-source match) "g") replacement)
        :else (throw (str "Invalid match arg: " match))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:27-38](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/clojure/string.cljs#L27-L38)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/replace` @ clojuredocs](http://clojuredocs.org/clojure.string/replace)<br>
[`clojure.string/replace` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/replace/)<br>
[`clojure.string/replace` @ crossclj](http://crossclj.info/fun/clojure.string/replace.html)<br>
[`clojure.string/replace` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/replace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/replace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Replaces all instance of `match` with `replacement` in `s`.\n\nThe options for match / replacement are:\n\n| match  | replacement |\n|--------|-------------|\n| string | string      |\n| regex  | string      |\n| regex  | function    |",
 :ns "clojure.string",
 :name "replace",
 :signature ["[s match replacement]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/subs"
           "clojure.string/split"
           "clojure.string/replace-first"],
 :full-name-encode "clojure.string/replace",
 :source {:code "(defn replace\n  [s match replacement]\n  (cond (string? match)\n        (.replace s (js/RegExp. (gstring/regExpEscape match) \"g\") replacement)\n        (.hasOwnProperty match \"source\")\n        (.replace s (js/RegExp. (.-source match) \"g\") replacement)\n        :else (throw (str \"Invalid match arg: \" match))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/clojure/string.cljs",
          :lines [27 38]},
 :full-name "clojure.string/replace",
 :clj-symbol "clojure.string/replace",
 :docstring "Replaces all instance of match with replacement in s.\nmatch/replacement can be:\n\nstring / string\npattern / (string or function of match)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/replace"]))
```

-->
