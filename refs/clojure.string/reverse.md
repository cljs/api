## clojure.string/reverse



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/reverse</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/reverse)
</td>
</tr>
</table>


 <samp>
(__reverse__ s)<br>
</samp>

---

Returns `s` with its characters reversed.



---




Source docstring:

```
Returns s with its characters reversed.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1835/src/cljs/clojure/string.cljs#L18-L21):

```clj
(defn reverse
  [s]
  (.. s (split "") (reverse) (join "")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1835
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:18-21](https://github.com/clojure/clojurescript/blob/r1835/src/cljs/clojure/string.cljs#L18-L21)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/reverse` @ clojuredocs](http://clojuredocs.org/clojure.string/reverse)<br>
[`clojure.string/reverse` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/reverse/)<br>
[`clojure.string/reverse` @ crossclj](http://crossclj.info/fun/clojure.string/reverse.html)<br>
[`clojure.string/reverse` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/reverse.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/reverse.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns `s` with its characters reversed.",
 :ns "clojure.string",
 :name "reverse",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/reverse",
 :source {:code "(defn reverse\n  [s]\n  (.. s (split \"\") (reverse) (join \"\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/cljs/clojure/string.cljs",
          :lines [18 21]},
 :full-name "clojure.string/reverse",
 :clj-symbol "clojure.string/reverse",
 :docstring "Returns s with its characters reversed."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/reverse"]))
```

-->
