## cljs.core/int-rotate-left



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__int-rotate-left__ x n)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L767-L770):

```clj
(defn ^number int-rotate-left [x n]
  (bit-or
    (bit-shift-left x n)
    (unsigned-bit-shift-right x (- n))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:767-770](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L767-L770)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/int-rotate-left` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/int-rotate-left.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/int-rotate-left.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type number,
 :ns "cljs.core",
 :name "int-rotate-left",
 :signature ["[x n]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core/int-rotate-left",
 :source {:code "(defn ^number int-rotate-left [x n]\n  (bit-or\n    (bit-shift-left x n)\n    (unsigned-bit-shift-right x (- n))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [767 770]},
 :full-name "cljs.core/int-rotate-left"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/int-rotate-left"]))
```

-->
