## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/descendants

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/descendants</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/descendants)
</td>
</tr>
</table>

 <samp>
(__descendants__ tag)<br>
(__descendants__ h tag)<br>
</samp>

```
Returns the immediate and indirect children of tag, through a
relationship established via derive. h must be a hierarchy obtained
from make-hierarchy, if not supplied defaults to the global
hierarchy. Note: does not work on JavaScript type inheritance
relationships.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6953-6960](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L6953-L6960)</ins>
</pre>

```clj
(defn descendants
  ([tag] (descendants @global-hierarchy tag))
  ([h tag] (not-empty (get (:descendants h) tag))))
```


---

```clj
{:ns "cljs.core",
 :name "descendants",
 :signature ["[tag]" "[h tag]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_descendants",
 :source {:code "(defn descendants\n  ([tag] (descendants @global-hierarchy tag))\n  ([h tag] (not-empty (get (:descendants h) tag))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6953 6960],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L6953-L6960"},
 :full-name "cljs.core/descendants",
 :clj-symbol "clojure.core/descendants",
 :docstring "Returns the immediate and indirect children of tag, through a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy. Note: does not work on JavaScript type inheritance\nrelationships."}

```
