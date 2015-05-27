## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/this-as

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__this-as__ name & body)<br>
</samp>

```
Defines a scope where JavaScript's implicit "this" is bound to the name provided.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:205-209](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L205-L209)</ins>
</pre>

```clj
(defmacro this-as
  [name & body]
  `(let [~name (~'js* "this")]
     ~@body))
```


---

```clj
{:full-name "cljs.core/this-as",
 :ns "cljs.core",
 :name "this-as",
 :docstring "Defines a scope where JavaScript's implicit \"this\" is bound to the name provided.",
 :type "macro",
 :signature ["[name & body]"],
 :source {:code "(defmacro this-as\n  [name & body]\n  `(let [~name (~'js* \"this\")]\n     ~@body))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [205 209],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L205-L209"},
 :full-name-encode "cljs.core_this-as",
 :history [["+" "0.0-927"]]}

```
