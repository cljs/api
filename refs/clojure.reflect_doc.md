## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.reflect/doc

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__doc__ sym)<br>
</samp>

```
Queries the reflection api with a fully qualified symbol, then prints
documentation information at the repl.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:44-48](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/reflect.cljs#L44-L48)</ins>
</pre>

```clj
(defn doc
  [sym]
  (meta sym print-doc))
```


---

```clj
{:full-name "clojure.reflect/doc",
 :ns "clojure.reflect",
 :name "doc",
 :docstring "Queries the reflection api with a fully qualified symbol, then prints\ndocumentation information at the repl.",
 :type "function",
 :signature ["[sym]"],
 :source {:code "(defn doc\n  [sym]\n  (meta sym print-doc))",
          :filename "clojurescript/src/cljs/clojure/reflect.cljs",
          :lines [44 48],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/reflect.cljs#L44-L48"},
 :full-name-encode "clojure.reflect_doc",
 :history [["+" "0.0-1503"]]}

```
