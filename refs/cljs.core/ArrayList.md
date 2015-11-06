## cljs.core/ArrayList



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ArrayList.__ arr)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L8005-L8011):

```clj
(deftype ArrayList [^:mutable arr]
  Object
  (add [_ x] (.push arr x))
  (size [_] (alength arr))
  (clear [_] (set! arr (array)))
  (isEmpty [_] (zero? (alength arr)))
  (toArray [_] arr))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8005-8011](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L8005-L8011)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ArrayList` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ArrayList.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ArrayList.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ArrayList",
 :type "type",
 :signature ["[arr]"],
 :source {:code "(deftype ArrayList [^:mutable arr]\n  Object\n  (add [_ x] (.push arr x))\n  (size [_] (alength arr))\n  (clear [_] (set! arr (array)))\n  (isEmpty [_] (zero? (alength arr)))\n  (toArray [_] arr))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8005 8011]},
 :full-name "cljs.core/ArrayList",
 :full-name-encode "cljs.core/ArrayList",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayList"]))
```

-->
