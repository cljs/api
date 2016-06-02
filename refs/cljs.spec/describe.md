## cljs.spec/describe



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/describe</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/describe)
</td>
</tr>
</table>

<samp>(describe spec)</samp><br>

---

 <samp>
(__describe__ spec)<br>
</samp>

---





Source docstring:

```
returns an abbreviated description of the spec as data
```


Source code @ [github]():

```clj
(defn describe
  [spec]
  (abbrev (form spec)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/describe` @ clojuredocs](http://clojuredocs.org/clojure.spec/describe)<br>
[`clojure.spec/describe` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/describe/)<br>
[`clojure.spec/describe` @ crossclj](http://crossclj.info/fun/clojure.spec/describe.html)<br>
[`cljs.spec/describe` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/describe.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/describe.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "describe",
 :signature ["[spec]"],
 :name-encode "describe",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/describe",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/describe"},
 :full-name-encode "cljs.spec/describe",
 :source {:code "(defn describe\n  [spec]\n  (abbrev (form spec)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [131 134],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L131-L134"},
 :usage ["(describe spec)"],
 :full-name "cljs.spec/describe",
 :docstring "returns an abbreviated description of the spec as data",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/describe.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/describe"]))
```

-->
