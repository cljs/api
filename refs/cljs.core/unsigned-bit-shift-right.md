## cljs.core/unsigned-bit-shift-right



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2080"><img valign="middle" alt="[+] 0.0-2080" title="Added in 0.0-2080" src="https://img.shields.io/badge/+-0.0--2080-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__unsigned-bit-shift-right__ x n)<br>
</samp>

---

Bitwise shift right with zero fill



---


###### See Also:

[`cljs.core/bit-shift-right`](../cljs.core/bit-shift-right.md)<br>

---


Source docstring:

```
Bitwise shift right with zero fill
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L1764-L1766):

```clj
(defn unsigned-bit-shift-right
  [x n] (cljs.core/unsigned-bit-shift-right x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1764-1766](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L1764-L1766)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/core.clj#L545-L546):

```clj
(defmacro ^::ana/numeric unsigned-bit-shift-right [x n]
  (core/list 'js* "(~{} >>> ~{})" x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2227
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:545-546](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/core.clj#L545-L546)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.core/unsigned-bit-shift-right` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unsigned-bit-shift-right.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unsigned-bit-shift-right.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise shift right with zero fill",
 :ns "cljs.core",
 :name "unsigned-bit-shift-right",
 :signature ["[x n]"],
 :history [["+" "0.0-2080"]],
 :type "function/macro",
 :related ["cljs.core/bit-shift-right"],
 :full-name-encode "cljs.core/unsigned-bit-shift-right",
 :source {:code "(defn unsigned-bit-shift-right\n  [x n] (cljs.core/unsigned-bit-shift-right x n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1764 1766]},
 :extra-sources [{:code "(defmacro ^::ana/numeric unsigned-bit-shift-right [x n]\n  (core/list 'js* \"(~{} >>> ~{})\" x n))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2227",
                  :filename "src/clj/cljs/core.clj",
                  :lines [545 546]}],
 :full-name "cljs.core/unsigned-bit-shift-right",
 :docstring "Bitwise shift right with zero fill"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unsigned-bit-shift-right"]))
```

-->
