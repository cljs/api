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









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L368-L370):

```clj
(defprotocol INamed
  (^string -name [x])
  (^string -namespace [x]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:368-370](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L368-L370)</ins>
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
 :source {:code "(defprotocol INamed\n  (^string -name [x])\n  (^string -namespace [x]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [368 370]},
 :methods [{:name "-name", :signature ["[x]"], :docstring nil}
           {:name "-namespace", :signature ["[x]"], :docstring nil}],
 :full-name "cljs.core/INamed",
 :clj-symbol "clojure.lang/Named"}

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
