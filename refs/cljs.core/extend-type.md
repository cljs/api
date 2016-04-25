## cljs.core/extend-type



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/extend-type</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend-type)
</td>
</tr>
</table>

<samp>(extend-type type-sym & impls)</samp><br>

---

 <samp>
(__extend-type__ type-sym & impls)<br>
</samp>

---

Extend a [type] to implement one or more [protocols].

`type-sym` can be the result of a [`deftype`][doc:cljs.core/deftype] or any JS constructor
function (e.g. `js/Date`).  But when targetting JS base types (e.g.
`js/Number`, `js/String`), you must use special _type symbols_ instead.  These
type symbols are associated with type strings deduced by [`goog/typeOf`]:

| type symbol  | corresponding `goog/typeOf` value |
|--------------|-------------|
| `nil`        | `"null"` |
| `object`     | `"object"` |
| `string`     | `"string"` |
| `number`     | `"number"` |
| `array`      | `"array"` |
| `function`   | `"function"` |
| `boolean`    | `"boolean"` |

`type-sym` can also be specified as `default` in order to provide default
implementations for protocols.

[`goog/typeOf`]:http://google.github.io/closure-library/api/namespace_goog.html#typeOf

[doc:cljs.core/deftype]:../cljs.core/deftype.md

---


###### See Also:

[`cljs.core/extend-protocol`](../cljs.core/extend-protocol.md)<br>

---


Source docstring:

```
Extend a type to a series of protocols. Useful when you are
supplying the definitions explicitly inline. Propagates the
type as a type hint on the first argument of all fns.

type-sym may be

 * default, meaning the definitions will apply for any value,
   unless an extend-type exists for one of the more specific
   cases below.
 * nil, meaning the definitions will apply for the nil value.
 * any of object, boolean, number, string, array, or function,
   indicating the definitions will apply for values of the
   associated base JavaScript types. Note that, for example,
   string should be used instead of js/String.
 * a JavaScript type not covered by the previous list, such
   as js/RegExp.
 * a type defined by deftype or defrecord.

(extend-type MyType
  ICounted
  (-count [c] ...)
  Foo
  (bar [x y] ...)
  (baz ([x] ...) ([x y & zs] ...))
```


Source code @ [github]():

```clj
(core/defmacro extend-type
  [type-sym & impls]
  (core/let [env &env
             _ (validate-impls env impls)
             resolve (partial resolve-var env)
             impl-map (->impl-map impls)
             impl-map (if ('#{boolean number} type-sym)
                        (type-hint-impl-map type-sym impl-map)
                        impl-map)
             [type assign-impls] (core/if-let [type (base-type type-sym)]
                                   [type base-assign-impls]
                                   [(resolve type-sym) proto-assign-impls])]
    (core/when (core/and (:extending-base-js-type cljs.analyzer/*cljs-warnings*)
            (js-base-type type-sym))
      (cljs.analyzer/warning :extending-base-js-type env
        {:current-symbol type-sym :suggested-symbol (js-base-type type-sym)}))
    `(do ~@(mapcat #(assign-impls env resolve type-sym type %) impl-map))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/extend-type` @ clojuredocs](http://clojuredocs.org/clojure.core/extend-type)<br>
[`clojure.core/extend-type` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/extend-type/)<br>
[`clojure.core/extend-type` @ crossclj](http://crossclj.info/fun/clojure.core/extend-type.html)<br>
[`cljs.core/extend-type` @ crossclj](http://crossclj.info/fun/cljs.core/extend-type.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/extend-type.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Extend a [type] to implement one or more [protocols].\n\n`type-sym` can be the result of a [doc:cljs.core/deftype] or any JS constructor\nfunction (e.g. `js/Date`).  But when targetting JS base types (e.g.\n`js/Number`, `js/String`), you must use special _type symbols_ instead.  These\ntype symbols are associated with type strings deduced by [`goog/typeOf`]:\n\n| type symbol  | corresponding `goog/typeOf` value |\n|--------------|-------------|\n| `nil`        | `\"null\"` |\n| `object`     | `\"object\"` |\n| `string`     | `\"string\"` |\n| `number`     | `\"number\"` |\n| `array`      | `\"array\"` |\n| `function`   | `\"function\"` |\n| `boolean`    | `\"boolean\"` |\n\n`type-sym` can also be specified as `default` in order to provide default\nimplementations for protocols.\n\n[`goog/typeOf`]:http://google.github.io/closure-library/api/namespace_goog.html#typeOf",
 :ns "cljs.core",
 :name "extend-type",
 :signature ["[type-sym & impls]"],
 :name-encode "extend-type",
 :history [["+" "0.0-927"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/extend-type",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend-type"},
 :related ["cljs.core/extend-protocol"],
 :full-name-encode "cljs.core/extend-type",
 :source {:code "(core/defmacro extend-type\n  [type-sym & impls]\n  (core/let [env &env\n             _ (validate-impls env impls)\n             resolve (partial resolve-var env)\n             impl-map (->impl-map impls)\n             impl-map (if ('#{boolean number} type-sym)\n                        (type-hint-impl-map type-sym impl-map)\n                        impl-map)\n             [type assign-impls] (core/if-let [type (base-type type-sym)]\n                                   [type base-assign-impls]\n                                   [(resolve type-sym) proto-assign-impls])]\n    (core/when (core/and (:extending-base-js-type cljs.analyzer/*cljs-warnings*)\n            (js-base-type type-sym))\n      (cljs.analyzer/warning :extending-base-js-type env\n        {:current-symbol type-sym :suggested-symbol (js-base-type type-sym)}))\n    `(do ~@(mapcat #(assign-impls env resolve type-sym type %) impl-map))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [1502 1542],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/clojure/cljs/core.cljc#L1502-L1542"},
 :usage ["(extend-type type-sym & impls)"],
 :full-name "cljs.core/extend-type",
 :docstring "Extend a type to a series of protocols. Useful when you are\nsupplying the definitions explicitly inline. Propagates the\ntype as a type hint on the first argument of all fns.\n\ntype-sym may be\n\n * default, meaning the definitions will apply for any value,\n   unless an extend-type exists for one of the more specific\n   cases below.\n * nil, meaning the definitions will apply for the nil value.\n * any of object, boolean, number, string, array, or function,\n   indicating the definitions will apply for values of the\n   associated base JavaScript types. Note that, for example,\n   string should be used instead of js/String.\n * a JavaScript type not covered by the previous list, such\n   as js/RegExp.\n * a type defined by deftype or defrecord.\n\n(extend-type MyType\n  ICounted\n  (-count [c] ...)\n  Foo\n  (bar [x y] ...)\n  (baz ([x] ...) ([x y & zs] ...))",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/extend-type.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/extend-type"]))
```

-->
