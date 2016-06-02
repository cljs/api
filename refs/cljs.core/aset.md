## cljs.core/aset



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aset</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset)
</td>
</tr>
</table>

<samp>(aset array i val)</samp><br>
<samp>(aset array idx idx2 & idxv)</samp><br>

---

 <samp>
(__aset__ array i val)<br>
</samp>
 <samp>
(__aset__ array idx idx2 & idxv)<br>
</samp>

---

Sets `val` at index `i` in a JavaScript array.

```clj
(def a #js [1 2 3])
(aset a 0 "foo")
a
;;=> #js ["foo" 2 3]
```

Set nested elements with the additional `idxs` arguments.

```clj
(def a #js [1 2 #js [3 4]])
(aset a 2 0 "foo")
a
;;=> #js [1 2 #js ["foo" 4]]
```

For JavaScript objects, use [`goog.object/set`].

[`goog.object/set`]:http://google.github.io/closure-library/api/namespace_goog_object.html#set

```clj
(require 'goog.object)
(def obj #js {:foo 1})

(goog.object/set obj "foo" "bar")
obj
;;=> #js {:foo "bar"}
```



---


###### See Also:

[`cljs.core/aget`](../cljs.core/aget.md)<br>
[`set!`](../special/setBANG.md)<br>
[`cljs.core/assoc-in`](../cljs.core/assoc-in.md)<br>

---


Source docstring:

```
Sets the value at the index.
```


Function code @ [github]():

```clj
(defn aset
  ([array i val]
    (cljs.core/aset array i val))
  ([array idx idx2 & idxv]
    (apply aset (aget array idx) idx2 idxv)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---

Macro code @ [github]():

```clj
(core/defmacro aset
  ([a i v]
   (core/list 'js* "(~{}[~{}] = ~{})" a i v))
  ([a idx idx2 & idxv]
   (core/let [n    (core/dec (count idxv))
              astr (apply core/str (repeat n "[~{}]"))]
     `(~'js* ~(core/str "(~{}[~{}][~{}]" astr " = ~{})") ~a ~idx ~idx2 ~@idxv))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---


###### External doc links:

[`clojure.core/aset` @ clojuredocs](http://clojuredocs.org/clojure.core/aset)<br>
[`clojure.core/aset` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/aset/)<br>
[`clojure.core/aset` @ crossclj](http://crossclj.info/fun/clojure.core/aset.html)<br>
[`cljs.core/aset` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/aset.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/aset.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Sets `val` at index `i` in a JavaScript array.\n\n```clj\n(def a #js [1 2 3])\n(aset a 0 \"foo\")\na\n;;=> #js [\"foo\" 2 3]\n```\n\nSet nested elements with the additional `idxs` arguments.\n\n```clj\n(def a #js [1 2 #js [3 4]])\n(aset a 2 0 \"foo\")\na\n;;=> #js [1 2 #js [\"foo\" 4]]\n```\n\nFor JavaScript objects, use [`goog.object/set`].\n\n[`goog.object/set`]:http://google.github.io/closure-library/api/namespace_goog_object.html#set\n\n```clj\n(require 'goog.object)\n(def obj #js {:foo 1})\n\n(goog.object/set obj \"foo\" \"bar\")\nobj\n;;=> #js {:foo \"bar\"}\n```",
 :ns "cljs.core",
 :name "aset",
 :signature ["[array i val]" "[array idx idx2 & idxv]"],
 :name-encode "aset",
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :clj-equiv {:full-name "clojure.core/aset",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset"},
 :related ["cljs.core/aget" "special/set!" "cljs.core/assoc-in"],
 :full-name-encode "cljs.core/aset",
 :source {:code "(defn aset\n  ([array i val]\n    (cljs.core/aset array i val))\n  ([array idx idx2 & idxv]\n    (apply aset (aget array idx) idx2 idxv)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [402 407],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/core.cljs#L402-L407"},
 :extra-sources [{:code "(core/defmacro aset\n  ([a i v]\n   (core/list 'js* \"(~{}[~{}] = ~{})\" a i v))\n  ([a idx idx2 & idxv]\n   (core/let [n    (core/dec (count idxv))\n              astr (apply core/str (repeat n \"[~{}]\"))]\n     `(~'js* ~(core/str \"(~{}[~{}][~{}]\" astr \" = ~{})\") ~a ~idx ~idx2 ~@idxv))))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.9.14",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [941 947],
                  :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/core.cljc#L941-L947"}],
 :usage ["(aset array i val)" "(aset array idx idx2 & idxv)"],
 :full-name "cljs.core/aset",
 :docstring "Sets the value at the index.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/aset.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/aset"]))
```

-->
