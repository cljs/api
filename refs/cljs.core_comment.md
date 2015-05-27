## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/comment

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/comment</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/comment)
</td>
</tr>
</table>

 <samp>
(__comment__ & body)<br>
</samp>

```
Ignores body, yields nil
```

---

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4165-4168](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L4165-L4168)</ins>
</pre>

```clj
(defmacro comment
  [& body])
```


---

```clj
{:ns "cljs.core",
 :name "comment",
 :signature ["[& body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_comment",
 :source {:code "(defmacro comment\n  [& body])",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [4165 4168],
          :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L4165-L4168"},
 :full-name "cljs.core/comment",
 :clj-symbol "clojure.core/comment",
 :docstring "Ignores body, yields nil"}

```
