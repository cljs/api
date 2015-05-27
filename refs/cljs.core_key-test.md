## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/key-test

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__key-test__ key other)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4071-4074](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L4071-L4074)</ins>
</pre>

```clj
(defn ^boolean key-test [key other]
  (if ^boolean (goog/isString key)
    (identical? key other)
    (= key other)))
```


---

```clj
{:full-name "cljs.core/key-test",
 :ns "cljs.core",
 :name "key-test",
 :type "function",
 :signature ["[key other]"],
 :return-type boolean,
 :source {:code "(defn ^boolean key-test [key other]\n  (if ^boolean (goog/isString key)\n    (identical? key other)\n    (= key other)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [4071 4074],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L4071-L4074"},
 :full-name-encode "cljs.core_key-test",
 :history [["+" "0.0-1424"]]}

```