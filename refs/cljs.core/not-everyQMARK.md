## cljs.core/not-every?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not-every?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not-every?)
</td>
</tr>
</table>


 <samp>
(__not-every?__ pred coll)<br>
</samp>

---

Returns false if `(pred x)` is logical true for every `x` in `coll`, else true.



---


###### See Also:

[`cljs.core/every?`](../cljs.core/everyQMARK.md)<br>
[`cljs.core/not-any?`](../cljs.core/not-anyQMARK.md)<br>
[`cljs.core/some`](../cljs.core/some.md)<br>

---


Source docstring:

```
Returns false if (pred x) is logical true for every x in
coll, else true.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L3300-L3303):

```clj
(defn ^boolean not-every?
  [pred coll] (not (every? pred coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3300-3303](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L3300-L3303)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/not-every?` @ clojuredocs](http://clojuredocs.org/clojure.core/not-every_q)<br>
[`clojure.core/not-every?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/not-every%3F/)<br>
[`clojure.core/not-every?` @ crossclj](http://crossclj.info/fun/clojure.core/not-every%3F.html)<br>
[`cljs.core/not-every?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/not-every%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/not-everyQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns false if `(pred x)` is logical true for every `x` in `coll`, else true.",
 :return-type boolean,
 :ns "cljs.core",
 :name "not-every?",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/every?" "cljs.core/not-any?" "cljs.core/some"],
 :full-name-encode "cljs.core/not-everyQMARK",
 :source {:code "(defn ^boolean not-every?\n  [pred coll] (not (every? pred coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3300 3303]},
 :full-name "cljs.core/not-every?",
 :clj-symbol "clojure.core/not-every?",
 :docstring "Returns false if (pred x) is logical true for every x in\ncoll, else true."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not-every?"]))
```

-->
