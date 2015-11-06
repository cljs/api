## cljs.core/subs



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/subs</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/subs)
</td>
</tr>
</table>


 <samp>
(__subs__ s start)<br>
</samp>
 <samp>
(__subs__ s start end)<br>
</samp>

---

Returns the substring of `s` beginning at `start` inclusive, and ending at `end`
exclusive.

`end` defaults to the length of the string.



---




Source docstring:

```
Returns the substring of s beginning at start inclusive, and ending
at end (defaults to length of string), exclusive.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L2472-L2476):

```clj
(defn subs
  ([s start] (.substring s start))
  ([s start end] (.substring s start end)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2472-2476](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L2472-L2476)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/subs` @ clojuredocs](http://clojuredocs.org/clojure.core/subs)<br>
[`clojure.core/subs` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/subs/)<br>
[`clojure.core/subs` @ crossclj](http://crossclj.info/fun/clojure.core/subs.html)<br>
[`cljs.core/subs` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/subs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/subs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the substring of `s` beginning at `start` inclusive, and ending at `end`\nexclusive.\n\n`end` defaults to the length of the string.",
 :ns "cljs.core",
 :name "subs",
 :signature ["[s start]" "[s start end]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/subs",
 :source {:code "(defn subs\n  ([s start] (.substring s start))\n  ([s start end] (.substring s start end)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2472 2476]},
 :full-name "cljs.core/subs",
 :clj-symbol "clojure.core/subs",
 :docstring "Returns the substring of s beginning at start inclusive, and ending\nat end (defaults to length of string), exclusive."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/subs"]))
```

-->
