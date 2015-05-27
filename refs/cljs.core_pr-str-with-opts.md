## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-str-with-opts

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-str-with-opts__ objs opts)<br>
</samp>

```
Prints a sequence of objects to a string, observing all the
options given in opts
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6332-6338](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6332-L6338)</ins>
</pre>

```clj
(defn pr-str-with-opts
  [objs opts]
  (if (empty? objs)
    ""
    (str (pr-sb-with-opts objs opts))))
```


---

```clj
{:full-name "cljs.core/pr-str-with-opts",
 :ns "cljs.core",
 :name "pr-str-with-opts",
 :docstring "Prints a sequence of objects to a string, observing all the\noptions given in opts",
 :type "function",
 :signature ["[objs opts]"],
 :source {:code "(defn pr-str-with-opts\n  [objs opts]\n  (if (empty? objs)\n    \"\"\n    (str (pr-sb-with-opts objs opts))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6332 6338],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6332-L6338"},
 :full-name-encode "cljs.core_pr-str-with-opts",
 :history [["+" "0.0-927"]]}

```
