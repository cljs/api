## cljs.pprint/code-dispatch



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/code-dispatch</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/code-dispatch)
</td>
</tr>
</table>







Source docstring:

```
The pretty print dispatch function for pretty printing Clojure code.
```


Source code @ [github]():

```clj
(defmulti
  code-dispatch
  "The pretty print dispatch function for pretty printing Clojure code."
  {:added "1.2" :arglists '[[object]]}
  type-dispatcher)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.pprint/code-dispatch` @ clojuredocs](http://clojuredocs.org/clojure.pprint/code-dispatch)<br>
[`clojure.pprint/code-dispatch` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/code-dispatch/)<br>
[`clojure.pprint/code-dispatch` @ crossclj](http://crossclj.info/fun/clojure.pprint/code-dispatch.html)<br>
[`cljs.pprint/code-dispatch` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/code-dispatch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/code-dispatch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "code-dispatch",
 :name-encode "code-dispatch",
 :history [["+" "0.0-3255"]],
 :type "multimethod",
 :clj-equiv {:full-name "clojure.pprint/code-dispatch",
             :url "http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/code-dispatch"},
 :full-name-encode "cljs.pprint/code-dispatch",
 :source {:code "(defmulti\n  code-dispatch\n  \"The pretty print dispatch function for pretty printing Clojure code.\"\n  {:added \"1.2\" :arglists '[[object]]}\n  type-dispatcher)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [3196 3200],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/pprint.cljs#L3196-L3200"},
 :full-name "cljs.pprint/code-dispatch",
 :docstring "The pretty print dispatch function for pretty printing Clojure code.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/code-dispatch.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/code-dispatch"]))
```

-->
