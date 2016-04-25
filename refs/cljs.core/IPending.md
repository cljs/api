## cljs.core/IPending



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPending</samp>](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/IPending.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for types which can have a deferred realization. Currently only
  implemented by Delay and LazySeq.
```


Source code @ [github]():

```clj
(defprotocol IPending
  "Protocol for types which can have a deferred realization. Currently only
  implemented by Delay and LazySeq."
  (^boolean -realized? [x]
    "Returns true if a value for x has been produced, false otherwise."))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.lang/IPending` @ clojuredocs](http://clojuredocs.org/clojure.lang/IPending)<br>
[`clojure.lang/IPending` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IPending/)<br>
[`clojure.lang/IPending` @ crossclj](http://crossclj.info/fun/clojure.lang/IPending.html)<br>
[`cljs.core/IPending` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IPending.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IPending.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IPending",
 :name-encode "IPending",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :clj-equiv {:full-name "clojure.lang/IPending",
             :url "https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/IPending.java"},
 :full-name-encode "cljs.core/IPending",
 :source {:code "(defprotocol IPending\n  \"Protocol for types which can have a deferred realization. Currently only\n  implemented by Delay and LazySeq.\"\n  (^boolean -realized? [x]\n    \"Returns true if a value for x has been produced, false otherwise.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [659 663],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L659-L663"},
 :methods [{:name "-realized?",
            :signature ["[x]"],
            :docstring "Returns true if a value for x has been produced, false otherwise."}],
 :full-name "cljs.core/IPending",
 :docstring "Protocol for types which can have a deferred realization. Currently only\n  implemented by Delay and LazySeq.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IPending.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IPending"]))
```

-->
