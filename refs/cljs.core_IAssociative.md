## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IAssociative

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
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:222-225](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L222-L225)</ins>
</pre>

```clj
(defprotocol IAssociative
  (-contains-key? [coll k])
  #_(-entry-at [coll k])
  (-assoc [coll k v]))
```


---

```clj
{:ns "cljs.core",
 :name "IAssociative",
 :type "protocol",
 :full-name-encode "cljs.core_IAssociative",
 :source {:code "(defprotocol IAssociative\n  (-contains-key? [coll k])\n  #_(-entry-at [coll k])\n  (-assoc [coll k v]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [222 225],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L222-L225"},
 :methods [{:name "-contains-key?",
            :signature ["[coll k]"],
            :docstring nil}
           {:name "-assoc", :signature ["[coll k v]"], :docstring nil}],
 :full-name "cljs.core/IAssociative",
 :history [["+" "0.0-927"]]}

```
