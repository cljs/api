## clojure.reflect/doc



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(doc sym)</samp><br>

---

 <samp>
(__doc__ sym)<br>
</samp>

---





Source docstring:

```
Queries the reflection api with a fully qualified symbol, then prints
documentation information at the repl.
```


Source code @ [github]():

```clj
(defn doc
  [sym]
  (meta sym print-doc))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.reflect/doc` @ crossclj](http://crossclj.info/fun/clojure.reflect.cljs/doc.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.reflect/doc.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.reflect",
 :name "doc",
 :signature ["[sym]"],
 :name-encode "doc",
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "clojure.reflect/doc",
 :source {:code "(defn doc\n  [sym]\n  (meta sym print-doc))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/clojure/reflect.cljs",
          :lines [45 49],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/clojure/reflect.cljs#L45-L49"},
 :usage ["(doc sym)"],
 :full-name "clojure.reflect/doc",
 :docstring "Queries the reflection api with a fully qualified symbol, then prints\ndocumentation information at the repl.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.reflect/doc.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.reflect/doc"]))
```

-->
