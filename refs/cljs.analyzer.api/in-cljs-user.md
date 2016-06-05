## cljs.analyzer.api/in-cljs-user



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(in-cljs-user env & body)</samp><br>

---

 <samp>
(__in-cljs-user__ env & body)<br>
</samp>

---





Source docstring:

```
Binds cljs.analyzer/*cljs-ns* to 'cljs.user and uses the given compilation
environment atom and runs body.
```


Source code @ [github]():

```clj
(defmacro in-cljs-user
  [env & body]
  `(binding [cljs.analyzer/*cljs-ns* 'cljs.user]
     (cljs.env/with-compiler-env ~env
       ~@body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/in-cljs-user` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/in-cljs-user.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/in-cljs-user.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "in-cljs-user",
 :signature ["[env & body]"],
 :name-encode "in-cljs-user",
 :history [["+" "0.0-2629"]],
 :type "macro",
 :full-name-encode "cljs.analyzer.api/in-cljs-user",
 :source {:code "(defmacro in-cljs-user\n  [env & body]\n  `(binding [cljs.analyzer/*cljs-ns* 'cljs.user]\n     (cljs.env/with-compiler-env ~env\n       ~@body)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/clojure/cljs/analyzer/api.cljc",
          :lines [213 219],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/analyzer/api.cljc#L213-L219"},
 :usage ["(in-cljs-user env & body)"],
 :full-name "cljs.analyzer.api/in-cljs-user",
 :docstring "Binds cljs.analyzer/*cljs-ns* to 'cljs.user and uses the given compilation\nenvironment atom and runs body.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/in-cljs-user.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/in-cljs-user"]))
```

-->
