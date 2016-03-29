## cljs.core/js-comment



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.107"><img valign="middle" alt="[+] 1.7.107" title="Added in 1.7.107" src="https://img.shields.io/badge/+-1.7.107-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(js-comment comment)</samp><br>

---

 <samp>
(__js-comment__ comment)<br>
</samp>

---





Source docstring:

```
Emit a top-level JavaScript multi-line comment. New lines will create a
new comment line. Comment block will be preceded and followed by a newline
```


Source code @ [github]():

```clj
(core/defmacro js-comment
  [comment]
  (core/let [[x & ys] (string/split comment #"\n")]
    (core/list 'js*
      (core/str
        "\n/**\n"
        (core/str " * " x "\n")
        (core/->> ys
          (map #(core/str " * " (string/replace % #"^   " "") "\n"))
          (reduce core/str ""))
        " */\n"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/js-comment` @ crossclj](http://crossclj.info/fun/cljs.core/js-comment.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-comment.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "js-comment",
 :signature ["[comment]"],
 :name-encode "js-comment",
 :history [["+" "1.7.107"]],
 :type "macro",
 :full-name-encode "cljs.core/js-comment",
 :source {:code "(core/defmacro js-comment\n  [comment]\n  (core/let [[x & ys] (string/split comment #\"\\n\")]\n    (core/list 'js*\n      (core/str\n        \"\\n/**\\n\"\n        (core/str \" * \" x \"\\n\")\n        (core/->> ys\n          (map #(core/str \" * \" (string/replace % #\"^   \" \"\") \"\\n\"))\n          (reduce core/str \"\"))\n        \" */\\n\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [861 873],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/core.cljc#L861-L873"},
 :usage ["(js-comment comment)"],
 :full-name "cljs.core/js-comment",
 :docstring "Emit a top-level JavaScript multi-line comment. New lines will create a\nnew comment line. Comment block will be preceded and followed by a newline",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-comment.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-comment"]))
```

-->
