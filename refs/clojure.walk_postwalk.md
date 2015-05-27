## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/postwalk

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/postwalk</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/postwalk)
</td>
</tr>
</table>

 <samp>
(__postwalk__ f form)<br>
</samp>

```
Performs a depth-first, post-order traversal of form.  Calls f on
each sub-form, uses f's return value in place of the original.
Recognizes all Clojure data structures. Consumes seqs as with doall.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:50-56](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/walk.cljs#L50-L56)</ins>
</pre>

```clj
(defn postwalk
  [f form]
  (walk (partial postwalk f) f form))
```


---

```clj
{:ns "clojure.walk",
 :name "postwalk",
 :signature ["[f form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_postwalk",
 :source {:code "(defn postwalk\n  [f form]\n  (walk (partial postwalk f) f form))",
          :filename "clojurescript/src/cljs/clojure/walk.cljs",
          :lines [50 56],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/walk.cljs#L50-L56"},
 :full-name "clojure.walk/postwalk",
 :clj-symbol "clojure.walk/postwalk",
 :docstring "Performs a depth-first, post-order traversal of form.  Calls f on\neach sub-form, uses f's return value in place of the original.\nRecognizes all Clojure data structures. Consumes seqs as with doall."}

```
