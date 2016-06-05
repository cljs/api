## cljs.spec/form



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/form</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/form)
</td>
</tr>
</table>

<samp>(form spec)</samp><br>

---

 <samp>
(__form__ spec)<br>
</samp>

---





Source docstring:

```
returns the spec as data
```


Source code @ [github]():

```clj
(defn form
  [spec]
  ;;TODO - incorporate gens
  (describe* (specize spec)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/form` @ clojuredocs](http://clojuredocs.org/clojure.spec/form)<br>
[`clojure.spec/form` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/form/)<br>
[`clojure.spec/form` @ crossclj](http://crossclj.info/fun/clojure.spec/form.html)<br>
[`cljs.spec/form` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/form.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/form.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "form",
 :signature ["[spec]"],
 :name-encode "form",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/form",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/form"},
 :full-name-encode "cljs.spec/form",
 :source {:code "(defn form\n  [spec]\n  ;;TODO - incorporate gens\n  (describe* (specize spec)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [110 114],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L110-L114"},
 :usage ["(form spec)"],
 :full-name "cljs.spec/form",
 :docstring "returns the spec as data",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/form.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/form"]))
```

-->
