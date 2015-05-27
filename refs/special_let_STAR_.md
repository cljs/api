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
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:794-796](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L794-L796)</ins>
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
          :lines [794 796],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L794-L796"},
 :full-name-encode "special_let_STAR_",
 :history [["+" "0.0-927"]]}

```
