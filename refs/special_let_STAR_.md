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
clojurescript @ r1424
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:487-489](https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/analyzer.clj#L487-L489)</ins>
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
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [487 489],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/analyzer.clj#L487-L489"},
 :full-name-encode "special_let_STAR_",
 :history [["+" "0.0-927"]]}

```
