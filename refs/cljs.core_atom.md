## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/atom

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/atom</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/atom)
</td>
</tr>
</table>

 <samp>
(__atom__ x)<br>
(__atom__ x & {:keys [meta validator]})<br>
</samp>

```
Creates and returns an Atom with an initial value of x and zero or
more options (in any order):

:meta metadata-map

:validator validate-fn

If metadata-map is supplied, it will be come the metadata on the
atom. validate-fn must be nil or a side-effect-free fn of one
argument, which will be passed the intended new state on any state
change. If the new state is unacceptable, the validate-fn should
return false or throw an Error.  If either of these error conditions
occur, then the value of the atom will not change.
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6731-6746](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L6731-L6746)</ins>
</pre>

```clj
(defn atom
  ([x] (Atom. x nil nil nil))
  ([x & {:keys [meta validator]}] (Atom. x meta validator nil)))
```


---

```clj
{:ns "cljs.core",
 :name "atom",
 :signature ["[x]" "[x & {:keys [meta validator]}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_atom",
 :source {:code "(defn atom\n  ([x] (Atom. x nil nil nil))\n  ([x & {:keys [meta validator]}] (Atom. x meta validator nil)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6731 6746],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L6731-L6746"},
 :full-name "cljs.core/atom",
 :clj-symbol "clojure.core/atom",
 :docstring "Creates and returns an Atom with an initial value of x and zero or\nmore options (in any order):\n\n:meta metadata-map\n\n:validator validate-fn\n\nIf metadata-map is supplied, it will be come the metadata on the\natom. validate-fn must be nil or a side-effect-free fn of one\nargument, which will be passed the intended new state on any state\nchange. If the new state is unacceptable, the validate-fn should\nreturn false or throw an Error.  If either of these error conditions\noccur, then the value of the atom will not change."}

```
