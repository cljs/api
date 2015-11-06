## cljs.repl/repl-special-doc-map



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3058"><img valign="middle" alt="[+] 0.0-3058" title="Added in 0.0-3058" src="https://img.shields.io/badge/+-0.0--3058-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl.clj#L979-L1041):

```clj
(def repl-special-doc-map
  '{in-ns {:arglists ([name])
           :doc "Sets *cljs-ns* to the namespace named by the symbol, creating it if needed."}
    require {:arglists ([& args])
             :doc "  Loads libs, skipping any that are already loaded. Each argument is
  either a libspec that identifies a lib or a flag that modifies how all the identified
  libs are loaded. Use :require in the ns macro in preference to calling this
  directly.

  Libs

  A 'lib' is a named set of resources in classpath whose contents define a
  library of ClojureScript code. Lib names are symbols and each lib is associated
  with a ClojureScript namespace. A lib's name also locates its root directory
  within classpath using Java's package name to classpath-relative path mapping.
  All resources in a lib should be contained in the directory structure under its
  root directory. All definitions a lib makes should be in its associated namespace.

  'require loads a lib by loading its root resource. The root resource path
  is derived from the lib name in the following manner:
  Consider a lib named by the symbol 'x.y.z; it has the root directory
  <classpath>/x/y/, and its root resource is <classpath>/x/y/z.clj. The root
  resource should contain code to create the lib's namespace (usually by using
  the ns macro) and load any additional lib resources.

  Libspecs

  A libspec is a lib name or a vector containing a lib name followed by
  options expressed as sequential keywords and arguments.

  Recognized options:
  :as takes a symbol as its argument and makes that symbol an alias to the
    lib's namespace in the current namespace.
  :refer takes a list of symbols to refer from the namespace..
  :refer-macros takes a list of macro symbols to refer from the namespace.
  :include-macros takes a list of macro symbols to refer from the namespace.

  Flags

  A flag is a keyword.
  Recognized flags: :reload, :reload-all, :verbose
  :reload forces loading of all the identified libs even if they are
    already loaded
  :reload-all implies :reload and also forces loading of all libs that the
    identified libs directly or indirectly load via require or use
  :verbose triggers printing information about each load, alias, and refer

  Example:

  The following would load the library clojure.string :as string.

  (require '[clojure/string :as string])"}
    require-macros {:arglists ([& args])
                    :doc "Similar to the require REPL special function but
    only for macros."}
    import {:arglists ([& import-symbols-or-lists])
            :doc "import-list => (closure-namespace constructor-name-symbols*)

  For each name in constructor-name-symbols, adds a mapping from name to the
  constructor named by closure-namespace to the current namespace. Use :import in the ns
  macro in preference to calling this directly."}
    load-file {:arglist ([name])
               :doc "Sequentially read and evaluate the set of forms contained in the file."}})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:979-1041](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl.clj#L979-L1041)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/repl-special-doc-map` @ crossclj](http://crossclj.info/fun/cljs.repl/repl-special-doc-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/repl-special-doc-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "repl-special-doc-map",
 :type "var",
 :source {:code "(def repl-special-doc-map\n  '{in-ns {:arglists ([name])\n           :doc \"Sets *cljs-ns* to the namespace named by the symbol, creating it if needed.\"}\n    require {:arglists ([& args])\n             :doc \"  Loads libs, skipping any that are already loaded. Each argument is\n  either a libspec that identifies a lib or a flag that modifies how all the identified\n  libs are loaded. Use :require in the ns macro in preference to calling this\n  directly.\n\n  Libs\n\n  A 'lib' is a named set of resources in classpath whose contents define a\n  library of ClojureScript code. Lib names are symbols and each lib is associated\n  with a ClojureScript namespace. A lib's name also locates its root directory\n  within classpath using Java's package name to classpath-relative path mapping.\n  All resources in a lib should be contained in the directory structure under its\n  root directory. All definitions a lib makes should be in its associated namespace.\n\n  'require loads a lib by loading its root resource. The root resource path\n  is derived from the lib name in the following manner:\n  Consider a lib named by the symbol 'x.y.z; it has the root directory\n  <classpath>/x/y/, and its root resource is <classpath>/x/y/z.clj. The root\n  resource should contain code to create the lib's namespace (usually by using\n  the ns macro) and load any additional lib resources.\n\n  Libspecs\n\n  A libspec is a lib name or a vector containing a lib name followed by\n  options expressed as sequential keywords and arguments.\n\n  Recognized options:\n  :as takes a symbol as its argument and makes that symbol an alias to the\n    lib's namespace in the current namespace.\n  :refer takes a list of symbols to refer from the namespace..\n  :refer-macros takes a list of macro symbols to refer from the namespace.\n  :include-macros takes a list of macro symbols to refer from the namespace.\n\n  Flags\n\n  A flag is a keyword.\n  Recognized flags: :reload, :reload-all, :verbose\n  :reload forces loading of all the identified libs even if they are\n    already loaded\n  :reload-all implies :reload and also forces loading of all libs that the\n    identified libs directly or indirectly load via require or use\n  :verbose triggers printing information about each load, alias, and refer\n\n  Example:\n\n  The following would load the library clojure.string :as string.\n\n  (require '[clojure/string :as string])\"}\n    require-macros {:arglists ([& args])\n                    :doc \"Similar to the require REPL special function but\n    only for macros.\"}\n    import {:arglists ([& import-symbols-or-lists])\n            :doc \"import-list => (closure-namespace constructor-name-symbols*)\n\n  For each name in constructor-name-symbols, adds a mapping from name to the\n  constructor named by closure-namespace to the current namespace. Use :import in the ns\n  macro in preference to calling this directly.\"}\n    load-file {:arglist ([name])\n               :doc \"Sequentially read and evaluate the set of forms contained in the file.\"}})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/clj/cljs/repl.clj",
          :lines [979 1041]},
 :full-name "cljs.repl/repl-special-doc-map",
 :full-name-encode "cljs.repl/repl-special-doc-map",
 :history [["+" "0.0-3058"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl-special-doc-map"]))
```

-->
