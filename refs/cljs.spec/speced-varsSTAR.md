## cljs.spec/speced-vars\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(speced-vars\*)</samp><br>
<samp>(speced-vars\* ns-syms)</samp><br>

---

 <samp>
(__speced-vars\*__)<br>
</samp>
 <samp>
(__speced-vars\*__ ns-syms)<br>
</samp>

---







Source code @ [github]():

```clj
(defn speced-vars*
  ([]
    (speced-vars* nil))
  ([ns-syms]
   (let [ns-match? (if (seq ns-syms)
                     (set (map second ns-syms))
                     (constantly true))]
     (reduce
       (fn [ret sym]
         (if (ns-match? (symbol (namespace sym)))
           (conj ret (list 'var sym))
           ret))
       #{} @_speced_vars))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec/speced-vars*` @ crossclj](http://crossclj.info/fun/cljs.spec/speced-vars*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/speced-varsSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "speced-vars*",
 :signature ["[]" "[ns-syms]"],
 :name-encode "speced-varsSTAR",
 :history [["+" "1.9.14"]],
 :type "function",
 :full-name-encode "cljs.spec/speced-varsSTAR",
 :source {:code "(defn speced-vars*\n  ([]\n    (speced-vars* nil))\n  ([ns-syms]\n   (let [ns-match? (if (seq ns-syms)\n                     (set (map second ns-syms))\n                     (constantly true))]\n     (reduce\n       (fn [ret sym]\n         (if (ns-match? (symbol (namespace sym)))\n           (conj ret (list 'var sym))\n           ret))\n       #{} @_speced_vars))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [275 287],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L275-L287"},
 :usage ["(speced-vars*)" "(speced-vars* ns-syms)"],
 :full-name "cljs.spec/speced-vars*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/speced-varsSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/speced-vars*"]))
```

-->
