## cljs.core/completing



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2341"><img valign="middle" alt="[+] 0.0-2341" title="Added in 0.0-2341" src="https://img.shields.io/badge/+-0.0--2341-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/completing</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/completing)
</td>
</tr>
</table>


 <samp>
(__completing__ f)<br>
</samp>
 <samp>
(__completing__ f cf)<br>
</samp>

---





Source docstring:

```
Takes a reducing function f of 2 args and returns a fn suitable for
transduce by adding an arity-1 signature that calls cf (default -
identity) on the result argument.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/cljs/core.cljs#L2227-L2236):

```clj
(defn completing
  ([f] (completing f identity))
  ([f cf]
    (fn
      ([] (f))
      ([x] (cf x))
      ([x y] (f x y)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2227-2236](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/cljs/core.cljs#L2227-L2236)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/completing` @ clojuredocs](http://clojuredocs.org/clojure.core/completing)<br>
[`clojure.core/completing` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/completing/)<br>
[`clojure.core/completing` @ crossclj](http://crossclj.info/fun/clojure.core/completing.html)<br>
[`cljs.core/completing` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/completing.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/completing.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "completing",
 :signature ["[f]" "[f cf]"],
 :history [["+" "0.0-2341"]],
 :type "function",
 :full-name-encode "cljs.core/completing",
 :source {:code "(defn completing\n  ([f] (completing f identity))\n  ([f cf]\n    (fn\n      ([] (f))\n      ([x] (cf x))\n      ([x y] (f x y)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2227 2236]},
 :full-name "cljs.core/completing",
 :clj-symbol "clojure.core/completing",
 :docstring "Takes a reducing function f of 2 args and returns a fn suitable for\ntransduce by adding an arity-1 signature that calls cf (default -\nidentity) on the result argument."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/completing"]))
```

-->
