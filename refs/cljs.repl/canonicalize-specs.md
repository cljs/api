## cljs.repl/canonicalize-specs



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" title="Added in 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__canonicalize-specs__ specs)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L530-L536):

```clj
(defn canonicalize-specs [specs]
  (letfn [(canonicalize [quoted-spec-or-kw]
            (if (keyword? quoted-spec-or-kw)
              quoted-spec-or-kw
              (as-> (second quoted-spec-or-kw) spec
                (if (vector? spec) spec [spec]))))]
    (map canonicalize specs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:530-536](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L530-L536)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/canonicalize-specs` @ crossclj](http://crossclj.info/fun/cljs.repl/canonicalize-specs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/canonicalize-specs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "canonicalize-specs",
 :type "function",
 :signature ["[specs]"],
 :source {:code "(defn canonicalize-specs [specs]\n  (letfn [(canonicalize [quoted-spec-or-kw]\n            (if (keyword? quoted-spec-or-kw)\n              quoted-spec-or-kw\n              (as-> (second quoted-spec-or-kw) spec\n                (if (vector? spec) spec [spec]))))]\n    (map canonicalize specs)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/repl.clj",
          :lines [530 536]},
 :full-name "cljs.repl/canonicalize-specs",
 :full-name-encode "cljs.repl/canonicalize-specs",
 :history [["+" "0.0-3148"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/canonicalize-specs"]))
```

-->
