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


Source docstring:

```
Evaluates x and tests if it is an instance of the type
c. Returns true or false
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L904-L908):

```clj
(defn ^boolean instance?
  [c x]
  (cljs.core/instance? c x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:904-908](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L904-L908)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/clojure/cljs/core.cljc#L924-L931):

```clj
(core/defmacro instance? [c x]
  ;; Google Closure warns about some references to RegExp, so
  ;; (instance? RegExp ...) needs to be inlined, but the expansion
  ;; should preserve the order of argument evaluation.
  (bool-expr (if (clojure.core/symbol? c)
               (core/list 'js* "(~{} instanceof ~{})" x c)
               `(let [c# ~c x# ~x]
                  (~'js* "(~{} instanceof ~{})" x# c#)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:924-931](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/clojure/cljs/core.cljc#L924-L931)</ins>
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
 :source {:code "(defn ^boolean instance?\n  [c x]\n  (cljs.core/instance? c x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [904 908]},
 :extra-sources [{:code "(core/defmacro instance? [c x]\n  ;; Google Closure warns about some references to RegExp, so\n  ;; (instance? RegExp ...) needs to be inlined, but the expansion\n  ;; should preserve the order of argument evaluation.\n  (bool-expr (if (clojure.core/symbol? c)\n               (core/list 'js* \"(~{} instanceof ~{})\" x c)\n               `(let [c# ~c x# ~x]\n                  (~'js* \"(~{} instanceof ~{})\" x# c#)))))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.7.228",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [924 931]}],
 :full-name "cljs.core/instance?",
 :clj-symbol "clojure.core/instance?",
 :docstring "Evaluates x and tests if it is an instance of the type\nc. Returns true or false"}

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
