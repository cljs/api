## cljs.core/update-in



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/update-in</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/update-in)
</td>
</tr>
</table>


 <samp>
(__update-in__ m \[k & ks\] f)<br>
</samp>
 <samp>
(__update-in__ m \[k & ks\] f a)<br>
</samp>
 <samp>
(__update-in__ m \[k & ks\] f a b)<br>
</samp>
 <samp>
(__update-in__ m \[k & ks\] f a b c)<br>
</samp>
 <samp>
(__update-in__ m \[k & ks\] f a b c & args)<br>
</samp>

---

"Updates" a value in a nested associative structure, where `ks` is a sequence of
keys and `f` is a function that will take the old value and any supplied
arguments and return the new value. Returns a new nested structure.

If any levels do not exist, hash-maps will be created.



---


###### See Also:

[`cljs.core/assoc-in`](../cljs.core/assoc-in.md)<br>
[`cljs.core/get-in`](../cljs.core/get-in.md)<br>

---


Source docstring:

```
'Updates' a value in a nested associative structure, where ks is a
sequence of keys and f is a function that will take the old value
and any supplied args and return the new value, and returns a new
nested structure.  If any levels do not exist, hash-maps will be
created.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2330-L2339):

```clj
(defn update-in
  ([m [k & ks] f & args]
   (if ks
     (assoc m k (apply update-in (get m k) ks f args))
     (assoc m k (apply f (get m k) args)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2330-2339](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2330-L2339)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/update-in` @ clojuredocs](http://clojuredocs.org/clojure.core/update-in)<br>
[`clojure.core/update-in` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/update-in/)<br>
[`clojure.core/update-in` @ crossclj](http://crossclj.info/fun/clojure.core/update-in.html)<br>
[`cljs.core/update-in` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/update-in.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/update-in.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "\"Updates\" a value in a nested associative structure, where `ks` is a sequence of\nkeys and `f` is a function that will take the old value and any supplied\narguments and return the new value. Returns a new nested structure.\n\nIf any levels do not exist, hash-maps will be created.",
 :ns "cljs.core",
 :name "update-in",
 :signature ["[m [k & ks] f]"
             "[m [k & ks] f a]"
             "[m [k & ks] f a b]"
             "[m [k & ks] f a b c]"
             "[m [k & ks] f a b c & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/assoc-in" "cljs.core/get-in"],
 :full-name-encode "cljs.core/update-in",
 :source {:code "(defn update-in\n  ([m [k & ks] f & args]\n   (if ks\n     (assoc m k (apply update-in (get m k) ks f args))\n     (assoc m k (apply f (get m k) args)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2330 2339]},
 :full-name "cljs.core/update-in",
 :clj-symbol "clojure.core/update-in",
 :docstring "'Updates' a value in a nested associative structure, where ks is a\nsequence of keys and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nnested structure.  If any levels do not exist, hash-maps will be\ncreated."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/update-in"]))
```

-->
