## ~~cljs.repl/IParseErrorMessage~~



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[×] 0.0-3030" title="Removed in 0.0-3030" src="https://img.shields.io/badge/×-0.0--3030-red.svg"></a> </td>
</tr>
</table>









Source code @ [github]():

```clj
(defprotocol IParseErrorMessage
  (-parse-error-message [repl-env message error build-options]
    "Given the original JavaScript error message return the string to actually
     use."))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/IParseErrorMessage` @ crossclj](http://crossclj.info/fun/cljs.repl/IParseErrorMessage.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/IParseErrorMessage.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "IParseErrorMessage",
 :history [["+" "0.0-2985"] ["-" "0.0-3030"]],
 :type "protocol",
 :full-name-encode "cljs.repl/IParseErrorMessage",
 :source {:code "(defprotocol IParseErrorMessage\n  (-parse-error-message [repl-env message error build-options]\n    \"Given the original JavaScript error message return the string to actually\n     use.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/clj/cljs/repl.clj",
          :lines [112 115]},
 :methods [{:name "-parse-error-message",
            :signature ["[repl-env message error build-options]"],
            :docstring "Given the original JavaScript error message return the string to actually\n     use."}],
 :full-name "cljs.repl/IParseErrorMessage",
 :removed {:in "0.0-3030", :last-seen "0.0-2985"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IParseErrorMessage"]))
```

-->
