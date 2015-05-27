## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-subtract

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-subtract</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-subtract)
</td>
</tr>
</table>

 <samp>
(__unchecked-subtract__ & xs)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:317-318](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L317-L318)</ins>
</pre>

```clj
(defmacro unchecked-subtract
  ([& xs] `(- ~@xs)))
```


---

```clj
{:full-name "cljs.core/unchecked-subtract",
 :ns "cljs.core",
 :name "unchecked-subtract",
 :type "macro",
 :signature ["[& xs]"],
 :source {:code "(defmacro unchecked-subtract\n  ([& xs] `(- ~@xs)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [317 318],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L317-L318"},
 :full-name-encode "cljs.core_unchecked-subtract",
 :clj-symbol "clojure.core/unchecked-subtract",
 :history [["+" "0.0-1798"]]}

```
