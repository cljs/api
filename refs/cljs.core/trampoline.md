## cljs.core/trampoline



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/trampoline</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/trampoline)
</td>
</tr>
</table>


 <samp>
(__trampoline__ f)<br>
</samp>
 <samp>
(__trampoline__ f & args)<br>
</samp>

---





Source docstring:

```
trampoline can be used to convert algorithms requiring mutual
recursion without stack consumption. Calls f with supplied args, if
any. If f returns a fn, calls that fn with no arguments, and
continues to repeat, until the return value is not a fn, then
returns that non-fn value. Note that if you want to return a fn as a
final value, you must wrap it in some data structure and unpack it
after trampoline returns.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L8707-L8721):

```clj
(defn trampoline
  ([f]
     (let [ret (f)]
       (if (fn? ret)
         (recur ret)
         ret)))
  ([f & args]
     (trampoline #(apply f args))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8707-8721](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L8707-L8721)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/trampoline` @ clojuredocs](http://clojuredocs.org/clojure.core/trampoline)<br>
[`clojure.core/trampoline` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/trampoline/)<br>
[`clojure.core/trampoline` @ crossclj](http://crossclj.info/fun/clojure.core/trampoline.html)<br>
[`cljs.core/trampoline` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/trampoline.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/trampoline.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "trampoline",
 :signature ["[f]" "[f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/trampoline",
 :source {:code "(defn trampoline\n  ([f]\n     (let [ret (f)]\n       (if (fn? ret)\n         (recur ret)\n         ret)))\n  ([f & args]\n     (trampoline #(apply f args))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8707 8721]},
 :full-name "cljs.core/trampoline",
 :clj-symbol "clojure.core/trampoline",
 :docstring "trampoline can be used to convert algorithms requiring mutual\nrecursion without stack consumption. Calls f with supplied args, if\nany. If f returns a fn, calls that fn with no arguments, and\ncontinues to repeat, until the return value is not a fn, then\nreturns that non-fn value. Note that if you want to return a fn as a\nfinal value, you must wrap it in some data structure and unpack it\nafter trampoline returns."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/trampoline"]))
```

-->
