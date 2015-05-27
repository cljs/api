## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/gen-apply-to

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__gen-apply-to__)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1576
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1150-1158](https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/core.clj#L1150-L1158)</ins>
</pre>

```clj
(defmacro gen-apply-to []
  `(do
     (set! ~'*unchecked-if* true)
     (defn ~'apply-to [~'f ~'argc ~'args]
       (let [~'args (seq ~'args)]
         (if (zero? ~'argc)
           (~'f)
           ~(gen-apply-to-helper))))
     (set! ~'*unchecked-if* false)))
```


---

```clj
{:full-name "cljs.core/gen-apply-to",
 :ns "cljs.core",
 :name "gen-apply-to",
 :type "macro",
 :signature ["[]"],
 :source {:code "(defmacro gen-apply-to []\n  `(do\n     (set! ~'*unchecked-if* true)\n     (defn ~'apply-to [~'f ~'argc ~'args]\n       (let [~'args (seq ~'args)]\n         (if (zero? ~'argc)\n           (~'f)\n           ~(gen-apply-to-helper))))\n     (set! ~'*unchecked-if* false)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1150 1158],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/core.clj#L1150-L1158"},
 :full-name-encode "cljs.core_gen-apply-to",
 :history [["+" "0.0-1211"]]}

```
