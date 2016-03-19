## cljs.compiler.api/compile-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__compile-file__ src)<br>
</samp>
 <samp>
(__compile-file__ src dest)<br>
</samp>
 <samp>
(__compile-file__ src dest opts)<br>
</samp>
 <samp>
(__compile-file__ state src dest opts)<br>
</samp>

---





Source docstring:

```
Compiles src to a file of the same name, but with a .js extension,
in the src file's directory.

With dest argument, write file to provided location. If the dest
argument is a file outside the source tree, missing parent
directories will be created. The src file will only be compiled if
the dest file has an older modification time.

Both src and dest may be either a String or a File.

Returns a map containing {:ns .. :provides .. :requires .. :file ..}.
If the file was not compiled returns only {:file ...}
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/compiler/api.clj#L62-L86):

```clj
(defn compile-file
  ([src] (compile-file src))
  ([src dest] (compile-file src dest))
  ([src dest opts]
   (compile-file
     (if-not (nil? env/*compiler*)
       env/*compiler*
       (env/default-compiler-env opts))
     src dest opts))
  ([state src dest opts]
   (env/with-compiler-env state
     (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]
       (comp/compile-file src dest opts)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:62-86](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/compiler/api.clj#L62-L86)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.compiler.api/compile-file` @ crossclj](http://crossclj.info/fun/cljs.compiler.api/compile-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api/compile-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.compiler.api",
 :name "compile-file",
 :signature ["[src]"
             "[src dest]"
             "[src dest opts]"
             "[state src dest opts]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api/compile-file",
 :source {:code "(defn compile-file\n  ([src] (compile-file src))\n  ([src dest] (compile-file src dest))\n  ([src dest opts]\n   (compile-file\n     (if-not (nil? env/*compiler*)\n       env/*compiler*\n       (env/default-compiler-env opts))\n     src dest opts))\n  ([state src dest opts]\n   (env/with-compiler-env state\n     (binding [ana/*cljs-warning-handlers* (:warning-handlers opts ana/*cljs-warning-handlers*)]\n       (comp/compile-file src dest opts)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [62 86]},
 :full-name "cljs.compiler.api/compile-file",
 :docstring "Compiles src to a file of the same name, but with a .js extension,\nin the src file's directory.\n\nWith dest argument, write file to provided location. If the dest\nargument is a file outside the source tree, missing parent\ndirectories will be created. The src file will only be compiled if\nthe dest file has an older modification time.\n\nBoth src and dest may be either a String or a File.\n\nReturns a map containing {:ns .. :provides .. :requires .. :file ..}.\nIf the file was not compiled returns only {:file ...}"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/compile-file"]))
```

-->
