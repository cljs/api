## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/..

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/..</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/..)
</td>
</tr>
</table>

 <samp>
(__..__ x form)<br>
(__..__ x form & more)<br>
</samp>

```
form => fieldName-symbol or (instanceMethodName-symbol args*)

Expands into a member access (.) of the first member on the first
argument, followed by the next member on the result, etc. For
instance:

(.. System (getProperties) (get "os.name"))

expands to:

(. (. System (getProperties)) (get "os.name"))

but is easier to write, read, and understand.
```

---

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1511-1527](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L1511-L1527)</ins>
</pre>

```clj
(defmacro ..
  ([x form] `(. ~x ~form))
  ([x form & more] `(.. (. ~x ~form) ~@more)))
```


---

```clj
{:ns "cljs.core",
 :name "..",
 :signature ["[x form]" "[x form & more]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core__DOT__DOT_",
 :source {:code "(defmacro ..\n  ([x form] `(. ~x ~form))\n  ([x form & more] `(.. (. ~x ~form) ~@more)))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [1511 1527],
          :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L1511-L1527"},
 :full-name "cljs.core/..",
 :clj-symbol "clojure.core/..",
 :docstring "form => fieldName-symbol or (instanceMethodName-symbol args*)\n\nExpands into a member access (.) of the first member on the first\nargument, followed by the next member on the result, etc. For\ninstance:\n\n(.. System (getProperties) (get \"os.name\"))\n\nexpands to:\n\n(. (. System (getProperties)) (get \"os.name\"))\n\nbut is easier to write, read, and understand."}

```
