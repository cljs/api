## cljs.core/get-validator



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get-validator</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-validator)
</td>
</tr>
</table>


 <samp>
(__get-validator__ a)<br>
</samp>

---

Returns the validator function for atom `a`.



---


###### See Also:

[`cljs.core/atom`](../cljs.core/atom.md)<br>
[`cljs.core/set-validator!`](../cljs.core/set-validatorBANG.md)<br>

---


Source docstring:

```
Gets the validator-fn for a var/ref/agent/atom.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L4042-L4045):

```clj
(defn get-validator
  [iref]
  (.-validator iref))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4042-4045](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L4042-L4045)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/get-validator` @ clojuredocs](http://clojuredocs.org/clojure.core/get-validator)<br>
[`clojure.core/get-validator` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/get-validator/)<br>
[`clojure.core/get-validator` @ crossclj](http://crossclj.info/fun/clojure.core/get-validator.html)<br>
[`cljs.core/get-validator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/get-validator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/get-validator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the validator function for atom `a`.",
 :ns "cljs.core",
 :name "get-validator",
 :signature ["[a]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom" "cljs.core/set-validator!"],
 :full-name-encode "cljs.core/get-validator",
 :source {:code "(defn get-validator\n  [iref]\n  (.-validator iref))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4042 4045]},
 :full-name "cljs.core/get-validator",
 :clj-symbol "clojure.core/get-validator",
 :docstring "Gets the validator-fn for a var/ref/agent/atom."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/get-validator"]))
```

-->
