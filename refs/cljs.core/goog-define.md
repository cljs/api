## cljs.core/goog-define



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.48"><img valign="middle" alt="[+] 1.7.48" title="Added in 1.7.48" src="https://img.shields.io/badge/+-1.7.48-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__goog-define__ sym default)<br>
</samp>

---





Source docstring:

```
Defines a var using `goog.define`. Passed default value must be
string, number or boolean.

Default value can be overridden at compile time using the
compiler option `:closure-defines`.

Example:
  (ns your-app.core)
  (goog-define DEBUG! false)
  ;; can be overridden with
  :closure-defines {"your_app.core.DEBUG_BANG_" true}
  or
  :closure-defines {'your-app.core/DEBUG! true}
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/core.cljc#L690-L718):

```clj
(core/defmacro goog-define
  [sym default]
  (assert-args goog-define
   (core/or (core/string? default)
            (core/number? default)
            (core/true? default)
            (core/false? default)) "a string, number or boolean as default value")
  (core/let [defname (comp/munge (core/str *ns* "/" sym))
             type    (core/cond
                       (core/string? default) "string"
                       (core/number? default) "number"
                       (core/or (core/true? default) (core/false? default)) "boolean")]
    `(do
       (declare ~(symbol sym))
       (~'js* ~(core/str "/** @define {" type "} */"))
       (goog/define ~defname ~default))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:690-718](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/core.cljc#L690-L718)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/goog-define` @ crossclj](http://crossclj.info/fun/cljs.core/goog-define.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/goog-define.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "goog-define",
 :signature ["[sym default]"],
 :history [["+" "1.7.48"]],
 :type "macro",
 :full-name-encode "cljs.core/goog-define",
 :source {:code "(core/defmacro goog-define\n  [sym default]\n  (assert-args goog-define\n   (core/or (core/string? default)\n            (core/number? default)\n            (core/true? default)\n            (core/false? default)) \"a string, number or boolean as default value\")\n  (core/let [defname (comp/munge (core/str *ns* \"/\" sym))\n             type    (core/cond\n                       (core/string? default) \"string\"\n                       (core/number? default) \"number\"\n                       (core/or (core/true? default) (core/false? default)) \"boolean\")]\n    `(do\n       (declare ~(symbol sym))\n       (~'js* ~(core/str \"/** @define {\" type \"} */\"))\n       (goog/define ~defname ~default))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [690 718]},
 :full-name "cljs.core/goog-define",
 :docstring "Defines a var using `goog.define`. Passed default value must be\nstring, number or boolean.\n\nDefault value can be overridden at compile time using the\ncompiler option `:closure-defines`.\n\nExample:\n  (ns your-app.core)\n  (goog-define DEBUG! false)\n  ;; can be overridden with\n  :closure-defines {\"your_app.core.DEBUG_BANG_\" true}\n  or\n  :closure-defines {'your-app.core/DEBUG! true}"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/goog-define"]))
```

-->
