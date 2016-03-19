## cljs.repl/repl-read



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" title="Added in 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-read__ request-prompt request-exit)<br>
</samp>
 <samp>
(__repl-read__ request-prompt request-exit opts)<br>
</samp>

---





Source docstring:

```
Default :read hook for repl. Reads from *in* which must either be an
instance of LineNumberingPushbackReader or duplicate its behavior of both
supporting .unread and collapsing all of CR, LF, and CRLF into a single
\newline. repl-read:
  - skips whitespace, then
    - returns request-prompt on start of line, or
    - returns request-exit on end of stream, or
    - reads an object from the input stream, then
      - skips the next input character if it's end of line, then
      - returns the object.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/repl.cljc#L85-L106):

```clj
(defn repl-read
  ([request-prompt request-exit]
   (repl-read request-prompt request-exit *repl-opts*))
  ([request-prompt request-exit opts]
   (binding [*in* (if (true? (:source-map-inline opts))
                    ((:reader opts))
                    *in*)]
     (or ({:line-start request-prompt :stream-end request-exit}
          (skip-whitespace *in*))
        (let [input (reader/read {:read-cond :allow :features #{:cljs}} *in*)]
          (skip-if-eol *in*)
          input)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:85-106](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/repl.cljc#L85-L106)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/repl-read` @ crossclj](http://crossclj.info/fun/cljs.repl/repl-read.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/repl-read.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "repl-read",
 :signature ["[request-prompt request-exit]"
             "[request-prompt request-exit opts]"],
 :history [["+" "0.0-2719"]],
 :type "function",
 :full-name-encode "cljs.repl/repl-read",
 :source {:code "(defn repl-read\n  ([request-prompt request-exit]\n   (repl-read request-prompt request-exit *repl-opts*))\n  ([request-prompt request-exit opts]\n   (binding [*in* (if (true? (:source-map-inline opts))\n                    ((:reader opts))\n                    *in*)]\n     (or ({:line-start request-prompt :stream-end request-exit}\n          (skip-whitespace *in*))\n        (let [input (reader/read {:read-cond :allow :features #{:cljs}} *in*)]\n          (skip-if-eol *in*)\n          input)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [85 106]},
 :full-name "cljs.repl/repl-read",
 :docstring "Default :read hook for repl. Reads from *in* which must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF into a single\n\\newline. repl-read:\n  - skips whitespace, then\n    - returns request-prompt on start of line, or\n    - returns request-exit on end of stream, or\n    - reads an object from the input stream, then\n      - skips the next input character if it's end of line, then\n      - returns the object."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl-read"]))
```

-->
