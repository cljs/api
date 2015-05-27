## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/assert

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/assert</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/assert)
</td>
</tr>
</table>

 <samp>
(__assert__ x)<br>
(__assert__ x message)<br>
</samp>

```
Evaluates expr and throws an exception if it does not evaluate to
logical true.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:869-881](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L869-L881)</ins>
</pre>

```clj
(defmacro assert
  ([x]
     (when *assert*
       `(when-not ~x
          (throw (js/Error.
                  (cljs.core/str "Assert failed: " (cljs.core/pr-str '~x)))))))
  ([x message]
     (when *assert*
       `(when-not ~x
          (throw (js/Error.
                  (cljs.core/str "Assert failed: " ~message "\n" (cljs.core/pr-str '~x))))))))
```


---

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4246-4257](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L4246-L4257)</ins>
</pre>

```clj
(defmacro assert
  ([x]
     (when *assert*
       `(when-not ~x
          (throw (new AssertionError (str "Assert failed: " (pr-str '~x)))))))
  ([x message]
     (when *assert*
       `(when-not ~x
          (throw (new AssertionError (str "Assert failed: " ~message "\n" (pr-str '~x))))))))
```

---

```clj
{:ns "cljs.core",
 :name "assert",
 :signature ["[x]" "[x message]"],
 :shadowed-sources ({:code "(defmacro assert\n  ([x]\n     (when *assert*\n       `(when-not ~x\n          (throw (new AssertionError (str \"Assert failed: \" (pr-str '~x)))))))\n  ([x message]\n     (when *assert*\n       `(when-not ~x\n          (throw (new AssertionError (str \"Assert failed: \" ~message \"\\n\" (pr-str '~x))))))))",
                     :filename "clojure/src/clj/clojure/core.clj",
                     :lines [4246 4257],
                     :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L4246-L4257"}),
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_assert",
 :source {:code "(defmacro assert\n  ([x]\n     (when *assert*\n       `(when-not ~x\n          (throw (js/Error.\n                  (cljs.core/str \"Assert failed: \" (cljs.core/pr-str '~x)))))))\n  ([x message]\n     (when *assert*\n       `(when-not ~x\n          (throw (js/Error.\n                  (cljs.core/str \"Assert failed: \" ~message \"\\n\" (cljs.core/pr-str '~x))))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [869 881],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L869-L881"},
 :full-name "cljs.core/assert",
 :clj-symbol "clojure.core/assert",
 :docstring "Evaluates expr and throws an exception if it does not evaluate to\nlogical true."}

```
