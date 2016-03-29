## ~~cljs.core/unchecked-substract-int~~


> __MOVED__, please see [`cljs.core/unchecked-subtract-int`](../cljs.core/unchecked-subtract-int.md)

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2277"><img valign="middle" alt="[×] 0.0-2277" title="Removed in 0.0-2277" src="https://img.shields.io/badge/×-0.0--2277-red.svg"></a> </td>
</tr>
</table>

<samp>(unchecked-substract-int x)</samp><br>
<samp>(unchecked-substract-int x y)</samp><br>
<samp>(unchecked-substract-int x y & more)</samp><br>

---

 <samp>
(__unchecked-substract-int__ x)<br>
</samp>
 <samp>
(__unchecked-substract-int__ x y)<br>
</samp>
 <samp>
(__unchecked-substract-int__ x y & more)<br>
</samp>

---





Source docstring:

```
If no ys are supplied, returns the negation of x, else subtracts
the ys from x and returns the result.
```


Source code @ [github]():

```clj
(defn ^number unchecked-substract-int
  ([x] (cljs.core/unchecked-subtract-int x))
  ([x y] (cljs.core/unchecked-subtract-int x y))
  ([x y & more] (reduce unchecked-substract-int (cljs.core/unchecked-subtract-int x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/unchecked-substract-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-substract-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-substract-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:moved "cljs.core/unchecked-subtract-int",
 :return-type number,
 :ns "cljs.core",
 :name "unchecked-substract-int",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"] ["-" "0.0-2277"]],
 :type "function",
 :full-name-encode "cljs.core/unchecked-substract-int",
 :source {:code "(defn ^number unchecked-substract-int\n  ([x] (cljs.core/unchecked-subtract-int x))\n  ([x y] (cljs.core/unchecked-subtract-int x y))\n  ([x y & more] (reduce unchecked-substract-int (cljs.core/unchecked-subtract-int x y) more)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1812 1817]},
 :usage ["(unchecked-substract-int x)"
         "(unchecked-substract-int x y)"
         "(unchecked-substract-int x y & more)"],
 :full-name "cljs.core/unchecked-substract-int",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result.",
 :removed {:in "0.0-2277", :last-seen "0.0-2268"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-substract-int"]))
```

-->
