## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/read</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/read)
</td>
</tr>
</table>

 <samp>
(__read__ reader eof-is-error sentinel is-recursive)<br>
</samp>

```
Reads the first object from a PushbackReader. Returns the object read.
If EOF, throws if eof-is-error is true. Otherwise returns sentinel.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:415-432](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L415-L432)</ins>
</pre>

```clj
(defn read
  [reader eof-is-error sentinel is-recursive]
  (let [ch (read-char reader)]
    (cond
     (nil? ch) (if eof-is-error (reader-error reader "EOF") sentinel)
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


---

```clj
{:ns "cljs.reader",
 :name "read",
 :signature ["[reader eof-is-error sentinel is-recursive]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader_read",
 :source {:code "(defn read\n  [reader eof-is-error sentinel is-recursive]\n  (let [ch (read-char reader)]\n    (cond\n     (nil? ch) (if eof-is-error (reader-error reader \"EOF\") sentinel)\n     (whitespace? ch) (recur reader eof-is-error sentinel is-recursive)\n     (comment-prefix? ch) (recur (read-comment reader ch) eof-is-error sentinel is-recursive)\n     :else (let [f (macros ch)\n                 res\n                 (cond\n                  f (f reader ch)\n                  (number-literal? reader ch) (read-number reader ch)\n                  :else (read-symbol reader ch))]\n     (if (identical? res reader)\n       (recur reader eof-is-error sentinel is-recursive)\n       res)))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [415 432],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L415-L432"},
 :full-name "cljs.reader/read",
 :clj-symbol "clojure.core/read",
 :docstring "Reads the first object from a PushbackReader. Returns the object read.\nIf EOF, throws if eof-is-error is true. Otherwise returns sentinel."}

```
