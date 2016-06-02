## cljs.spec/unstrument-ns



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/unstrument-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/unstrument-ns)
</td>
</tr>
</table>

<samp>(unstrument-ns & ns-syms)</samp><br>

---

 <samp>
(__unstrument-ns__ & ns-syms)<br>
</samp>

---





Source docstring:

```
Call unstrument for all speced-vars in namespaces named
by ns-syms. Idempotent.
```


Source code @ [github]():

```clj
(defmacro unstrument-ns
  [& ns-syms]
  `(do
     ~@(map #(list 'cljs.spec/unstrument %) (speced-vars* ns-syms))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/unstrument-ns` @ clojuredocs](http://clojuredocs.org/clojure.spec/unstrument-ns)<br>
[`clojure.spec/unstrument-ns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/unstrument-ns/)<br>
[`clojure.spec/unstrument-ns` @ crossclj](http://crossclj.info/fun/clojure.spec/unstrument-ns.html)<br>
[`cljs.spec/unstrument-ns` @ crossclj](http://crossclj.info/fun/cljs.spec/unstrument-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/unstrument-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "unstrument-ns",
 :signature ["[& ns-syms]"],
 :name-encode "unstrument-ns",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/unstrument-ns",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/unstrument-ns"},
 :full-name-encode "cljs.spec/unstrument-ns",
 :source {:code "(defmacro unstrument-ns\n  [& ns-syms]\n  `(do\n     ~@(map #(list 'cljs.spec/unstrument %) (speced-vars* ns-syms))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [406 411],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L406-L411"},
 :usage ["(unstrument-ns & ns-syms)"],
 :full-name "cljs.spec/unstrument-ns",
 :docstring "Call unstrument for all speced-vars in namespaces named\nby ns-syms. Idempotent.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/unstrument-ns.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/unstrument-ns"]))
```

-->
