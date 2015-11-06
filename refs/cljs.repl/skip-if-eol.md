## cljs.repl/skip-if-eol



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" title="Added in 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__skip-if-eol__ s)<br>
</samp>

---





Source docstring:

```
If the next character on stream s is a newline, skips it, otherwise
leaves the stream untouched. Returns :line-start, :stream-end, or :body
to indicate the relative location of the next character on s. The stream
must either be an instance of LineNumberingPushbackReader or duplicate
its behavior of both supporting .unread and collapsing all of CR, LF, and
CRLF to a single \newline.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/repl.clj#L44-L56):

```clj
(defn skip-if-eol
  [s]
  (let [c (readers/read-char s)]
    (case c
      \newline :line-start
      nil :stream-end
      (do (readers/unread s c) :body))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:44-56](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/repl.clj#L44-L56)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/skip-if-eol` @ crossclj](http://crossclj.info/fun/cljs.repl/skip-if-eol.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/skip-if-eol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "skip-if-eol",
 :signature ["[s]"],
 :history [["+" "0.0-2719"]],
 :type "function",
 :full-name-encode "cljs.repl/skip-if-eol",
 :source {:code "(defn skip-if-eol\n  [s]\n  (let [c (readers/read-char s)]\n    (case c\n      \\newline :line-start\n      nil :stream-end\n      (do (readers/unread s c) :body))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/clj/cljs/repl.clj",
          :lines [44 56]},
 :full-name "cljs.repl/skip-if-eol",
 :docstring "If the next character on stream s is a newline, skips it, otherwise\nleaves the stream untouched. Returns :line-start, :stream-end, or :body\nto indicate the relative location of the next character on s. The stream\nmust either be an instance of LineNumberingPushbackReader or duplicate\nits behavior of both supporting .unread and collapsing all of CR, LF, and\nCRLF to a single \\newline."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/skip-if-eol"]))
```

-->
