## cljs.analyzer.api/analyze-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" title="Added in 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(analyze-file f)</samp><br>
<samp>(analyze-file f opts)</samp><br>
<samp>(analyze-file state f opts)</samp><br>

---

 <samp>
(__analyze-file__ f)<br>
</samp>
 <samp>
(__analyze-file__ f opts)<br>
</samp>
 <samp>
(__analyze-file__ state f opts)<br>
</samp>

---





Source docstring:

```
Given a java.io.File, java.net.URL or a string identifying a resource on the
   classpath attempt to analyze it.

   This function side-effects the ambient compilation environment
   `cljs.env/*compiler*` to aggregate analysis information. opts argument is
   compiler options, if :cache-analysis true will cache analysis to
   ":output-dir/some/ns/foo.cljs.cache.edn". This function does not return a
   meaningful value.
```


Source code @ [github]():

```clj
   (defn analyze-file
     ([f] (analyze-file f nil))
     ([f opts]
      (analyze-file
        (if-not (nil? env/*compiler*)
          env/*compiler*
          (env/default-compiler-env opts))
        f opts))
     ([state f opts]
      (env/with-compiler-env state
        (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]
          (ana/analyze-file f opts))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/analyze-file` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/analyze-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/analyze-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "analyze-file",
 :signature ["[f]" "[f opts]" "[state f opts]"],
 :name-encode "analyze-file",
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/analyze-file",
 :source {:code "   (defn analyze-file\n     ([f] (analyze-file f nil))\n     ([f opts]\n      (analyze-file\n        (if-not (nil? env/*compiler*)\n          env/*compiler*\n          (env/default-compiler-env opts))\n        f opts))\n     ([state f opts]\n      (env/with-compiler-env state\n        (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]\n          (ana/analyze-file f opts))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/clojure/cljs/analyzer/api.cljc",
          :lines [120 139],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/analyzer/api.cljc#L120-L139"},
 :usage ["(analyze-file f)"
         "(analyze-file f opts)"
         "(analyze-file state f opts)"],
 :full-name "cljs.analyzer.api/analyze-file",
 :docstring "Given a java.io.File, java.net.URL or a string identifying a resource on the\n   classpath attempt to analyze it.\n\n   This function side-effects the ambient compilation environment\n   `cljs.env/*compiler*` to aggregate analysis information. opts argument is\n   compiler options, if :cache-analysis true will cache analysis to\n   \":output-dir/some/ns/foo.cljs.cache.edn\". This function does not return a\n   meaningful value.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/analyze-file.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/analyze-file"]))
```

-->
