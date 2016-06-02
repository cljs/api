## cljs.spec/nilable



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/nilable</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/nilable)
</td>
</tr>
</table>

<samp>(nilable pred)</samp><br>

---

 <samp>
(__nilable__ pred)<br>
</samp>

---





Source docstring:

```
returns a spec that accepts nil and values satisfiying pred
```


Source code @ [github]():

```clj
(defmacro nilable
  [pred]
  `(and (or ::nil nil? ::pred ~pred) (conformer second)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/nilable` @ clojuredocs](http://clojuredocs.org/clojure.spec/nilable)<br>
[`clojure.spec/nilable` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/nilable/)<br>
[`clojure.spec/nilable` @ crossclj](http://crossclj.info/fun/clojure.spec/nilable.html)<br>
[`cljs.spec/nilable` @ crossclj](http://crossclj.info/fun/cljs.spec/nilable.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/nilable.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "nilable",
 :signature ["[pred]"],
 :name-encode "nilable",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/nilable",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/nilable"},
 :full-name-encode "cljs.spec/nilable",
 :source {:code "(defmacro nilable\n  [pred]\n  `(and (or ::nil nil? ::pred ~pred) (conformer second)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [364 367],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L364-L367"},
 :usage ["(nilable pred)"],
 :full-name "cljs.spec/nilable",
 :docstring "returns a spec that accepts nil and values satisfiying pred",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/nilable.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/nilable"]))
```

-->
