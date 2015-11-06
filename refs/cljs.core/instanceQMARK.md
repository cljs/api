## cljs.core/instance?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/instance?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/instance?)
</td>
</tr>
</table>


 <samp>
(__instance?__ t o)<br>
</samp>

---

Returns true if `o` is an instance of type `t`, false otherwise.



---


###### See Also:

[`cljs.core/type`](../cljs.core/type.md)<br>

---




Function code @ [github](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L373-L374):

```clj
(defn ^boolean instance? [t o]
  (cljs.core/instance? t o))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:373-374](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L373-L374)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1913/src/clj/cljs/core.clj#L249-L256):

```clj
(defmacro instance? [t o]
  ;; Google Closure warns about some references to RegExp, so
  ;; (instance? RegExp ...) needs to be inlined, but the expansion
  ;; should preserve the order of argument evaluation.
  (bool-expr (if (clojure.core/symbol? t)
               (list 'js* "(~{} instanceof ~{})" o t)
               `(let [t# ~t o# ~o]
                  (~'js* "(~{} instanceof ~{})" o# t#)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1913
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:249-256](https://github.com/clojure/clojurescript/blob/r1913/src/clj/cljs/core.clj#L249-L256)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/instance?` @ clojuredocs](http://clojuredocs.org/clojure.core/instance_q)<br>
[`clojure.core/instance?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/instance%3F/)<br>
[`clojure.core/instance?` @ crossclj](http://crossclj.info/fun/clojure.core/instance%3F.html)<br>
[`cljs.core/instance?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/instance%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/instanceQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `o` is an instance of type `t`, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "instance?",
 :signature ["[t o]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/type"],
 :full-name-encode "cljs.core/instanceQMARK",
 :source {:code "(defn ^boolean instance? [t o]\n  (cljs.core/instance? t o))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [373 374]},
 :extra-sources [{:code "(defmacro instance? [t o]\n  ;; Google Closure warns about some references to RegExp, so\n  ;; (instance? RegExp ...) needs to be inlined, but the expansion\n  ;; should preserve the order of argument evaluation.\n  (bool-expr (if (clojure.core/symbol? t)\n               (list 'js* \"(~{} instanceof ~{})\" o t)\n               `(let [t# ~t o# ~o]\n                  (~'js* \"(~{} instanceof ~{})\" o# t#)))))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1913",
                  :filename "src/clj/cljs/core.clj",
                  :lines [249 256]}],
 :full-name "cljs.core/instance?",
 :clj-symbol "clojure.core/instance?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/instance?"]))
```

-->
