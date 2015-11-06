## cljs.core/fnil



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fnil</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fnil)
</td>
</tr>
</table>


 <samp>
(__fnil__ f x)<br>
</samp>
 <samp>
(__fnil__ f x y)<br>
</samp>
 <samp>
(__fnil__ f x y z)<br>
</samp>

---

Takes a function `f`, and returns a function that calls `f`, replacing a nil
first argument to `f` with the supplied value `x`. Higher arity versions can
replace arguments in the second and third positions (`y`, `z`).

Note that the function `f` can take any number of arguments, not just the one(s)
being nil-patched.



---




Source docstring:

```
Takes a function f, and returns a function that calls f, replacing
a nil first argument to f with the supplied value x. Higher arity
versions can replace arguments in the second and third
positions (y, z). Note that the function f can take any number of
arguments, not just the one(s) being nil-patched.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1542-L1563):

```clj
(defn fnil
  ([f x]
   (fn
     ([a] (f (if (nil? a) x a)))
     ([a b] (f (if (nil? a) x a) b))
     ([a b c] (f (if (nil? a) x a) b c))
     ([a b c & ds] (apply f (if (nil? a) x a) b c ds))))
  ([f x y]
   (fn
     ([a b] (f (if (nil? a) x a) (if (nil? b) y b)))
     ([a b c] (f (if (nil? a) x a) (if (nil? b) y b) c))
     ([a b c & ds] (apply f (if (nil? a) x a) (if (nil? b) y b) c ds))))
  ([f x y z]
   (fn
     ([a b] (f (if (nil? a) x a) (if (nil? b) y b)))
     ([a b c] (f (if (nil? a) x a) (if (nil? b) y b) (if (nil? c) z c)))
     ([a b c & ds] (apply f (if (nil? a) x a) (if (nil? b) y b) (if (nil? c) z c) ds)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1542-1563](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1542-L1563)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/fnil` @ clojuredocs](http://clojuredocs.org/clojure.core/fnil)<br>
[`clojure.core/fnil` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/fnil/)<br>
[`clojure.core/fnil` @ crossclj](http://crossclj.info/fun/clojure.core/fnil.html)<br>
[`cljs.core/fnil` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/fnil.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/fnil.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Takes a function `f`, and returns a function that calls `f`, replacing a nil\nfirst argument to `f` with the supplied value `x`. Higher arity versions can\nreplace arguments in the second and third positions (`y`, `z`).\n\nNote that the function `f` can take any number of arguments, not just the one(s)\nbeing nil-patched.",
 :ns "cljs.core",
 :name "fnil",
 :signature ["[f x]" "[f x y]" "[f x y z]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/fnil",
 :source {:code "(defn fnil\n  ([f x]\n   (fn\n     ([a] (f (if (nil? a) x a)))\n     ([a b] (f (if (nil? a) x a) b))\n     ([a b c] (f (if (nil? a) x a) b c))\n     ([a b c & ds] (apply f (if (nil? a) x a) b c ds))))\n  ([f x y]\n   (fn\n     ([a b] (f (if (nil? a) x a) (if (nil? b) y b)))\n     ([a b c] (f (if (nil? a) x a) (if (nil? b) y b) c))\n     ([a b c & ds] (apply f (if (nil? a) x a) (if (nil? b) y b) c ds))))\n  ([f x y z]\n   (fn\n     ([a b] (f (if (nil? a) x a) (if (nil? b) y b)))\n     ([a b c] (f (if (nil? a) x a) (if (nil? b) y b) (if (nil? c) z c)))\n     ([a b c & ds] (apply f (if (nil? a) x a) (if (nil? b) y b) (if (nil? c) z c) ds)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1542 1563]},
 :full-name "cljs.core/fnil",
 :clj-symbol "clojure.core/fnil",
 :docstring "Takes a function f, and returns a function that calls f, replacing\na nil first argument to f with the supplied value x. Higher arity\nversions can replace arguments in the second and third\npositions (y, z). Note that the function f can take any number of\narguments, not just the one(s) being nil-patched."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/fnil"]))
```

-->
