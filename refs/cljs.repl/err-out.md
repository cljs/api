## cljs.repl/err-out



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" title="Added in 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(err-out & body)</samp><br>

---

 <samp>
(__err-out__ & body)<br>
</samp>

---







Source code @ [github]():

```clj
(defmacro err-out [& body]
  `(binding [*out* *err*]
     ~@body))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/err-out` @ crossclj](http://crossclj.info/fun/cljs.repl/err-out.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/err-out.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "err-out",
 :signature ["[& body]"],
 :name-encode "err-out",
 :history [["+" "0.0-3148"]],
 :type "macro",
 :full-name-encode "cljs.repl/err-out",
 :source {:code "(defmacro err-out [& body]\n  `(binding [*out* *err*]\n     ~@body))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [47 49],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/repl.cljc#L47-L49"},
 :usage ["(err-out & body)"],
 :full-name "cljs.repl/err-out",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/err-out.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/err-out"]))
```

-->
