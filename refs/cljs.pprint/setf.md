## cljs.pprint/setf



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(setf sym new-val)</samp><br>

---

 <samp>
(__setf__ sym new-val)<br>
</samp>

---





Source docstring:

```
Set the value of the field SYM to NEW-VAL
```


Source code @ [github]():

```clj
(defmacro setf
  [sym new-val]
  `(swap! @~'this assoc ~sym ~new-val))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.pprint/setf` @ crossclj](http://crossclj.info/fun/cljs.pprint/setf.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/setf.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "setf",
 :signature ["[sym new-val]"],
 :name-encode "setf",
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint/setf",
 :source {:code "(defmacro setf\n  [sym new-val]\n  `(swap! @~'this assoc ~sym ~new-val))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [34 37],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/pprint.clj#L34-L37"},
 :usage ["(setf sym new-val)"],
 :full-name "cljs.pprint/setf",
 :docstring "Set the value of the field SYM to NEW-VAL",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/setf.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/setf"]))
```

-->
