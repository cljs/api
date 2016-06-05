## cljs.spec/registry



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/registry</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/registry)
</td>
</tr>
</table>

<samp>(registry)</samp><br>

---

 <samp>
(__registry__)<br>
</samp>

---





Source docstring:

```
returns the registry map
```


Source code @ [github]():

```clj
(defn registry
  []
  @registry-ref)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/registry` @ clojuredocs](http://clojuredocs.org/clojure.spec/registry)<br>
[`clojure.spec/registry` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/registry/)<br>
[`clojure.spec/registry` @ crossclj](http://crossclj.info/fun/clojure.spec/registry.html)<br>
[`cljs.spec/registry` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/registry.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/registry.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "registry",
 :signature ["[]"],
 :name-encode "registry",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/registry",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/registry"},
 :full-name-encode "cljs.spec/registry",
 :source {:code "(defn registry\n  []\n  @registry-ref)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [232 235],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L232-L235"},
 :usage ["(registry)"],
 :full-name "cljs.spec/registry",
 :docstring "returns the registry map",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/registry.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/registry"]))
```

-->
