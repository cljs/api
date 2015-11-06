## cljs.core/gensym



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/gensym</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/gensym)
</td>
</tr>
</table>


 <samp>
(__gensym__)<br>
</samp>
 <samp>
(__gensym__ prefix-string)<br>
</samp>

---





Source docstring:

```
Returns a new symbol with a unique name. If a prefix string is
supplied, the name is prefix# where # is some unique number. If
prefix is not supplied, the prefix is 'G__'.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L8822-L8830):

```clj
(defn gensym
  ([] (gensym "G__"))
  ([prefix-string]
     (when (nil? gensym_counter)
       (set! gensym_counter (atom 0)))
     (symbol (str prefix-string (swap! gensym_counter inc)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8822-8830](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L8822-L8830)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/gensym` @ clojuredocs](http://clojuredocs.org/clojure.core/gensym)<br>
[`clojure.core/gensym` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/gensym/)<br>
[`clojure.core/gensym` @ crossclj](http://crossclj.info/fun/clojure.core/gensym.html)<br>
[`cljs.core/gensym` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/gensym.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/gensym.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "gensym",
 :signature ["[]" "[prefix-string]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/gensym",
 :source {:code "(defn gensym\n  ([] (gensym \"G__\"))\n  ([prefix-string]\n     (when (nil? gensym_counter)\n       (set! gensym_counter (atom 0)))\n     (symbol (str prefix-string (swap! gensym_counter inc)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8822 8830]},
 :full-name "cljs.core/gensym",
 :clj-symbol "clojure.core/gensym",
 :docstring "Returns a new symbol with a unique name. If a prefix string is\nsupplied, the name is prefix# where # is some unique number. If\nprefix is not supplied, the prefix is 'G__'."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/gensym"]))
```

-->
