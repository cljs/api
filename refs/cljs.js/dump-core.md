## cljs.js/dump-core



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(dump-core)</samp><br>

---

 <samp>
(__dump-core__)<br>
</samp>

---







Source code @ [github]():

```clj
(defmacro dump-core []
  (let [state @env/*compiler*]
    (if-not (false? (get-in state [:options :dump-core]))
      `(quote ~(get-in state [::ana/namespaces 'cljs.core]))
      `(hash-map))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.js/dump-core` @ crossclj](http://crossclj.info/fun/cljs.js/dump-core.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/dump-core.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "dump-core",
 :signature ["[]"],
 :name-encode "dump-core",
 :history [["+" "1.7.10"]],
 :type "macro",
 :full-name-encode "cljs.js/dump-core",
 :source {:code "(defmacro dump-core []\n  (let [state @env/*compiler*]\n    (if-not (false? (get-in state [:options :dump-core]))\n      `(quote ~(get-in state [::ana/namespaces 'cljs.core]))\n      `(hash-map))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/js.clj",
          :lines [20 24],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/js.clj#L20-L24"},
 :usage ["(dump-core)"],
 :full-name "cljs.js/dump-core",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/dump-core.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/dump-core"]))
```

-->
