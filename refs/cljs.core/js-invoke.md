## cljs.core/js-invoke



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" title="Added in 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-invoke__ obj s & args)<br>
</samp>

---

Invoke JavaScript object `obj` method via string `s`. Needed when the string is
not a valid unquoted property name.



---

###### Examples:

If we have a JavaScript object with an unusual property name:

```js
// JavaScript
var obj = {
  "my sum": function(a,b) { return a+b; }
};
```

We can invoke it from ClojureScript:

```clj
(js-invoke js/obj "my sum" 1 2)
;=> 3
```



---



Source docstring:

```
Invoke JavaScript object method via string. Needed when the
string is not a valid unquoted property name.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L298-L302):

```clj
(defn js-invoke
  [obj s & args]
  (.apply (aget obj s) obj (into-array args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:298-302](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L298-L302)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/js-invoke` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/js-invoke.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-invoke.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Invoke JavaScript object `obj` method via string `s`. Needed when the string is\nnot a valid unquoted property name.",
 :ns "cljs.core",
 :name "js-invoke",
 :signature ["[obj s & args]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :full-name-encode "cljs.core/js-invoke",
 :source {:code "(defn js-invoke\n  [obj s & args]\n  (.apply (aget obj s) obj (into-array args)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [298 302]},
 :examples [{:id "373cce",
             :content "If we have a JavaScript object with an unusual property name:\n\n```js\n// JavaScript\nvar obj = {\n  \"my sum\": function(a,b) { return a+b; }\n};\n```\n\nWe can invoke it from ClojureScript:\n\n```clj\n(js-invoke js/obj \"my sum\" 1 2)\n;=> 3\n```"}],
 :full-name "cljs.core/js-invoke",
 :docstring "Invoke JavaScript object method via string. Needed when the\nstring is not a valid unquoted property name."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-invoke"]))
```

-->
