## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/instance?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/instance?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/instance?)
</td>
</tr>
</table>

 <samp>
(__instance?__ t o)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:652-653](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L652-L653)</ins>
</pre>

```clj
(defn instance? [t o]
  (js* "(~{o} != null && (~{o} instanceof ~{t} || ~{o}.constructor === ~{t} || ~{t} === Object))"))
```


---

```clj
{:full-name "cljs.core/instance?",
 :ns "cljs.core",
 :name "instance?",
 :type "function",
 :signature ["[t o]"],
 :source {:code "(defn instance? [t o]\n  (js* \"(~{o} != null && (~{o} instanceof ~{t} || ~{o}.constructor === ~{t} || ~{t} === Object))\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [652 653],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L652-L653"},
 :full-name-encode "cljs.core_instance_QMARK_",
 :clj-symbol "clojure.core/instance?",
 :history [["+" "0.0-927"]]}

```
