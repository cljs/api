## cljs.core/INamed



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Named</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Named.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for adding a name.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L607-L612):

```clj
(defprotocol INamed
  "Protocol for adding a name."
  (^string -name [x]
    "Returns the name String of x.")
  (^string -namespace [x]
    "Returns the namespace String of x."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:607-612](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L607-L612)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Named` @ clojuredocs](http://clojuredocs.org/clojure.lang/Named)<br>
[`clojure.lang/Named` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Named/)<br>
[`clojure.lang/Named` @ crossclj](http://crossclj.info/fun/clojure.lang/Named.html)<br>
[`cljs.core/INamed` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/INamed.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/INamed.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "INamed",
 :history [["+" "0.0-1798"]],
 :type "protocol",
 :full-name-encode "cljs.core/INamed",
 :source {:code "(defprotocol INamed\n  \"Protocol for adding a name.\"\n  (^string -name [x]\n    \"Returns the name String of x.\")\n  (^string -namespace [x]\n    \"Returns the namespace String of x.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/core.cljs",
          :lines [607 612]},
 :methods [{:name "-name",
            :signature ["[x]"],
            :docstring "Returns the name String of x."}
           {:name "-namespace",
            :signature ["[x]"],
            :docstring "Returns the namespace String of x."}],
 :full-name "cljs.core/INamed",
 :clj-symbol "clojure.lang/Named",
 :docstring "Protocol for adding a name."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/INamed"]))
```

-->
