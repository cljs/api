## cljs.core/keyword



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keyword</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keyword)
</td>
</tr>
</table>


 <samp>
(__keyword__ name)<br>
</samp>
 <samp>
(__keyword__ ns name)<br>
</samp>

---





Source docstring:

```
Returns a Keyword with the given namespace and name.  Do not use :
in the keyword strings, it will be added automatically.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L2098-L2110):

```clj
(defn keyword
  ([name] (cond
            (keyword? name) name
            (symbol? name) (Keyword.
                             (cljs.core/namespace name)
                             (cljs.core/name name) (.-str name) nil)
            (string? name) (let [parts (.split name "/")]
                             (if (== (alength parts) 2)
                               (Keyword. (aget parts 0) (aget parts 1) name nil)
                               (Keyword. nil (aget parts 0) name nil)))))
  ([ns name] (Keyword. ns name (str (when ns (str ns "/")) name) nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2080
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2098-2110](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L2098-L2110)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/keyword` @ clojuredocs](http://clojuredocs.org/clojure.core/keyword)<br>
[`clojure.core/keyword` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/keyword/)<br>
[`clojure.core/keyword` @ crossclj](http://crossclj.info/fun/clojure.core/keyword.html)<br>
[`cljs.core/keyword` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/keyword.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/keyword.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "keyword",
 :signature ["[name]" "[ns name]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/keyword",
 :source {:code "(defn keyword\n  ([name] (cond\n            (keyword? name) name\n            (symbol? name) (Keyword.\n                             (cljs.core/namespace name)\n                             (cljs.core/name name) (.-str name) nil)\n            (string? name) (let [parts (.split name \"/\")]\n                             (if (== (alength parts) 2)\n                               (Keyword. (aget parts 0) (aget parts 1) name nil)\n                               (Keyword. nil (aget parts 0) name nil)))))\n  ([ns name] (Keyword. ns name (str (when ns (str ns \"/\")) name) nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2080",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2098 2110]},
 :full-name "cljs.core/keyword",
 :clj-symbol "clojure.core/keyword",
 :docstring "Returns a Keyword with the given namespace and name.  Do not use :\nin the keyword strings, it will be added automatically."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keyword"]))
```

-->
