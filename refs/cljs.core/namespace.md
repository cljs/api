## cljs.core/namespace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/namespace</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/namespace)
</td>
</tr>
</table>


 <samp>
(__namespace__ x)<br>
</samp>

---

Returns the namespace string of a possibly namespace-qualified keyword or symbol.

Returns [`nil`][doc:syntax/nil] if not present.

[doc:syntax/nil]:../syntax/nil.md

---

###### Examples:

With namespaces:

```clj
(namespace :foo/bar)
;;=> "foo"

(namespace 'foo/bar)
;;=> "foo"
```

Without namespaces:

```clj
(namespace :foo)
;;=> nil

(namespace 'foo)
;;=> nil
```

Strings have no concept of a namespace:

```clj
(name "foo/bar")
;;=> nil
```



---

###### See Also:

[`cljs.core/name`](../cljs.core/name.md)<br>

---


Source docstring:

```
Returns the namespace String of a symbol or keyword, or nil if not present.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L2614-L2619):

```clj
(defn namespace
  [x]
  (if (implements? INamed x)
    (-namespace ^not-native x)
    (throw (js/Error. (str "Doesn't support namespace: " x)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2614-2619](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L2614-L2619)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/namespace` @ clojuredocs](http://clojuredocs.org/clojure.core/namespace)<br>
[`clojure.core/namespace` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/namespace/)<br>
[`clojure.core/namespace` @ crossclj](http://crossclj.info/fun/clojure.core/namespace.html)<br>
[`cljs.core/namespace` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/namespace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/namespace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the namespace string of a possibly namespace-qualified keyword or symbol.\n\nReturns [doc:syntax/nil] if not present.",
 :ns "cljs.core",
 :name "namespace",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/name"],
 :full-name-encode "cljs.core/namespace",
 :source {:code "(defn namespace\n  [x]\n  (if (implements? INamed x)\n    (-namespace ^not-native x)\n    (throw (js/Error. (str \"Doesn't support namespace: \" x)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2614 2619]},
 :examples [{:id "5bd3b4",
             :content "With namespaces:\n\n```clj\n(namespace :foo/bar)\n;;=> \"foo\"\n\n(namespace 'foo/bar)\n;;=> \"foo\"\n```\n\nWithout namespaces:\n\n```clj\n(namespace :foo)\n;;=> nil\n\n(namespace 'foo)\n;;=> nil\n```\n\nStrings have no concept of a namespace:\n\n```clj\n(name \"foo/bar\")\n;;=> nil\n```"}],
 :full-name "cljs.core/namespace",
 :clj-symbol "clojure.core/namespace",
 :docstring "Returns the namespace String of a symbol or keyword, or nil if not present."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/namespace"]))
```

-->
