## Special Forms

Special Forms are a small collection of symbols which comprise the core
constructs of ClojureScript, upon which all functions and macros are built.

These special forms are special in the sense that they are not in a designated
namespace.  They also have special argument evaluation rules specific to each
form to allow things not possible with normal functions or macros.

It should also be noted that special forms have reserved names which cannot be
shadowed by your own vars.



 <table>
<thead><tr>
<th>=</th>
<th>Name</th>
<th>History</th>
</tr></thead>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/.)</td>
<td><samp>[.](../special/DOT.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/catch)</td>
<td><samp>[catch](../special/catch.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/def)</td>
<td><samp>[def](../special/def.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[defrecord\*](../special/defrecordSTAR.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[deftype\*](../special/deftypeSTAR.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/do)</td>
<td><samp>[do](../special/do.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/finally)</td>
<td><samp>[finally](../special/finally.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[fn\*](../special/fnSTAR.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if)</td>
<td><samp>[if](../special/if.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[js\*](../special/jsSTAR.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[let\*](../special/letSTAR.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[letfn\*](../special/letfnSTAR.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
<tr>
<td></td>
<td><samp>[loop\*](../special/loopSTAR.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/new)</td>
<td><samp>[new](../special/new.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns)</td>
<td><samp>[ns](../special/ns.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/quote)</td>
<td><samp>[quote](../special/quote.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/recur)</td>
<td><samp>[recur](../special/recur.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set!)</td>
<td><samp>[set!](../special/setBANG.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/throw)</td>
<td><samp>[throw](../special/throw.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
<tr>
<td>[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/try)</td>
<td><samp>[try](../special/try.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1933"><img valign="middle" alt="[+] 0.0-1933" title="Added in 0.0-1933" src="https://img.shields.io/badge/+-0.0--1933-lightgrey.svg"></a> </td>
</tr>
</table>


---

###### Removed Symbols

 <table>
<thead><tr>
<th>=</th>
<th>Name</th>
<th>History</th>
</tr></thead>
<tr>
<td></td>
<td><samp>[~~try\*~~](../special/trySTAR.md)</samp></td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1933"><img valign="middle" alt="[×] 0.0-1933" title="Removed in 0.0-1933" src="https://img.shields.io/badge/×-0.0--1933-red.svg"></a> </td>
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
