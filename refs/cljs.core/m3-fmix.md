## cljs.core/m3-fmix



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__m3-fmix__ h1 len)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L444-L451):

```clj
(defn ^number m3-fmix [h1 len]
  (as-> h1 h1
    (bit-xor h1 len)
    (bit-xor h1 (unsigned-bit-shift-right h1 16))
    (imul h1 0x85ebca6b)
    (bit-xor h1 (unsigned-bit-shift-right h1 13))
    (imul h1 0xc2b2ae35)
    (bit-xor h1 (unsigned-bit-shift-right h1 16))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:444-451](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L444-L451)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/m3-fmix` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/m3-fmix.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/m3-fmix.cljsdoc
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
 :name "m3-fmix",
 :signature ["[h1 len]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core/m3-fmix",
 :source {:code "(defn ^number m3-fmix [h1 len]\n  (as-> h1 h1\n    (bit-xor h1 len)\n    (bit-xor h1 (unsigned-bit-shift-right h1 16))\n    (imul h1 0x85ebca6b)\n    (bit-xor h1 (unsigned-bit-shift-right h1 13))\n    (imul h1 0xc2b2ae35)\n    (bit-xor h1 (unsigned-bit-shift-right h1 16))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/core.cljs",
          :lines [444 451]},
 :full-name "cljs.core/m3-fmix"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-fmix"]))
```

-->
