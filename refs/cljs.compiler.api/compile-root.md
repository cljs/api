## cljs.compiler.api/compile-root



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(compile-root src-dir)</samp><br>
<samp>(compile-root src-dir target-dir)</samp><br>
<samp>(compile-root src-dir target-dir opts)</samp><br>
<samp>(compile-root state src-dir target-dir opts)</samp><br>

---

 <samp>
(__compile-root__ src-dir)<br>
</samp>
 <samp>
(__compile-root__ src-dir target-dir)<br>
</samp>
 <samp>
(__compile-root__ src-dir target-dir opts)<br>
</samp>
 <samp>
(__compile-root__ state src-dir target-dir opts)<br>
</samp>

---





Source docstring:

```
Looks recursively in src-dir for .cljs files and compiles them to
.js files. If target-dir is provided, output will go into this
directory mirroring the source directory structure. Returns a list
of maps containing information about each file which was compiled
in dependency order.
```


Source code @ [github]():

```clj
(defn compile-root
  ([src-dir] (compile-root src-dir "out"))
  ([src-dir target-dir] (compile-root src-dir target-dir nil))
  ([src-dir target-dir opts]
   (compile-root
     (if-not (nil? env/*compiler*)
       env/*compiler*
       (env/default-compiler-env opts))
     src-dir target-dir opts))
  ([state src-dir target-dir opts]
   (env/with-compiler-env state
     (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]
       (comp/compile-root src-dir target-dir opts)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.compiler.api/compile-root` @ crossclj](http://crossclj.info/fun/cljs.compiler.api/compile-root.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api/compile-root.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.compiler.api",
 :name "compile-root",
 :signature ["[src-dir]"
             "[src-dir target-dir]"
             "[src-dir target-dir opts]"
             "[state src-dir target-dir opts]"],
 :name-encode "compile-root",
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api/compile-root",
 :source {:code "(defn compile-root\n  ([src-dir] (compile-root src-dir \"out\"))\n  ([src-dir target-dir] (compile-root src-dir target-dir nil))\n  ([src-dir target-dir opts]\n   (compile-root\n     (if-not (nil? env/*compiler*)\n       env/*compiler*\n       (env/default-compiler-env opts))\n     src-dir target-dir opts))\n  ([state src-dir target-dir opts]\n   (env/with-compiler-env state\n     (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]\n       (comp/compile-root src-dir target-dir opts)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [93 110],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/compiler/api.clj#L93-L110"},
 :usage ["(compile-root src-dir)"
         "(compile-root src-dir target-dir)"
         "(compile-root src-dir target-dir opts)"
         "(compile-root state src-dir target-dir opts)"],
 :full-name "cljs.compiler.api/compile-root",
 :docstring "Looks recursively in src-dir for .cljs files and compiles them to\n.js files. If target-dir is provided, output will go into this\ndirectory mirroring the source directory structure. Returns a list\nof maps containing information about each file which was compiled\nin dependency order.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api/compile-root.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/compile-root"]))
```

-->
