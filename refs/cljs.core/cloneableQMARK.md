## cljs.core/cloneable?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2156"><img valign="middle" alt="[+] 0.0-2156" title="Added in 0.0-2156" src="https://img.shields.io/badge/+-0.0--2156-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(cloneable? value)</samp><br>

---

 <samp>
(__cloneable?__ value)<br>
</samp>

---





Source docstring:

```
Return true if x implements ICloneable protocol.
```


Source code @ [github]():

```clj
(defn ^boolean cloneable?
  [value]
  (satisfies? ICloneable value))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/cloneable?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/cloneable%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/cloneableQMARK.cljsdoc
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
 :name "cloneable?",
 :signature ["[value]"],
 :name-encode "cloneableQMARK",
 :history [["+" "0.0-2156"]],
 :type "function",
 :full-name-encode "cljs.core/cloneableQMARK",
 :source {:code "(defn ^boolean cloneable?\n  [value]\n  (satisfies? ICloneable value))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1086 1089],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/core.cljs#L1086-L1089"},
 :usage ["(cloneable? value)"],
 :full-name "cljs.core/cloneable?",
 :docstring "Return true if x implements ICloneable protocol.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/cloneableQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cloneable?"]))
```

-->
