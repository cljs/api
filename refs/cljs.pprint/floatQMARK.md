## cljs.pprint/float?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__float?__ n)<br>
</samp>

---





Source docstring:

```
Returns true if n is an float.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/pprint.cljs#L54-L60):

```clj
(defn ^boolean float?
  [n]
  (and (number? n)
       (not ^boolean (js/isNaN n))
       (not (identical? n js/Infinity))
       (not (== (js/parseFloat n) (js/parseInt n 10)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:54-60](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/pprint.cljs#L54-L60)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.pprint/float?` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/float%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/floatQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.pprint",
 :name "float?",
 :signature ["[n]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint/floatQMARK",
 :source {:code "(defn ^boolean float?\n  [n]\n  (and (number? n)\n       (not ^boolean (js/isNaN n))\n       (not (identical? n js/Infinity))\n       (not (== (js/parseFloat n) (js/parseInt n 10)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [54 60]},
 :full-name "cljs.pprint/float?",
 :docstring "Returns true if n is an float."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/float?"]))
```

-->
