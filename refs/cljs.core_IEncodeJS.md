## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEncodeJS

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6709-6712](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6709-L6712)</ins>
</pre>

```clj
(defprotocol IEncodeJS
  (-clj->js [x] "Recursively transforms clj values to JavaScript")
  (-key->js [x] "Transforms map keys to valid JavaScript keys. Arbitrary keys are
  encoded to their string representation via (pr-str x)"))
```


---

```clj
{:ns "cljs.core",
 :name "IEncodeJS",
 :type "protocol",
 :full-name-encode "cljs.core_IEncodeJS",
 :source {:code "(defprotocol IEncodeJS\n  (-clj->js [x] \"Recursively transforms clj values to JavaScript\")\n  (-key->js [x] \"Transforms map keys to valid JavaScript keys. Arbitrary keys are\n  encoded to their string representation via (pr-str x)\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6709 6712],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6709-L6712"},
 :methods [{:name "-clj->js",
            :signature ["[x]"],
            :docstring "Recursively transforms clj values to JavaScript"}
           {:name "-key->js",
            :signature ["[x]"],
            :docstring "Transforms map keys to valid JavaScript keys. Arbitrary keys are\n  encoded to their string representation via (pr-str x)"}],
 :full-name "cljs.core/IEncodeJS",
 :history [["+" "0.0-1552"]]}

```
