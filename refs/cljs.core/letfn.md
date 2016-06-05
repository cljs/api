## cljs.core/letfn



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/letfn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/letfn)
</td>
</tr>
</table>

<samp>(letfn fnspecs & body)</samp><br>

---

 <samp>
(__letfn__ fnspecs & body)<br>
</samp>

---

Takes a vector of function definitions `fnspecs` and binds the functions to
their names. All of the names are available in all of the definitions of the
functions as well as `body`.

`fnspecs` must be a vector with an even number of forms. See `let`.

`letfn` is a wrapper over one of ClojureScript's [special forms].

[special forms]:http://clojure.org/special_forms



---


###### See Also:

[`cljs.core/let`](../cljs.core/let.md)<br>

---


Source docstring:

```
fnspec ==> (fname [params*] exprs) or (fname ([params*] exprs)+)

Takes a vector of function specs and a body, and generates a set of
bindings of functions to their names. All of the names are available
in all of the definitions of the functions, as well as the body.
```


Source code @ [github]():

```clj
(defmacro letfn 
  [fnspecs & body] 
  `(letfn* ~(vec (interleave (map first fnspecs) 
                             (map #(cons `fn %) fnspecs)))
           ~@body))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/letfn` @ clojuredocs](http://clojuredocs.org/clojure.core/letfn)<br>
[`clojure.core/letfn` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/letfn/)<br>
[`clojure.core/letfn` @ crossclj](http://crossclj.info/fun/clojure.core/letfn.html)<br>
[`cljs.core/letfn` @ crossclj](http://crossclj.info/fun/cljs.core/letfn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/letfn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Takes a vector of function definitions `fnspecs` and binds the functions to\ntheir names. All of the names are available in all of the definitions of the\nfunctions as well as `body`.\n\n`fnspecs` must be a vector with an even number of forms. See `let`.\n\n`letfn` is a wrapper over one of ClojureScript's [special forms].\n\n[special forms]:http://clojure.org/special_forms",
 :ns "cljs.core",
 :name "letfn",
 :signature ["[fnspecs & body]"],
 :name-encode "letfn",
 :history [["+" "0.0-927"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/letfn",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/letfn"},
 :related ["cljs.core/let"],
 :full-name-encode "cljs.core/letfn",
 :source {:code "(defmacro letfn \n  [fnspecs & body] \n  `(letfn* ~(vec (interleave (map first fnspecs) \n                             (map #(cons `fn %) fnspecs)))\n           ~@body))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.9.0-alpha4",
          :filename "src/clj/clojure/core.clj",
          :lines [6314 6325],
          :url "https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/clj/clojure/core.clj#L6314-L6325"},
 :usage ["(letfn fnspecs & body)"],
 :full-name "cljs.core/letfn",
 :docstring "fnspec ==> (fname [params*] exprs) or (fname ([params*] exprs)+)\n\nTakes a vector of function specs and a body, and generates a set of\nbindings of functions to their names. All of the names are available\nin all of the definitions of the functions, as well as the body.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/letfn.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/letfn"]))
```

-->
