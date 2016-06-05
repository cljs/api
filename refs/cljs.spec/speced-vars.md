## cljs.spec/speced-vars



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/speced-vars</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/speced-vars)
</td>
</tr>
</table>

<samp>(speced-vars & ns-syms)</samp><br>

---

 <samp>
(__speced-vars__ & ns-syms)<br>
</samp>

---





Source docstring:

```
Returns the set of vars whose namespace is in ns-syms AND
whose vars have been speced with fdef. If no ns-syms are
specified, return speced vars from all namespaces.
```


Source code @ [github]():

```clj
(defmacro speced-vars
  [& ns-syms]
  (speced-vars* ns-syms))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/speced-vars` @ clojuredocs](http://clojuredocs.org/clojure.spec/speced-vars)<br>
[`clojure.spec/speced-vars` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/speced-vars/)<br>
[`clojure.spec/speced-vars` @ crossclj](http://crossclj.info/fun/clojure.spec/speced-vars.html)<br>
[`cljs.spec/speced-vars` @ crossclj](http://crossclj.info/fun/cljs.spec/speced-vars.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/speced-vars.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "speced-vars",
 :signature ["[& ns-syms]"],
 :name-encode "speced-vars",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/speced-vars",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/speced-vars"},
 :full-name-encode "cljs.spec/speced-vars",
 :source {:code "(defmacro speced-vars\n  [& ns-syms]\n  (speced-vars* ns-syms))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [289 294],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L289-L294"},
 :usage ["(speced-vars & ns-syms)"],
 :full-name "cljs.spec/speced-vars",
 :docstring "Returns the set of vars whose namespace is in ns-syms AND\nwhose vars have been speced with fdef. If no ns-syms are\nspecified, return speced vars from all namespaces.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/speced-vars.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/speced-vars"]))
```

-->
