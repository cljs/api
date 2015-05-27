## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.core/pr-sequential~~

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[×] 0.0-1798" src="https://img.shields.io/badge/×-0.0--1798-red.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-sequential__ print-one begin sep end opts coll)<br>
</samp>

```
Do not use this.  It is kept for backwards compatibility with the
old IPrintable protocol.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6210-6217](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6210-L6217)</ins>
</pre>

```clj
(defn ^:deprecated pr-sequential
  [print-one begin sep end opts coll]
  (concat [begin]
          (flatten1
            (interpose [sep] (map #(print-one % opts) coll)))
          [end]))
```


---

```clj
{:ns "cljs.core",
 :name "pr-sequential",
 :signature ["[print-one begin sep end opts coll]"],
 :history [["+" "0.0-927"] ["-" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_pr-sequential",
 :source {:code "(defn ^:deprecated pr-sequential\n  [print-one begin sep end opts coll]\n  (concat [begin]\n          (flatten1\n            (interpose [sep] (map #(print-one % opts) coll)))\n          [end]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6210 6217],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6210-L6217"},
 :full-name "cljs.core/pr-sequential",
 :docstring "Do not use this.  It is kept for backwards compatibility with the\nold IPrintable protocol.",
 :removed {:in "0.0-1798", :last-seen "0.0-1586"}}

```
