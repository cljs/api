## cljs.compiler.api/requires-compilation?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__requires-compilation?__ src dest)<br>
</samp>
 <samp>
(__requires-compilation?__ src dest opts)<br>
</samp>
 <samp>
(__requires-compilation?__ state src dest opts)<br>
</samp>

---





Source docstring:

```
Return true if the src file requires compilation.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/clojure/cljs/compiler/api.clj#L48-L60):

```clj
(defn requires-compilation?
  ([src dest] (requires-compilation? src dest nil))
  ([src dest opts]
   (requires-compilation?
     (if-not (nil? env/*compiler*)
       env/*compiler*
       (env/default-compiler-env opts))
     src dest opts))
  ([state src dest opts]
   (env/with-compiler-env state
     (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]
       (comp/requires-compilation? src dest opts)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.28
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:48-60](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/clojure/cljs/compiler/api.clj#L48-L60)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.compiler.api/requires-compilation?` @ crossclj](http://crossclj.info/fun/cljs.compiler.api/requires-compilation%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api/requires-compilationQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.compiler.api",
 :name "requires-compilation?",
 :signature ["[src dest]" "[src dest opts]" "[state src dest opts]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api/requires-compilationQMARK",
 :source {:code "(defn requires-compilation?\n  ([src dest] (requires-compilation? src dest nil))\n  ([src dest opts]\n   (requires-compilation?\n     (if-not (nil? env/*compiler*)\n       env/*compiler*\n       (env/default-compiler-env opts))\n     src dest opts))\n  ([state src dest opts]\n   (env/with-compiler-env state\n     (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]\n       (comp/requires-compilation? src dest opts)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [48 60]},
 :full-name "cljs.compiler.api/requires-compilation?",
 :docstring "Return true if the src file requires compilation."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/requires-compilation?"]))
```

-->
