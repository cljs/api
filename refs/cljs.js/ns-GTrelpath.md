## cljs.js/ns->relpath



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(ns->relpath ns-sym)</samp><br>

---

 <samp>
(__ns->relpath__ ns-sym)<br>
</samp>

---





Source docstring:

```
Given a namespace as a symbol return the relative path sans extension
```


Source code @ [github]():

```clj
(defn ns->relpath
  [ns-sym]
  (string/replace (ana/munge-path ns-sym) \. \/))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.js/ns->relpath` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/ns-%3Erelpath.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/ns-GTrelpath.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "ns->relpath",
 :signature ["[ns-sym]"],
 :name-encode "ns-GTrelpath",
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.js/ns-GTrelpath",
 :source {:code "(defn ns->relpath\n  [ns-sym]\n  (string/replace (ana/munge-path ns-sym) \\. \\/))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [30 33],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/js.cljs#L30-L33"},
 :usage ["(ns->relpath ns-sym)"],
 :full-name "cljs.js/ns->relpath",
 :docstring "Given a namespace as a symbol return the relative path sans extension",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/ns-GTrelpath.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/ns->relpath"]))
```

-->
