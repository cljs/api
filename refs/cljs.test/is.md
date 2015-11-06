## cljs.test/is



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/is</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/is)
</td>
</tr>
</table>


 <samp>
(__is__ form)<br>
</samp>
 <samp>
(__is__ form msg)<br>
</samp>

---





Source docstring:

```
Generic assertion macro.  'form' is any predicate test.
'msg' is an optional message to attach to the assertion.

Example: (is (= 4 (+ 2 2)) "Two plus two should be 4")

Special forms:

(is (thrown? c body)) checks that an instance of c is thrown from
body, fails if not; then returns the thing thrown.

(is (thrown-with-msg? c re body)) checks that an instance of c is
thrown AND that the message on the exception matches (with
re-find) the regular expression re.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/clj/cljs/test.clj#L149-L165):

```clj
(defmacro is
  ([form] `(cljs.test/is ~form nil))
  ([form msg]
   `(cljs.test/try-expr ~msg ~form)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:149-165](https://github.com/clojure/clojurescript/blob/r2719/src/clj/cljs/test.clj#L149-L165)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/is` @ clojuredocs](http://clojuredocs.org/clojure.test/is)<br>
[`clojure.test/is` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/is/)<br>
[`clojure.test/is` @ crossclj](http://crossclj.info/fun/clojure.test/is.html)<br>
[`cljs.test/is` @ crossclj](http://crossclj.info/fun/cljs.test/is.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/is.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "is",
 :signature ["[form]" "[form msg]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test/is",
 :source {:code "(defmacro is\n  ([form] `(cljs.test/is ~form nil))\n  ([form msg]\n   `(cljs.test/try-expr ~msg ~form)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/clj/cljs/test.clj",
          :lines [149 165]},
 :full-name "cljs.test/is",
 :clj-symbol "clojure.test/is",
 :docstring "Generic assertion macro.  'form' is any predicate test.\n'msg' is an optional message to attach to the assertion.\n\nExample: (is (= 4 (+ 2 2)) \"Two plus two should be 4\")\n\nSpecial forms:\n\n(is (thrown? c body)) checks that an instance of c is thrown from\nbody, fails if not; then returns the thing thrown.\n\n(is (thrown-with-msg? c re body)) checks that an instance of c is\nthrown AND that the message on the exception matches (with\nre-find) the regular expression re."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/is"]))
```

-->
