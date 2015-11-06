## cljs.core/clj->js



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" title="Added in 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__clj->js__ x)<br>
</samp>

---

Recursively transforms ClojureScript values to JavaScript.

| ClojureScript |        | JavaScript |         |
|---------------|--------|------------|---------|
| Set           | `#{}`  | Array      | `[]`    |
| Vector        | `[]`   | Array      | `[]`    |
| List          | `()`   | Array      | `[]`    |
| Keyword       | `:foo` | String     | `"foo"` |
| Symbol        | `bar`  | String     | `"bar"` |
| Map           | `{}`   | Object     | `{}`    |



---

###### Examples:

```clj
(clj->js {:foo 1 :bar 2})
;;=> #js {:foo 1, :bar 2}

(clj->js [:foo "bar" 'baz])
;;=> #js ["foo" "bar" "baz"]

(clj->js [1 {:foo "bar"} 4])
;;=> #js [1 #js {:foo "bar"} 4]
```



---

###### See Also:

[`cljs.core/js->clj`](../cljs.core/js-GTclj.md)<br>

---


Source docstring:

```
Recursively transforms ClojureScript values to JavaScript.
sets/vectors/lists become Arrays, Keywords and Symbol become Strings,
Maps become Objects. Arbitrary keys are encoded to by key->js.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L7359-L7378):

```clj
(defn clj->js
   [x]
   (when-not (nil? x)
     (if (satisfies? IEncodeJS x)
       (-clj->js x)
       (cond
         (keyword? x) (name x)
         (symbol? x) (str x)
         (map? x) (let [m (js-obj)]
                    (doseq [[k v] x]
                      (aset m (key->js k) (clj->js v)))
                    m)
         (coll? x) (let [arr (array)]
                     (doseq [x (map clj->js x)]
                       (.push arr x))
                     arr)
         :else x))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7359-7378](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L7359-L7378)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/clj->js` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/clj-%3Ejs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/clj-GTjs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Recursively transforms ClojureScript values to JavaScript.\n\n| ClojureScript |        | JavaScript |         |\n|---------------|--------|------------|---------|\n| Set           | `#{}`  | Array      | `[]`    |\n| Vector        | `[]`   | Array      | `[]`    |\n| List          | `()`   | Array      | `[]`    |\n| Keyword       | `:foo` | String     | `\"foo\"` |\n| Symbol        | `bar`  | String     | `\"bar\"` |\n| Map           | `{}`   | Object     | `{}`    |",
 :ns "cljs.core",
 :name "clj->js",
 :signature ["[x]"],
 :history [["+" "0.0-1552"]],
 :type "function",
 :related ["cljs.core/js->clj"],
 :full-name-encode "cljs.core/clj-GTjs",
 :source {:code "(defn clj->js\n   [x]\n   (when-not (nil? x)\n     (if (satisfies? IEncodeJS x)\n       (-clj->js x)\n       (cond\n         (keyword? x) (name x)\n         (symbol? x) (str x)\n         (map? x) (let [m (js-obj)]\n                    (doseq [[k v] x]\n                      (aset m (key->js k) (clj->js v)))\n                    m)\n         (coll? x) (let [arr (array)]\n                     (doseq [x (map clj->js x)]\n                       (.push arr x))\n                     arr)\n         :else x))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7359 7378]},
 :examples [{:id "2b1057",
             :content "```clj\n(clj->js {:foo 1 :bar 2})\n;;=> #js {:foo 1, :bar 2}\n\n(clj->js [:foo \"bar\" 'baz])\n;;=> #js [\"foo\" \"bar\" \"baz\"]\n\n(clj->js [1 {:foo \"bar\"} 4])\n;;=> #js [1 #js {:foo \"bar\"} 4]\n```"}],
 :full-name "cljs.core/clj->js",
 :docstring "Recursively transforms ClojureScript values to JavaScript.\nsets/vectors/lists become Arrays, Keywords and Symbol become Strings,\nMaps become Objects. Arbitrary keys are encoded to by key->js."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/clj->js"]))
```

-->
