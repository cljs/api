## cljs.core/aget



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aget</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aget)
</td>
</tr>
</table>


 <samp>
(__aget__ array i)<br>
</samp>
 <samp>
(__aget__ array i & idxs)<br>
</samp>

---

Returns the value at index `i` of a JavaScript array.

```clj
(def a #js [1 2 3])
(aget a 0)
;;=> 1
```

Retrieve nested elements with the additional `idxs` arguments.

```clj
(def a #js [1 2 #js [3 4]])
(aget a 2 0)
;;=> 3
```

For JavaScript objects, use [`goog.object/get`] or the multi-arity [`goog.object/getValueByKeys`].

```clj
(require 'goog.object)
(def obj #js {:foo #js {:bar 2}})

(goog.object/get obj "foo")
;;=> #js {:bar 2} 

(goog.object/getValueByKeys obj "foo" "bar")
;;=> 2
```

[`goog.object/get`]:http://google.github.io/closure-library/api/namespace_goog_object.html#get
[`goog.object/getValueByKeys`]:http://google.github.io/closure-library/api/namespace_goog_object.html#getValueByKeys



---


###### See Also:

[`cljs.core/..`](../cljs.core/DOTDOT.md)<br>
[`cljs.core/aset`](../cljs.core/aset.md)<br>
[`cljs.core/get`](../cljs.core/get.md)<br>
[`cljs.core/nth`](../cljs.core/nth.md)<br>

---


Source docstring:

```
Returns the value at the index.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L90-L95):

```clj
(defn aget
  ([array i]
     (cljs.core/aget array i))
  ([array i & idxs]
     (apply aget (aget array i) idxs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:90-95](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L90-L95)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/core.clj#L106-L111):

```clj
(defmacro aget
  ([a i]
     (list 'js* "(~{}[~{}])" a i))
  ([a i & idxs]
     (let [astr (apply core/str (repeat (count idxs) "[~{}]"))]
      `(~'js* ~(core/str "(~{}[~{}]" astr ")") ~a ~i ~@idxs))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1424
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:106-111](https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/core.clj#L106-L111)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/aget` @ clojuredocs](http://clojuredocs.org/clojure.core/aget)<br>
[`clojure.core/aget` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/aget/)<br>
[`clojure.core/aget` @ crossclj](http://crossclj.info/fun/clojure.core/aget.html)<br>
[`cljs.core/aget` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/aget.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/aget.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the value at index `i` of a JavaScript array.\n\n```clj\n(def a #js [1 2 3])\n(aget a 0)\n;;=> 1\n```\n\nRetrieve nested elements with the additional `idxs` arguments.\n\n```clj\n(def a #js [1 2 #js [3 4]])\n(aget a 2 0)\n;;=> 3\n```\n\nFor JavaScript objects, use [`goog.object/get`] or the multi-arity [`goog.object/getValueByKeys`].\n\n```clj\n(require 'goog.object)\n(def obj #js {:foo #js {:bar 2}})\n\n(goog.object/get obj \"foo\")\n;;=> #js {:bar 2} \n\n(goog.object/getValueByKeys obj \"foo\" \"bar\")\n;;=> 2\n```\n\n[`goog.object/get`]:http://google.github.io/closure-library/api/namespace_goog_object.html#get\n[`goog.object/getValueByKeys`]:http://google.github.io/closure-library/api/namespace_goog_object.html#getValueByKeys",
 :ns "cljs.core",
 :name "aget",
 :signature ["[array i]" "[array i & idxs]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/.."
           "cljs.core/aset"
           "cljs.core/get"
           "cljs.core/nth"],
 :full-name-encode "cljs.core/aget",
 :source {:code "(defn aget\n  ([array i]\n     (cljs.core/aget array i))\n  ([array i & idxs]\n     (apply aget (aget array i) idxs)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [90 95]},
 :extra-sources [{:code "(defmacro aget\n  ([a i]\n     (list 'js* \"(~{}[~{}])\" a i))\n  ([a i & idxs]\n     (let [astr (apply core/str (repeat (count idxs) \"[~{}]\"))]\n      `(~'js* ~(core/str \"(~{}[~{}]\" astr \")\") ~a ~i ~@idxs))))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1424",
                  :filename "src/clj/cljs/core.clj",
                  :lines [106 111]}],
 :full-name "cljs.core/aget",
 :clj-symbol "clojure.core/aget",
 :docstring "Returns the value at the index."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/aget"]))
```

-->
