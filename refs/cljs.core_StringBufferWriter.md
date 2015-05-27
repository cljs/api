## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/StringBufferWriter

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__StringBufferWriter.__ sb)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:347-350](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L347-L350)</ins>
</pre>

```clj
(deftype StringBufferWriter [sb]
  IWriter
  (-write [_ s] (.append sb s))
  (-flush [_] nil))
```


---

```clj
{:full-name "cljs.core/StringBufferWriter",
 :ns "cljs.core",
 :name "StringBufferWriter",
 :type "type",
 :signature ["[sb]"],
 :source {:code "(deftype StringBufferWriter [sb]\n  IWriter\n  (-write [_ s] (.append sb s))\n  (-flush [_] nil))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [347 350],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L347-L350"},
 :full-name-encode "cljs.core_StringBufferWriter",
 :history [["+" "0.0-1503"]]}

```
