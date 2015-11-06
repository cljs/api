## cljs.core/js-obj



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-obj__ & keyvals)<br>
</samp>

---

Returns a new JavaScript object using the supplied mappings.

`keyvals` must be an even number of forms.



---

###### Examples:

```clj
(js-obj "foo" 1 "bar" 2)
;;=> #js {:foo 1, :bar 2}
```



---

###### See Also:

[``](../syntax/js-literal.md)<br>
[`cljs.core/array`](../cljs.core/array.md)<br>
[`cljs.core/clj->js`](../cljs.core/clj-GTjs.md)<br>

---




Function code @ [github](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L1135-L1139):

```clj
(defn js-obj
  ([]
     (cljs.core/js-obj))
  ([& keyvals]
     (apply gobject/create keyvals)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1135-1139](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L1135-L1139)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1859/src/clj/cljs/core.clj#L1196-L1201):

```clj
(defmacro js-obj [& rest]
  (let [kvs-str (->> (repeat "~{}:~{}")
                     (take (quot (count rest) 2))
                     (interpose ",")
                     (apply core/str))]
    (list* 'js* (core/str "{" kvs-str "}") rest)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1859
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1196-1201](https://github.com/clojure/clojurescript/blob/r1859/src/clj/cljs/core.clj#L1196-L1201)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.core/js-obj` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/js-obj.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-obj.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new JavaScript object using the supplied mappings.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "js-obj",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["syntax/js-literal" "cljs.core/array" "cljs.core/clj->js"],
 :full-name-encode "cljs.core/js-obj",
 :source {:code "(defn js-obj\n  ([]\n     (cljs.core/js-obj))\n  ([& keyvals]\n     (apply gobject/create keyvals)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1135 1139]},
 :extra-sources [{:code "(defmacro js-obj [& rest]\n  (let [kvs-str (->> (repeat \"~{}:~{}\")\n                     (take (quot (count rest) 2))\n                     (interpose \",\")\n                     (apply core/str))]\n    (list* 'js* (core/str \"{\" kvs-str \"}\") rest)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1859",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1196 1201]}],
 :examples [{:id "657cd7",
             :content "```clj\n(js-obj \"foo\" 1 \"bar\" 2)\n;;=> #js {:foo 1, :bar 2}\n```"}],
 :full-name "cljs.core/js-obj"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-obj"]))
```

-->
