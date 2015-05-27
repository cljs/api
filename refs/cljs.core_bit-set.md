## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-set

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-set)
</td>
</tr>
</table>

 <samp>
(__bit-set__ x n)<br>
</samp>

```
Set bit at index n
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:965-968](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L965-L968)</ins>
</pre>

```clj
(defn bit-set
  [x n]
  (cljs.core/bit-set x n))
```


---

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:175-176](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L175-L176)</ins>
</pre>

```clj
(defmacro bit-set [x n]
  (list 'js* "(~{} | (1 << ~{}))" x n))
```

---

```clj
{:ns "cljs.core",
 :name "bit-set",
 :signature ["[x n]"],
 :shadowed-sources ({:code "(defmacro bit-set [x n]\n  (list 'js* \"(~{} | (1 << ~{}))\" x n))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [175 176],
                     :link "https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L175-L176"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-set",
 :source {:code "(defn bit-set\n  [x n]\n  (cljs.core/bit-set x n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [965 968],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L965-L968"},
 :full-name "cljs.core/bit-set",
 :clj-symbol "clojure.core/bit-set",
 :docstring "Set bit at index n"}

```
