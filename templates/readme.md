# <img valign="middle" width="48px" src="http://i.imgur.com/Hi20huC.png"> ClojureScript API Reference

{{#release}}
 <table border="1">
<tr>
<td>__{{cljs-version}}__ [all](HISTORY.md)</td>
<td>{{cljs-date}}</td>
<td>[<img valign="middle" width="24px" src="http://i.imgur.com/1GjPKvB.png">
<kbd>Clojure {{clj-version}}</kbd>](http://clojure.github.io/clojure/branch-master/index.html)</td>
<td>[<img valign="middle" width="18px" src="http://i.imgur.com/yGyeE7k.png">
<kbd>Closure Lib {{gclosure-lib}}</kbd>](http://google.github.io/closure-library/api/)</td>
</tr>
</table>
{{/release}}

This is an auto-generated API reference for ClojureScript.  ClojureScript has
two APIs:  one for interacting with the compiler, and one for its standard
library.

 <dl>
<dt>[Library API](#library-api)</dt>
<dd>
The "Library API" is a loose classification of the symbols that you can use
inside any ClojureScript application.  They comprise ClojureScript's core
language features and standard libraries.
</dd>
<dt>[Compiler API](#compiler-api)</dt>
<dd>The "Compiler API" specifies how you can call out to the ClojureScript compiler
to perform analysis or compilation of ClojureScript code from a Clojure application.
</dd>
</dl>

## Library API

### Summary

Symbols from ClojureScript's core language features and libraries span multiple
sources:

|           | clojure | cljs compiler | cljs library | closure\* | js\* |
|-----------|:-------:|:-------------:|:------------:|:---------:|:----:|
| macros    | ☑       | ☑             | ☑            |           |      |
| functions |         |               | ☑            | ☑         | ☑    |
| vars      |         |               | ☑            | ☑         | ☑    |
| specials  |         | ☑             |              |           |      |

_\* included in and accessible from every ClojureScript application:_

- [Google Closure Library](http://google.github.io/closure-library/api/)
- [JavaScript's native library](https://developer.mozilla.org/docs/Web/JavaScript/Reference)

### Changes in {{#release}}{{cljs-version}}{{/release}}

 <table>
{{#no-changes}}<tr><td>_no symbols were added or removed in this version_</td></tr>{{/no-changes}}
{{#changes}}
<tr>
<td>
<img valign="middle" src="https://img.shields.io/badge/{{change}}-{{shield-text}}-{{shield-color}}.svg">
</td>
<td><samp>[{{&text}}]({{&link}})</samp></td>
</tr>
{{/changes}}
</table>

__[See Full History](HISTORY.md)__

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
