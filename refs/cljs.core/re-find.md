## cljs.core/re-find



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-find</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-find)
</td>
</tr>
</table>


 <samp>
(__re-find__ re s)<br>
</samp>

---

Returns the first regex match, if any, of `s` to `re`, using `re.exec(s)`.

Returns a vector, containing first the matching substring, then any capturing
groups if the regular expression contains capturing groups.



---




Source docstring:

```
Returns the first regex match, if any, of s to re, using
re.exec(s). Returns a vector, containing first the matching
substring, then any capturing groups if the regular expression contains
capturing groups.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L7954-L7966):

```clj
(defn re-find
  [re s]
  (if (string? s)
    (let [matches (.exec re s)]
      (when-not (nil? matches)
        (if (== (count matches) 1)
          (first matches)
          (vec matches))))
    (throw (js/TypeError. "re-find must match against a string."))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7954-7966](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L7954-L7966)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/re-find` @ clojuredocs](http://clojuredocs.org/clojure.core/re-find)<br>
[`clojure.core/re-find` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/re-find/)<br>
[`clojure.core/re-find` @ crossclj](http://crossclj.info/fun/clojure.core/re-find.html)<br>
[`cljs.core/re-find` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/re-find.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/re-find.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the first regex match, if any, of `s` to `re`, using `re.exec(s)`.\n\nReturns a vector, containing first the matching substring, then any capturing\ngroups if the regular expression contains capturing groups.",
 :ns "cljs.core",
 :name "re-find",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/re-find",
 :source {:code "(defn re-find\n  [re s]\n  (if (string? s)\n    (let [matches (.exec re s)]\n      (when-not (nil? matches)\n        (if (== (count matches) 1)\n          (first matches)\n          (vec matches))))\n    (throw (js/TypeError. \"re-find must match against a string.\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7954 7966]},
 :full-name "cljs.core/re-find",
 :clj-symbol "clojure.core/re-find",
 :docstring "Returns the first regex match, if any, of s to re, using\nre.exec(s). Returns a vector, containing first the matching\nsubstring, then any capturing groups if the regular expression contains\ncapturing groups."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/re-find"]))
```

-->
