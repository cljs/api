## cljs.repl.node/repl-env\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(repl-env\* options)</samp><br>

---

 <samp>
(__repl-env\*__ options)<br>
</samp>

---







Source code @ [github]():

```clj
(defn repl-env* [options]
  (let [{:keys [host port debug-port]}
        (merge
          {:host "localhost"
           :port (+ 49000 (rand-int 10000))}
          options)]
    (assoc (NodeEnv. host port (atom nil) (atom nil))
      :debug-port debug-port)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl.node/repl-env*` @ crossclj](http://crossclj.info/fun/cljs.repl.node/repl-env*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/repl-envSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "repl-env*",
 :signature ["[options]"],
 :name-encode "repl-envSTAR",
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.repl.node/repl-envSTAR",
 :source {:code "(defn repl-env* [options]\n  (let [{:keys [host port debug-port]}\n        (merge\n          {:host \"localhost\"\n           :port (+ 49000 (rand-int 10000))}\n          options)]\n    (assoc (NodeEnv. host port (atom nil) (atom nil))\n      :debug-port debug-port)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [211 218],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/repl/node.clj#L211-L218"},
 :usage ["(repl-env* options)"],
 :full-name "cljs.repl.node/repl-env*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/repl-envSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/repl-env*"]))
```

-->
