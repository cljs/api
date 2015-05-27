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
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2827-2838](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2827-L2838)</ins>
</pre>

```clj
(defn pr-str-with-opts
  [objs opts]
  (let [first-obj (first objs)
        sb (gstring/StringBuffer.)]
    (doseq [obj objs]
      (when-not (identical? obj first-obj)
        (.append sb " "))
      (doseq [string (pr-seq obj opts)]
        (.append sb string)))
    (str sb)))
```


---

```clj
{:full-name "cljs.core/pr-str-with-opts",
 :ns "cljs.core",
 :name "pr-str-with-opts",
 :docstring "Prints a sequence of objects to a string, observing all the\noptions given in opts",
 :type "function",
 :signature ["[objs opts]"],
 :source {:code "(defn pr-str-with-opts\n  [objs opts]\n  (let [first-obj (first objs)\n        sb (gstring/StringBuffer.)]\n    (doseq [obj objs]\n      (when-not (identical? obj first-obj)\n        (.append sb \" \"))\n      (doseq [string (pr-seq obj opts)]\n        (.append sb string)))\n    (str sb)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2827 2838],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2827-L2838"},
 :full-name-encode "cljs.core_pr-str-with-opts",
 :history [["+" "0.0-927"]]}

```
