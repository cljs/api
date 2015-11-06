# ClojureScript Library API

The core ClojureScript library.

Some symbols are not namespaced:

- [Special Forms](library/special.md)
- [Special Forms (REPL)](library/specialrepl.md)

The rest of the symbols are in the following namespaces:

 <table>
<thead><tr>
<th>=</th>
<th>Namespace</th>
<th>Description</th>
</tr></thead>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html)</td>
<td>[cljs.core](library/cljs.core.md)</td>
<td>fundamental library of the ClojureScript language</td>
</tr>
<tr>
<td></td>
<td>[cljs.nodejs](library/cljs.nodejs.md)</td>
<td>nodejs support functions</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html)</td>
<td>[cljs.pprint](library/cljs.pprint.md)</td>
<td>a pretty-printer for printing data structures</td>
</tr>
<tr>
<td></td>
<td>[cljs.reader](library/cljs.reader.md)</td>
<td>a reader to parse text and produce data structures</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html)</td>
<td>[cljs.repl](library/cljs.repl.md)</td>
<td>macros auto-imported into a ClojureScript REPL</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.test-api.html)</td>
<td>[cljs.test](library/cljs.test.md)</td>
<td>a unit-testing framework</td>
</tr>
<tr>
<td></td>
<td>[clojure.browser.dom](library/clojure.browser.dom.md)</td>
<td>browser DOM library, wrapping [goog.dom](http://www.closurecheatsheet.com/dom)</td>
</tr>
<tr>
<td></td>
<td>[clojure.browser.event](library/clojure.browser.event.md)</td>
<td>browser event library, wrapping [goog.events](http://www.closurecheatsheet.com/events)</td>
</tr>
<tr>
<td></td>
<td>[clojure.browser.net](library/clojure.browser.net.md)</td>
<td>network communication library, wrapping [goog.net](http://www.closurecheatsheet.com/net)</td>
</tr>
<tr>
<td></td>
<td>[clojure.browser.repl](library/clojure.browser.repl.md)</td>
<td>evaluate compiled cljs in a browser. send results back to server</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers)</td>
<td>[clojure.core.reducers](library/clojure.core.reducers.md)</td>
<td>a library for reduction and parallel folding (parallelism not supported)</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.data-api.html)</td>
<td>[clojure.data](library/clojure.data.md)</td>
<td>non-core data functions</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.reflect-api.html)</td>
<td>[clojure.reflect](library/clojure.reflect.md)</td>
<td>deprecated</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.set-api.html)</td>
<td>[clojure.set](library/clojure.set.md)</td>
<td>set operations such as union/intersection</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.string-api.html)</td>
<td>[clojure.string](library/clojure.string.md)</td>
<td>string operations</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html)</td>
<td>[clojure.walk](library/clojure.walk.md)</td>
<td>a generic tree walker for Clojure data structures</td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html)</td>
<td>[clojure.zip](library/clojure.zip.md)</td>
<td>functional hierarchical zipper, w/ navigation/editing/enumeration</td>
</tr>
</table>

_See external API references for [Google Closure Library] and [JavaScript's
native library], both accessible from every ClojureScript application._

[Google Closure Library]:http://google.github.io/closure-library/api/
[JavaScript's native library]:https://developer.mozilla.org/docs/Web/JavaScript/Reference

