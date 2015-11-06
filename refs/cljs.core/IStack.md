## cljs.core/IStack



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPersistentStack</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentStack.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for collections to provide access to their items as stacks. The top
  of the stack should be accessed in the most efficient way for the different
  data structures.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L424-L432):

```clj
(defprotocol IStack
  "Protocol for collections to provide access to their items as stacks. The top
  of the stack should be accessed in the most efficient way for the different
  data structures."
  (-peek [coll]
    "Returns the item from the top of the stack. Is used by cljs.core/peek.")
  (^clj -pop [coll]
    "Returns a new stack without the item on top of the stack. Is used
     by cljs.core/pop."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:424-432](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L424-L432)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IPersistentStack` @ clojuredocs](http://clojuredocs.org/clojure.lang/IPersistentStack)<br>
[`clojure.lang/IPersistentStack` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IPersistentStack/)<br>
[`clojure.lang/IPersistentStack` @ crossclj](http://crossclj.info/fun/clojure.lang/IPersistentStack.html)<br>
[`cljs.core/IStack` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IStack.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IStack.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IStack",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IStack",
 :source {:code "(defprotocol IStack\n  \"Protocol for collections to provide access to their items as stacks. The top\n  of the stack should be accessed in the most efficient way for the different\n  data structures.\"\n  (-peek [coll]\n    \"Returns the item from the top of the stack. Is used by cljs.core/peek.\")\n  (^clj -pop [coll]\n    \"Returns a new stack without the item on top of the stack. Is used\n     by cljs.core/pop.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [424 432]},
 :methods [{:name "-peek",
            :signature ["[coll]"],
            :docstring "Returns the item from the top of the stack. Is used by cljs.core/peek."}
           {:name "-pop",
            :signature ["[coll]"],
            :docstring "Returns a new stack without the item on top of the stack. Is used\n     by cljs.core/pop."}],
 :full-name "cljs.core/IStack",
 :clj-symbol "clojure.lang/IPersistentStack",
 :docstring "Protocol for collections to provide access to their items as stacks. The top\n  of the stack should be accessed in the most efficient way for the different\n  data structures."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IStack"]))
```

-->
