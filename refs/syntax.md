# ClojureScript Syntax

This is an index of ClojureScript's syntax forms, including syntax literals,
naming conventions, and other syntax patterns.  We hope that you can have any
question about syntax answered by referencing its appearance in this index.



To let you know which syntax forms are also available in Clojure or [edn], we
mark the syntax forms with clickable icons linking to the appropriate official
clojure/edn docs.

 <table>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"></td>
<td>
available in clojure
</td>
</tr>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"></td>
<td>
available in [edn]
</td>
</tr>
</table>

[edn]:https://github.com/edn-format/edn#edn

 <table>
<thead><tr>
<th colspan=2>=</th>
<th>Name</th>
<th>History</th>
</tr></thead>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#strings)</td>
<td><samp>["" string](syntax/string.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#characters)</td>
<td><samp>[\\ character](syntax/character.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#keywords)</td>
<td><samp>[: keyword](syntax/keyword.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td></td>
<td><samp>[:: keyword](syntax/keyword-qualify.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#symbols)</td>
<td><samp>[symbol literal](syntax/symbol.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#integers)</td>
<td><samp>[number literal](syntax/number.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#comments)</td>
<td><samp>[; comment](syntax/comment.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#lists)</td>
<td><samp>[() list](syntax/list.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#vectors)</td>
<td><samp>[\[\] vector](syntax/vector.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#maps)</td>
<td><samp>[{} map](syntax/map.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[@ deref](syntax/deref.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[^ meta](syntax/meta.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[' quote](syntax/quote.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[` syntax quote](syntax/syntax-quote.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[~ unquote](syntax/unquote.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[~@ unquote splicing](syntax/unquote-splicing.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[% arg](syntax/arg.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#-dispatch-character)</td>
<td><samp>[# dispatch](syntax/dispatch.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc4)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#tagged-elements)</td>
<td><samp>[# tagged literal](syntax/tagged-literal.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[#"" regex](syntax/regex.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#sets)</td>
<td><samp>[#{} set](syntax/set.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[#() function](syntax/function.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td></td>
<td><samp>[#' var](syntax/var.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc2)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#discard)</td>
<td><samp>[#_ ignore](syntax/ignore.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L113)</td>
<td></td>
<td><samp>[#= eval](syntax/eval.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L115)</td>
<td></td>
<td><samp>[#<> unreadable](syntax/unreadable.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L114)</td>
<td></td>
<td><samp>[#! shebang](syntax/shebang.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#booleans)</td>
<td><samp>[boolean literal](syntax/boolean.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#nil)</td>
<td><samp>[nil](syntax/nil.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6)</td>
<td><samp>[#uuid literal](syntax/uuid-literal.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#inst-rfc-3339-format)</td>
<td><samp>[#inst literal](syntax/inst-literal.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td></td>
<td></td>
<td><samp>[#queue literal](syntax/queue-literal.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/special_forms#toc18)</td>
<td></td>
<td><samp>[destructure \[\]](syntax/destructure-vector.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/special_forms#toc18)</td>
<td></td>
<td><samp>[destructure {}](syntax/destructure-map.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td></td>
<td></td>
<td><samp>[js/ namespace](syntax/js-namespace.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/java_interop#toc6)</td>
<td></td>
<td><samp>[Math/ namespace](syntax/Math-namespace.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/cheatsheet)</td>
<td></td>
<td><samp>[? predicate](syntax/predicate.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/cheatsheet)</td>
<td></td>
<td><samp>[! impure](syntax/impure.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/cheatsheet)</td>
<td></td>
<td><samp>[\*earmuffs\*](syntax/earmuffs.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/cheatsheet)</td>
<td></td>
<td><samp>[_ unused](syntax/unused.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/cheatsheet)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#general-considerations)</td>
<td><samp>[, comma](syntax/comma.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/cheatsheet)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#symbols)</td>
<td><samp>[/ namespace slash](syntax/namespace.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#syntax-quote)</td>
<td></td>
<td><samp>[# auto-gensym](syntax/auto-gensym.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.org/reader#toc1)</td>
<td></td>
<td><samp>[. dot](syntax/dot.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/clojure.core-api.html#clojure.core/&)</td>
<td></td>
<td><samp>[& rest](syntax/rest.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr valign=top>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](https://github.com/edn-format/edn#general-considerations)</td>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">](https://github.com/edn-format/edn#general-considerations)</td>
<td><samp>[whitespace](syntax/whitespace.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files
