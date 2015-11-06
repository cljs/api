## clojure.zip/next



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/next</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/next)
</td>
</tr>
</table>


 <samp>
(__next__ loc)<br>
</samp>

---





Source docstring:

```
Moves to the next loc in the hierarchy, depth-first. When reaching
the end, returns a distinguished loc detectable via end?. If already
at the end, stays there.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/clojure/zip.cljs#L206-L219):

```clj
(defn next
  [loc]
    (if (= :end (loc 1))
      loc
      (or 
       (and (branch? loc) (down loc))
       (right loc)
       (loop [p loc]
         (if (up p)
           (or (right (up p)) (recur (up p)))
           [(node p) :end])))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:206-219](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/clojure/zip.cljs#L206-L219)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/next` @ clojuredocs](http://clojuredocs.org/clojure.zip/next)<br>
[`clojure.zip/next` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/next/)<br>
[`clojure.zip/next` @ crossclj](http://crossclj.info/fun/clojure.zip/next.html)<br>
[`clojure.zip/next` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/next.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/next.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "next",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/next",
 :source {:code "(defn next\n  [loc]\n    (if (= :end (loc 1))\n      loc\n      (or \n       (and (branch? loc) (down loc))\n       (right loc)\n       (loop [p loc]\n         (if (up p)\n           (or (right (up p)) (recur (up p)))\n           [(node p) :end])))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [206 219]},
 :full-name "clojure.zip/next",
 :clj-symbol "clojure.zip/next",
 :docstring "Moves to the next loc in the hierarchy, depth-first. When reaching\nthe end, returns a distinguished loc detectable via end?. If already\nat the end, stays there."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/next"]))
```

-->
