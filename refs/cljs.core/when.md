## cljs.core/when



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when)
</td>
</tr>
</table>

<samp>(when test & body)</samp><br>

---

 <samp>
(__when__ test & body)<br>
</samp>

---

Evaluates `test`. If logical true, evaluates `body` in an implicit `do`.

`when` is often used instead of `if` for conditions that do not have an "else".



---


###### See Also:

[`cljs.core/when-not`](../cljs.core/when-not.md)<br>
[`cljs.core/when-let`](../cljs.core/when-let.md)<br>
[`if`](../special/if.md)<br>

---


Source docstring:

```
Evaluates test. If logical true, evaluates body in an implicit do.
```


Source code @ [github]():

```clj
(defmacro when
  [test & body]
  (list 'if test (cons 'do body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/when` @ clojuredocs](http://clojuredocs.org/clojure.core/when)<br>
[`clojure.core/when` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/when/)<br>
[`clojure.core/when` @ crossclj](http://crossclj.info/fun/clojure.core/when.html)<br>
[`cljs.core/when` @ crossclj](http://crossclj.info/fun/cljs.core/when.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/when.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Evaluates `test`. If logical true, evaluates `body` in an implicit `do`.\n\n`when` is often used instead of `if` for conditions that do not have an \"else\".",
 :ns "cljs.core",
 :name "when",
 :signature ["[test & body]"],
 :name-encode "when",
 :history [["+" "0.0-927"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/when",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when"},
 :related ["cljs.core/when-not" "cljs.core/when-let" "special/if"],
 :full-name-encode "cljs.core/when",
 :source {:code "(defmacro when\n  [test & body]\n  (list 'if test (cons 'do body)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.9.0-alpha4",
          :filename "src/clj/clojure/core.clj",
          :lines [493 497],
          :url "https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/clj/clojure/core.clj#L493-L497"},
 :usage ["(when test & body)"],
 :full-name "cljs.core/when",
 :docstring "Evaluates test. If logical true, evaluates body in an implicit do.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/when.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/when"]))
```

-->
