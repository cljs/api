## cljs.repl/skip-whitespace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" title="Added in 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(skip-whitespace s)</samp><br>

---

 <samp>
(__skip-whitespace__ s)<br>
</samp>

---





Source docstring:

```
Skips whitespace characters on stream s. Returns :line-start, :stream-end,
or :body to indicate the relative location of the next character on s.
Interprets comma as whitespace and semicolon as comment to end of line.
Does not interpret #! as comment to end of line because only one
character of lookahead is available. The stream must either be an
instance of LineNumberingPushbackReader or duplicate its behavior of both
supporting .unread and collapsing all of CR, LF, and CRLF to a single
\newline.
```


Source code @ [github]():

```clj
(defn skip-whitespace
  [s]
  (loop [c (readers/read-char s)]
    (case c
      \newline :line-start
      nil :stream-end
      \; (do (readers/read-line s) :line-start)
      (if (or (Character/isWhitespace c) (identical? c \,))
        (recur (readers/read-char s))
        (do (readers/unread s c) :body)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/skip-whitespace` @ crossclj](http://crossclj.info/fun/cljs.repl/skip-whitespace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/skip-whitespace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "skip-whitespace",
 :signature ["[s]"],
 :name-encode "skip-whitespace",
 :history [["+" "0.0-2719"]],
 :type "function",
 :full-name-encode "cljs.repl/skip-whitespace",
 :source {:code "(defn skip-whitespace\n  [s]\n  (loop [c (readers/read-char s)]\n    (case c\n      \\newline :line-start\n      nil :stream-end\n      \\; (do (readers/read-line s) :line-start)\n      (if (or (Character/isWhitespace c) (identical? c \\,))\n        (recur (readers/read-char s))\n        (do (readers/unread s c) :body)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [68 85],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/repl.cljc#L68-L85"},
 :usage ["(skip-whitespace s)"],
 :full-name "cljs.repl/skip-whitespace",
 :docstring "Skips whitespace characters on stream s. Returns :line-start, :stream-end,\nor :body to indicate the relative location of the next character on s.\nInterprets comma as whitespace and semicolon as comment to end of line.\nDoes not interpret #! as comment to end of line because only one\ncharacter of lookahead is available. The stream must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF to a single\n\\newline.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/skip-whitespace.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/skip-whitespace"]))
```

-->
