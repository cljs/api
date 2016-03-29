## cljs.build.api/target-file-for-cljs-ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(target-file-for-cljs-ns ns-sym)</samp><br>
<samp>(target-file-for-cljs-ns ns-sym output-dir)</samp><br>

---

 <samp>
(__target-file-for-cljs-ns__ ns-sym)<br>
</samp>
 <samp>
(__target-file-for-cljs-ns__ ns-sym output-dir)<br>
</samp>

---





Source docstring:

```
Given an output directory and a clojurescript namespace return the
compilation target file for that namespace.

For example:
(target-file-from-cljs-ns "resources/out" 'example.core) ->
<File: "resources/out/example/core.js">
```


Source code @ [github]():

```clj
(defn ^File target-file-for-cljs-ns
  ([ns-sym] (target-file-for-cljs-ns ns-sym nil))
  ([ns-sym output-dir]
    (util/to-target-file
      (util/output-directory {:output-dir output-dir})
      {:ns ns-sym})))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.build.api/target-file-for-cljs-ns` @ crossclj](http://crossclj.info/fun/cljs.build.api/target-file-for-cljs-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/target-file-for-cljs-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type File,
 :ns "cljs.build.api",
 :name "target-file-for-cljs-ns",
 :signature ["[ns-sym]" "[ns-sym output-dir]"],
 :name-encode "target-file-for-cljs-ns",
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.build.api/target-file-for-cljs-ns",
 :source {:code "(defn ^File target-file-for-cljs-ns\n  ([ns-sym] (target-file-for-cljs-ns ns-sym nil))\n  ([ns-sym output-dir]\n    (util/to-target-file\n      (util/output-directory {:output-dir output-dir})\n      {:ns ns-sym})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [28 39],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/build/api.clj#L28-L39"},
 :usage ["(target-file-for-cljs-ns ns-sym)"
         "(target-file-for-cljs-ns ns-sym output-dir)"],
 :full-name "cljs.build.api/target-file-for-cljs-ns",
 :docstring "Given an output directory and a clojurescript namespace return the\ncompilation target file for that namespace.\n\nFor example:\n(target-file-from-cljs-ns \"resources/out\" 'example.core) ->\n<File: \"resources/out/example/core.js\">",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/target-file-for-cljs-ns.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/target-file-for-cljs-ns"]))
```

-->
