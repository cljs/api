## cljs.core/undefined?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(undefined? x)</samp><br>

---

 <samp>
(__undefined?__ x)<br>
</samp>

---





Source docstring:

```
Returns true if x identical to the JavaScript undefined value.
```


Function code @ [github]():

```clj
(defn ^boolean undefined?
  [x]
  (cljs.core/undefined? x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---

Macro code @ [github]():

```clj
(core/defmacro undefined?
  [x]
  (bool-expr (core/list 'js* "(void 0 === ~{})" x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---


###### External doc links:

[`cljs.core/undefined?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/undefined%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/undefinedQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "undefined?",
 :signature ["[x]"],
 :name-encode "undefinedQMARK",
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :full-name-encode "cljs.core/undefinedQMARK",
 :source {:code "(defn ^boolean undefined?\n  [x]\n  (cljs.core/undefined? x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2061 2064],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L2061-L2064"},
 :extra-sources [{:code "(core/defmacro undefined?\n  [x]\n  (bool-expr (core/list 'js* \"(void 0 === ~{})\" x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [905 908],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/clojure/cljs/core.cljc#L905-L908"}],
 :usage ["(undefined? x)"],
 :full-name "cljs.core/undefined?",
 :docstring "Returns true if x identical to the JavaScript undefined value.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/undefinedQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/undefined?"]))
```

-->
