## cljs.reader/read



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/read</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/read)
</td>
</tr>
</table>


 <samp>
(__read__ reader eof-is-error sentinel is-recursive)<br>
</samp>

---





Source docstring:

```
Reads the first object from a PushbackReader. Returns the object read.
If EOF, throws if eof-is-error is true. Otherwise returns sentinel.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/reader.cljs#L424-L441):

```clj
(defn read
  [reader eof-is-error sentinel is-recursive]
  (let [ch (read-char reader)]
    (cond
     (nil? ch) (if eof-is-error (reader-error reader "EOF while reading") sentinel)
     (whitespace? ch) (recur reader eof-is-error sentinel is-recursive)
     (comment-prefix? ch) (recur (read-comment reader ch) eof-is-error sentinel is-recursive)
     :else (let [f (macros ch)
                 res
                 (cond
                  f (f reader ch)
                  (number-literal? reader ch) (read-number reader ch)
                  :else (read-symbol reader ch))]
     (if (identical? res reader)
       (recur reader eof-is-error sentinel is-recursive)
       res)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[reader.cljs:424-441](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/reader.cljs#L424-L441)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/read` @ clojuredocs](http://clojuredocs.org/clojure.core/read)<br>
[`clojure.core/read` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/read/)<br>
[`clojure.core/read` @ crossclj](http://crossclj.info/fun/clojure.core/read.html)<br>
[`cljs.reader/read` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read",
 :signature ["[reader eof-is-error sentinel is-recursive]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader/read",
 :source {:code "(defn read\n  [reader eof-is-error sentinel is-recursive]\n  (let [ch (read-char reader)]\n    (cond\n     (nil? ch) (if eof-is-error (reader-error reader \"EOF while reading\") sentinel)\n     (whitespace? ch) (recur reader eof-is-error sentinel is-recursive)\n     (comment-prefix? ch) (recur (read-comment reader ch) eof-is-error sentinel is-recursive)\n     :else (let [f (macros ch)\n                 res\n                 (cond\n                  f (f reader ch)\n                  (number-literal? reader ch) (read-number reader ch)\n                  :else (read-symbol reader ch))]\n     (if (identical? res reader)\n       (recur reader eof-is-error sentinel is-recursive)\n       res)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [424 441]},
 :full-name "cljs.reader/read",
 :clj-symbol "clojure.core/read",
 :docstring "Reads the first object from a PushbackReader. Returns the object read.\nIf EOF, throws if eof-is-error is true. Otherwise returns sentinel."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read"]))
```

-->
