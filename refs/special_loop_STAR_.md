## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/loop\*

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
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:530-532](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/analyzer.clj#L530-L532)</ins>
</pre>

```clj
(defmethod parse 'loop*
  [op encl-env form _]
  (analyze-let encl-env form true))
```


---

```clj
{:full-name "special/loop*",
 :ns "special",
 :name "loop*",
 :type "special form",
 :source {:code "(defmethod parse 'loop*\n  [op encl-env form _]\n  (analyze-let encl-env form true))",
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [530 532],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/analyzer.clj#L530-L532"},
 :full-name-encode "special_loop_STAR_",
 :history [["+" "0.0-927"]]}

```
