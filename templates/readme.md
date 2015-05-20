# <img valign="middle" width="48px" src="http://i.imgur.com/Hi20huC.png"> ClojureScript API Reference

{{#release}}

 <table border="1">
<tr>
<td>__{{cljs-version}}__ on {{cljs-date}}</td>
<td>[<img valign="middle" width="24px" src="http://i.imgur.com/1GjPKvB.png">
<kbd>Clojure {{clj-version}}</kbd>](http://clojure.github.io/clojure/branch-master/index.html)</td>
<td>[<img valign="middle" width="18px" src="http://i.imgur.com/yGyeE7k.png">
<kbd>Closure Lib {{gclosure-lib}}</kbd>](http://google.github.io/closure-library/api/)</td>
</tr>
</table>

Hello!  This is a generated API reference for the ClojureScript standard library.
ClojureScript shares a compilation environment with Clojure and a runtime
environment with Google Closure.  Thus, the standard available symbols
span the following sources:

|           | clojure | cljs compiler | cljs library | closure\* |
|-----------|:-------:|:-------------:|:------------:|:---------:|
| macros    | ☑       | ☑             | ☑            |           |
| functions |         |               | ☑            | ☑         |
| vars      |         |               | ☑            | ☑         |
| specials  |         | ☑             |              |           |

_\* Google Closure Library symbols are omitted in this API reference, but they can be
found [here](http://google.github.io/closure-library/api/)._


## Changes in {{cljs-version}}
{{/release}}

 <table>

{{#no-changes}}
<tr><td>_no symbols were added or removed in this version_</td></tr>
{{/no-changes}}

{{#changes}}
<tr>
<td><samp>{{&change}}</samp></td>
<td><samp>{{&type}}</samp></td>
<td><samp>[{{&text}}]({{&link}})</samp></td>
</tr>
{{/changes}}

</table>

## Namespaces

{{#ns-symbols}}
- [{{&ns}}](#{{&ns-link}})
{{/ns-symbols}}

{{#ns-symbols}}
### {{ns}}

 <table>
<thead><tr>
<th>=</th>
<th>Type</th>
<th>Name</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr>
<td>{{#clj-symbol}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&link}}){{/clj-symbol}}
<td><samp>{{type}}</samp></td>
<td><samp>[{{&display-name}}]({{&link}})</samp></td>
<td>{{#history}}{{&.}} {{/history}}</td>
</tr>
{{/symbols}}
</table>

{{/ns-symbols}}
