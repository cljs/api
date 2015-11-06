## # auto-gensym



 <table border="1">
<tr>
<td>special character</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#syntax-quote)
</td>
</tr>
</table>

<samp>foo#</samp><br>

---


(Only intended for use in a [`syntax-quote`][doc:syntax/syntax-quote].)

``foo#` => `foo__135__auto__`

Auto-generates a unique symbol with the given prefix, particularly one that
will not shadow any existing symbol in its resulting scope.  This is intended
as a convenience for creating hygienic macros without calling
[`gensym`][doc:cljs.core/gensym] directly.

Every symbol matching a unique `foo#` symbol within a syntax quoted form will
be replaced with the same generated symbol.

``(foo# foo#)` => `(foo__138__auto__ foo__138__auto__)`

Namespace-qualified symbols `foo/bar#` are not replaced.

[doc:syntax/syntax-quote]:../syntax/syntax-quote.md
[doc:cljs.core/gensym]:../cljs.core/gensym.md

---

###### Examples:

```clj
`foo#
;;=> foo__142__auto__
```

Namespace-qualified symbols are left alone.

```clj
`foo/bar#
;;=> foo/bar#
```



---
###### Examples:

Create safe local bindings:

```clj
`(let [x# 1]
   (+ x# 2))
;;=> (cljs.user/let [x__146__auto__ 1] (cljs.user/+ x__146__auto__ 2))
```



---

###### See Also:

[`cljs.core/gensym`](../cljs.core/gensym.md)<br>
[`` syntax quote`](../syntax/syntax-quote.md)<br>

---








 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/auto-gensym.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "(Only intended for use in a [doc:syntax/syntax-quote].)\n\n``foo#` => `foo__135__auto__`\n\nAuto-generates a unique symbol with the given prefix, particularly one that\nwill not shadow any existing symbol in its resulting scope.  This is intended\nas a convenience for creating hygienic macros without calling\n[doc:cljs.core/gensym] directly.\n\nEvery symbol matching a unique `foo#` symbol within a syntax quoted form will\nbe replaced with the same generated symbol.\n\n``(foo# foo#)` => `(foo__138__auto__ foo__138__auto__)`\n\nNamespace-qualified symbols `foo/bar#` are not replaced.",
 :ns "syntax",
 :name "auto-gensym",
 :history [["+" "0.0-927"]],
 :type "special character",
 :related ["cljs.core/gensym" "syntax/syntax-quote"],
 :full-name-encode "syntax/auto-gensym",
 :usage ["foo#"],
 :examples [{:id "432cda",
             :content "```clj\n`foo#\n;;=> foo__142__auto__\n```\n\nNamespace-qualified symbols are left alone.\n\n```clj\n`foo/bar#\n;;=> foo/bar#\n```"}
            {:id "cd51e7",
             :content "Create safe local bindings:\n\n```clj\n`(let [x# 1]\n   (+ x# 2))\n;;=> (cljs.user/let [x__146__auto__ 1] (cljs.user/+ x__146__auto__ 2))\n```"}],
 :full-name "syntax/auto-gensym",
 :display "# auto-gensym",
 :clj-doc "http://clojure.org/reader#syntax-quote"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/auto-gensym"]))
```

-->
