## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/add-watch

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/add-watch</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/add-watch)
</td>
</tr>
</table>

 <samp>
(__add-watch__ iref key f)<br>
</samp>

```
Alpha - subject to change.

Adds a watch function to an atom reference. The watch fn must be a
fn of 4 args: a key, the reference, its old-state, its
new-state. Whenever the reference's state might have been changed,
any registered watches will have their functions called. The watch
fn will be called synchronously. Note that an atom's state
may have changed again prior to the fn call, so use old/new-state
rather than derefing the reference. Keys must be unique per
reference, and can be used to remove the watch with remove-watch,
but are otherwise considered opaque by the watch mechanism.  Bear in
mind that regardless of the result or action of the watch fns the
atom's value will change.  Example:

    (def a (atom 0)) 
    (add-watch a :inc (fn [k r o n] (assert (== 0 n))))
    (swap! a inc)
    ;; Assertion Error
    (deref a)
    ;=> 1
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3128-3150](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L3128-L3150)</ins>
</pre>

```clj
(defn add-watch
  [iref key f]
  (-add-watch iref key f))
```


---

```clj
{:ns "cljs.core",
 :name "add-watch",
 :signature ["[iref key f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_add-watch",
 :source {:code "(defn add-watch\n  [iref key f]\n  (-add-watch iref key f))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3128 3150],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L3128-L3150"},
 :full-name "cljs.core/add-watch",
 :clj-symbol "clojure.core/add-watch",
 :docstring "Alpha - subject to change.\n\nAdds a watch function to an atom reference. The watch fn must be a\nfn of 4 args: a key, the reference, its old-state, its\nnew-state. Whenever the reference's state might have been changed,\nany registered watches will have their functions called. The watch\nfn will be called synchronously. Note that an atom's state\nmay have changed again prior to the fn call, so use old/new-state\nrather than derefing the reference. Keys must be unique per\nreference, and can be used to remove the watch with remove-watch,\nbut are otherwise considered opaque by the watch mechanism.  Bear in\nmind that regardless of the result or action of the watch fns the\natom's value will change.  Example:\n\n    (def a (atom 0)) \n    (add-watch a :inc (fn [k r o n] (assert (== 0 n))))\n    (swap! a inc)\n    ;; Assertion Error\n    (deref a)\n    ;=> 1"}

```
