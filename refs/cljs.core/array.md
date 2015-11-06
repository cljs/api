## cljs.core/array



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__array__ & args)<br>
</samp>

---

Creates a JavaScript array containing `args`.

The tagged literal `#js [1 2 3]` is equivalent to `(array 1 2 3)`



---

###### Examples:

```clj
(array 1 2 3)
;;=> #js [1 2 3]

(apply array [1 2 3])
;;=> #js [1 2 3]

#js [1 2 3]
;;=> #js [1 2 3]
```



---
###### Examples:

When creating nested JavaScript arrays, you can opt to use `clj->js` instead:

```clj
(array 1 2 (array 3 4))
;;=> #js [1 2 #js [3 4]]

(clj->js [1 2 [3 4]])
;;=> #js [1 2 #js [3 4]]
```



---

###### See Also:

[`cljs.core/aclone`](../cljs.core/aclone.md)<br>
[`cljs.core/make-array`](../cljs.core/make-array.md)<br>
[`cljs.core/clj->js`](../cljs.core/clj-GTjs.md)<br>

---


Source docstring:

```
Creates a new javascript array.
@param {...*} var_args
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L255-L265):

```clj
(defn ^array array
  [var-args]            ;; [& items]
  (let [a (js/Array. (alength (cljs.core/js-arguments)))]
    (loop [i 0]
      (if (< i (alength a))
        (do
          (aset a i (aget (cljs.core/js-arguments) i))
          (recur (inc i)))
        a))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:255-265](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L255-L265)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/core.clj#L1725-L1732):

```clj
(defmacro array [& rest]
  (let [xs-str (->> (repeat "~{}")
                    (take (count rest))
                    (interpose ",")
                    (apply core/str))]
    (vary-meta
      (list* 'js* (core/str "[" xs-str "]") rest)
      assoc :tag 'array)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:1725-1732](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/core.clj#L1725-L1732)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.core/array` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/array.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/array.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a JavaScript array containing `args`.\n\nThe tagged literal `#js [1 2 3]` is equivalent to `(array 1 2 3)`",
 :return-type array,
 :ns "cljs.core",
 :name "array",
 :signature ["[& args]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/aclone"
           "cljs.core/make-array"
           "cljs.core/clj->js"],
 :full-name-encode "cljs.core/array",
 :source {:code "(defn ^array array\n  [var-args]            ;; [& items]\n  (let [a (js/Array. (alength (cljs.core/js-arguments)))]\n    (loop [i 0]\n      (if (< i (alength a))\n        (do\n          (aset a i (aget (cljs.core/js-arguments) i))\n          (recur (inc i)))\n        a))))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [255 265]},
 :extra-sources [{:code "(defmacro array [& rest]\n  (let [xs-str (->> (repeat \"~{}\")\n                    (take (count rest))\n                    (interpose \",\")\n                    (apply core/str))]\n    (vary-meta\n      (list* 'js* (core/str \"[\" xs-str \"]\") rest)\n      assoc :tag 'array)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3263",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [1725 1732]}],
 :examples [{:id "3a546d",
             :content "```clj\n(array 1 2 3)\n;;=> #js [1 2 3]\n\n(apply array [1 2 3])\n;;=> #js [1 2 3]\n\n#js [1 2 3]\n;;=> #js [1 2 3]\n```"}
            {:id "cca945",
             :content "When creating nested JavaScript arrays, you can opt to use `clj->js` instead:\n\n```clj\n(array 1 2 (array 3 4))\n;;=> #js [1 2 #js [3 4]]\n\n(clj->js [1 2 [3 4]])\n;;=> #js [1 2 #js [3 4]]\n```"}],
 :full-name "cljs.core/array",
 :docstring "Creates a new javascript array.\n@param {...*} var_args"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array"]))
```

-->
