## cljs.core/Delay



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Delay</samp>](https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/jvm/clojure/lang/Delay.java)
</td>
</tr>
</table>

<samp>(Delay. f value)</samp><br>

---

 <samp>
(__Delay.__ f value)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype Delay [^:mutable f ^:mutable value]
  IDeref
  (-deref [_]
    (when f
      (set! value (f))
      (set! f nil))
    value)

  IPending
  (-realized? [x]
    (not f)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.lang/Delay` @ clojuredocs](http://clojuredocs.org/clojure.lang/Delay)<br>
[`clojure.lang/Delay` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Delay/)<br>
[`clojure.lang/Delay` @ crossclj](http://crossclj.info/fun/clojure.lang/Delay.html)<br>
[`cljs.core/Delay` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Delay.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Delay.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Delay",
 :signature ["[f value]"],
 :name-encode "Delay",
 :history [["+" "0.0-927"]],
 :type "type",
 :clj-equiv {:full-name "clojure.lang/Delay",
             :url "https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/jvm/clojure/lang/Delay.java"},
 :full-name-encode "cljs.core/Delay",
 :source {:code "(deftype Delay [^:mutable f ^:mutable value]\n  IDeref\n  (-deref [_]\n    (when f\n      (set! value (f))\n      (set! f nil))\n    value)\n\n  IPending\n  (-realized? [x]\n    (not f)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9438 9448],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/core.cljs#L9438-L9448"},
 :usage ["(Delay. f value)"],
 :full-name "cljs.core/Delay",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Delay.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Delay"]))
```

-->
