## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ICounted

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:195-196](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L195-L196)</ins>
</pre>

```clj
(defprotocol ICounted
  (-count [coll] "constant time count"))
```


---

```clj
{:ns "cljs.core",
 :name "ICounted",
 :type "protocol",
 :full-name-encode "cljs.core_ICounted",
 :source {:code "(defprotocol ICounted\n  (-count [coll] \"constant time count\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [195 196],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L195-L196"},
 :methods [{:name "-count",
            :signature ["[coll]"],
            :docstring "constant time count"}],
 :full-name "cljs.core/ICounted",
 :history [["+" "0.0-927"]]}

```
