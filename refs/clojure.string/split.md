## clojure.string/split



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/split</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/split)
</td>
</tr>
</table>


 <samp>
(__split__ s re)<br>
</samp>
 <samp>
(__split__ s re limit)<br>
</samp>

---

Splits string on a regular expression. Optional argument limit is the maximum
number of splits. Not lazy. Returns vector of the splits.



---


###### See Also:

[`cljs.core/subs`](../cljs.core/subs.md)<br>
[`clojure.string/replace`](../clojure.string/replace.md)<br>
[`clojure.string/split-lines`](../clojure.string/split-lines.md)<br>

---


Source docstring:

```
Splits string on a regular expression. Optional argument limit is
the maximum number of splits. Not lazy. Returns vector of the splits.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/clojure/string.cljs#L104-L125):

```clj
(defn split
  ([s re]
     (split s re 0))
    ([s re limit]
     (discard-trailing-if-needed limit
       (if (= (str re) "/(?:)/")
         (split-with-empty-regex s limit)
         (if (< limit 1)
           (vec (.split (str s) re))
           (loop [s s
                  limit limit
                  parts []]
             (if (= limit 1)
               (conj parts s)
               (if-let [m (re-find re s)]
                 (let [index (.indexOf s m)]
                   (recur (.substring s (+ index (count m)))
                          (dec limit)
                          (conj parts (.substring s 0 index))))
                 (conj parts s)))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:104-125](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/clojure/string.cljs#L104-L125)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/split` @ clojuredocs](http://clojuredocs.org/clojure.string/split)<br>
[`clojure.string/split` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/split/)<br>
[`clojure.string/split` @ crossclj](http://crossclj.info/fun/clojure.string/split.html)<br>
[`clojure.string/split` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/split.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/split.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Splits string on a regular expression. Optional argument limit is the maximum\nnumber of splits. Not lazy. Returns vector of the splits.",
 :ns "clojure.string",
 :name "split",
 :signature ["[s re]" "[s re limit]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/subs"
           "clojure.string/replace"
           "clojure.string/split-lines"],
 :full-name-encode "clojure.string/split",
 :source {:code "(defn split\n  ([s re]\n     (split s re 0))\n    ([s re limit]\n     (discard-trailing-if-needed limit\n       (if (= (str re) \"/(?:)/\")\n         (split-with-empty-regex s limit)\n         (if (< limit 1)\n           (vec (.split (str s) re))\n           (loop [s s\n                  limit limit\n                  parts []]\n             (if (= limit 1)\n               (conj parts s)\n               (if-let [m (re-find re s)]\n                 (let [index (.indexOf s m)]\n                   (recur (.substring s (+ index (count m)))\n                          (dec limit)\n                          (conj parts (.substring s 0 index))))\n                 (conj parts s)))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/clojure/string.cljs",
          :lines [104 125]},
 :full-name "clojure.string/split",
 :clj-symbol "clojure.string/split",
 :docstring "Splits string on a regular expression. Optional argument limit is\nthe maximum number of splits. Not lazy. Returns vector of the splits."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/split"]))
```

-->
