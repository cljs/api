## cljs.core/js->clj



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js->clj__ x)<br>
</samp>
 <samp>
(__js->clj__ x & opts)<br>
</samp>

---

Recursively transforms JavaScript arrays into ClojureScript vectors, and
JavaScript objects into ClojureScript maps.

With option `{:keywordize-keys true}` will convert object fields from strings to
keywords.

Note that `js->clj` is not optimized for speed and the [transit.cljs] library is
recommended for parsing large amounts of JSON data.

[transit.cljs]:http://swannodette.github.io/2014/07/26/transit--clojurescript/



---

###### Examples:

Parse a JSON string:

```clj
(def json "{\"foo\": 1, \"bar\": 2, \"baz\": [1,2,3]}")
(def a (.parse js/JSON json))
;;=> #js {:foo 1, :bar 2, :baz #js [1 2 3]}
```

Convert JSON data `a` to ClojureScript data:

```clj
(js->clj a)
;;=> {"foo" 1, "bar" 2, "baz" [1 2 3]}

(js->clj a :keywordize-keys true)
;;=> {:foo 1, :bar 2, :baz [1 2 3]}
```



---

###### See Also:

[`cljs.core/clj->js`](../cljs.core/clj-GTjs.md)<br>

---


Source docstring:

```
Recursively transforms JavaScript arrays into ClojureScript
vectors, and JavaScript objects into ClojureScript maps.  With
option ':keywordize-keys true' will convert object fields from
strings to keywords.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L8982-L9010):

```clj
(defn js->clj
  ([x] (js->clj x {:keywordize-keys false}))
  ([x & opts]
    (let [{:keys [keywordize-keys]} opts
          keyfn (if keywordize-keys keyword str)
          f (fn thisfn [x]
              (cond
                (satisfies? IEncodeClojure x)
                (-js->clj x (apply array-map opts))

                (seq? x)
                (doall (map thisfn x))

                (coll? x)
                (into (empty x) (map thisfn x))

                (array? x)
                (vec (map thisfn x))
                 
                (identical? (type x) js/Object)
                (into {} (for [k (js-keys x)]
                           [(keyfn k) (thisfn (aget x k))]))

                :else x))]
      (f x))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8982-9010](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L8982-L9010)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/js->clj` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/js-%3Eclj.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-GTclj.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Recursively transforms JavaScript arrays into ClojureScript vectors, and\nJavaScript objects into ClojureScript maps.\n\nWith option `{:keywordize-keys true}` will convert object fields from strings to\nkeywords.\n\nNote that `js->clj` is not optimized for speed and the [transit.cljs] library is\nrecommended for parsing large amounts of JSON data.\n\n[transit.cljs]:http://swannodette.github.io/2014/07/26/transit--clojurescript/",
 :ns "cljs.core",
 :name "js->clj",
 :signature ["[x]" "[x & opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/clj->js"],
 :full-name-encode "cljs.core/js-GTclj",
 :source {:code "(defn js->clj\n  ([x] (js->clj x {:keywordize-keys false}))\n  ([x & opts]\n    (let [{:keys [keywordize-keys]} opts\n          keyfn (if keywordize-keys keyword str)\n          f (fn thisfn [x]\n              (cond\n                (satisfies? IEncodeClojure x)\n                (-js->clj x (apply array-map opts))\n\n                (seq? x)\n                (doall (map thisfn x))\n\n                (coll? x)\n                (into (empty x) (map thisfn x))\n\n                (array? x)\n                (vec (map thisfn x))\n                 \n                (identical? (type x) js/Object)\n                (into {} (for [k (js-keys x)]\n                           [(keyfn k) (thisfn (aget x k))]))\n\n                :else x))]\n      (f x))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8982 9010]},
 :examples [{:id "61d263",
             :content "Parse a JSON string:\n\n```clj\n(def json \"{\\\"foo\\\": 1, \\\"bar\\\": 2, \\\"baz\\\": [1,2,3]}\")\n(def a (.parse js/JSON json))\n;;=> #js {:foo 1, :bar 2, :baz #js [1 2 3]}\n```\n\nConvert JSON data `a` to ClojureScript data:\n\n```clj\n(js->clj a)\n;;=> {\"foo\" 1, \"bar\" 2, \"baz\" [1 2 3]}\n\n(js->clj a :keywordize-keys true)\n;;=> {:foo 1, :bar 2, :baz [1 2 3]}\n```"}],
 :full-name "cljs.core/js->clj",
 :docstring "Recursively transforms JavaScript arrays into ClojureScript\nvectors, and JavaScript objects into ClojureScript maps.  With\noption ':keywordize-keys true' will convert object fields from\nstrings to keywords."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js->clj"]))
```

-->
