## cljs.repl.rhino/bootjs



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3126/src/clj/cljs/repl/rhino.clj#L22-L29):

```clj
(def ^String bootjs
  (str "var global = this;\n"
       "var CLOSURE_IMPORT_SCRIPT = function(src) {\n"
       "    var ns = \"cljs.repl.rhino\","
       "        name = \"load-file\","
       "        loadFile = Packages.clojure.lang.RT[\"var\"](ns,name);\n"
       "    if(src) loadFile.invoke(___repl_env, __repl_opts, src);\n"
       "};\n"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3126
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:22-29](https://github.com/clojure/clojurescript/blob/r3126/src/clj/cljs/repl/rhino.clj#L22-L29)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/bootjs` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/bootjs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/bootjs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "bootjs",
 :type "var",
 :return-type String,
 :source {:code "(def ^String bootjs\n  (str \"var global = this;\\n\"\n       \"var CLOSURE_IMPORT_SCRIPT = function(src) {\\n\"\n       \"    var ns = \\\"cljs.repl.rhino\\\",\"\n       \"        name = \\\"load-file\\\",\"\n       \"        loadFile = Packages.clojure.lang.RT[\\\"var\\\"](ns,name);\\n\"\n       \"    if(src) loadFile.invoke(___repl_env, __repl_opts, src);\\n\"\n       \"};\\n\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [22 29]},
 :full-name "cljs.repl.rhino/bootjs",
 :full-name-encode "cljs.repl.rhino/bootjs",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/bootjs"]))
```

-->
