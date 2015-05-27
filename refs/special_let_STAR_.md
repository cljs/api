## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/let\*

 <table border="1">
<tr>
<td>special form</td>
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
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:754-756](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L754-L756)</ins>
</pre>

```clj
(defmethod parse 'let*
  [op encl-env form _]
  (analyze-let encl-env form false))
```


---

```clj
{:full-name "special/let*",
 :ns "special",
 :name "let*",
 :type "special form",
 :source {:code "(defmethod parse 'let*\n  [op encl-env form _]\n  (analyze-let encl-env form false))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [754 756],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L754-L756"},
 :full-name-encode "special_let_STAR_",
 :history [["+" "0.0-927"]]}

```
