## cljs.core/name



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/name</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/name)
</td>
</tr>
</table>


 <samp>
(__name__ x)<br>
</samp>

---

Returns the name string of a possibly namespace-qualified keyword or symbol.

Equivalent to [`identity`][doc:cljs.core/identity] for strings.

[doc:cljs.core/identity]:../cljs.core/identity.md

---

###### Examples:

With namespaces:

```clj
(name :foo/bar)
;;=> "bar"

(name 'foo/bar)
;;=> "bar"
```

Without namespaces:

```clj
(name :foo)
;;=> "foo"

(name 'foo)
;;=> "foo"
```

Strings have no concept of a namespace:

```clj
(name "foo/bar")
;;=> "foo/bar"

(name "foo")
;;=> "foo"
```



---

###### See Also:

[`cljs.core/namespace`](../cljs.core/namespace.md)<br>

---


Source docstring:

```
Returns the name String of a string, symbol or keyword.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/core.cljs#L8289-L8296):

```clj
(defn name
  [x]
  (if (implements? INamed x)
    (-name ^not-native x)
    (if (string? x)
      x
      (throw (js/Error. (str "Doesn't support name: " x))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8289-8296](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/core.cljs#L8289-L8296)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/name` @ clojuredocs](http://clojuredocs.org/clojure.core/name)<br>
[`clojure.core/name` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/name/)<br>
[`clojure.core/name` @ crossclj](http://crossclj.info/fun/clojure.core/name.html)<br>
[`cljs.core/name` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/name.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/name.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the name string of a possibly namespace-qualified keyword or symbol.\n\nEquivalent to [doc:cljs.core/identity] for strings.",
 :ns "cljs.core",
 :name "name",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/namespace"],
 :full-name-encode "cljs.core/name",
 :source {:code "(defn name\n  [x]\n  (if (implements? INamed x)\n    (-name ^not-native x)\n    (if (string? x)\n      x\n      (throw (js/Error. (str \"Doesn't support name: \" x))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8289 8296]},
 :examples [{:id "363fb7",
             :content "With namespaces:\n\n```clj\n(name :foo/bar)\n;;=> \"bar\"\n\n(name 'foo/bar)\n;;=> \"bar\"\n```\n\nWithout namespaces:\n\n```clj\n(name :foo)\n;;=> \"foo\"\n\n(name 'foo)\n;;=> \"foo\"\n```\n\nStrings have no concept of a namespace:\n\n```clj\n(name \"foo/bar\")\n;;=> \"foo/bar\"\n\n(name \"foo\")\n;;=> \"foo\"\n```"}],
 :full-name "cljs.core/name",
 :clj-symbol "clojure.core/name",
 :docstring "Returns the name String of a string, symbol or keyword."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/name"]))
```

-->
