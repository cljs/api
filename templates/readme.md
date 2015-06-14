# <img valign="middle" width="48px" src="http://i.imgur.com/Hi20huC.png"> ClojureScript API Reference

{{#release}}
 <table border="1">
<tr>
<td>__{{cljs-version}}__ [all](HISTORY.md)</td>
<td>{{cljs-date}}</td>
<td>[<img valign="middle" width="24px" src="http://i.imgur.com/1GjPKvB.png">
<kbd>Clojure {{clj-version}}</kbd>](http://clojure.github.io/clojure/branch-master/index.html)</td>
<td>[<img valign="middle" width="18px" src="http://i.imgur.com/yGyeE7k.png">
<kbd>Closure Lib {{gclosure-lib}}</kbd>](http://www.closurecheatsheet.com/)</td>
</tr>
</table>
{{/release}}

This is an [auto-generated](https://github.com/cljsinfo/api-refs) API reference
for ClojureScript.  All information here is rendered from
[autodocs.edn](autodocs.edn), a data structure of the API information which you
can download and use yourself.

 <dl>
<dt>[Syntax API](#syntax-api)</dt>
<dd>
This is a reference section for the syntax of the language to allow connecting
the syntactic appearance to its conceptual name.  It also offers source
code of the syntax forms' reader functions for exploring implementation.
</dd>

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

---

## Latest Changes

Changes from __{{#release}}{{cljs-version}}{{/release}}__ ([See Full History](HISTORY.md)):

__Syntax API Changes__

{{#syntax-api}}
 <table>
{{#no-changes}}<tr><td>_no syntax forms were added or removed in this version_</td></tr>{{/no-changes}}
{{#changes}}
<tr>
<td>
<img valign="middle" src="https://img.shields.io/badge/{{change}}-{{shield-text}}-{{shield-color}}.svg">
</td>
<td><samp>[{{&text}}]({{&link}})</samp></td>
</tr>
{{/changes}}
</table>
{{/syntax-api}}

__Library API Changes__

{{#library-api}}
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
{{/library-api}}

__Compiler API Changes__

{{#compiler-api}}
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
{{/compiler-api}}

## Syntax API

Unlike the Library and Compiler API references, this Syntax API does not list
literal symbols that you can call to.  Rather, they represent conceptual names
for the language's building blocks.  When applicable, the __Form__ column shows
each entry's literal form (e.g. leading characters, delimiters).

Each entry contains the source code for how the syntax form is parsed.

ClojureScript's syntax has some intersection with Clojure and [edn], the extensible data notation.
To show this relationship, we mark the syntax forms as follows:

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


{{#syntax-api}}
{{#ns-symbols}}
 <table>
<thead><tr>
<th colspan=2>=</th>
<th>Name</th>
<th>Form</th>
<th>Type</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr valign=top>
<td>{{#clj-doc}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&.}}){{/clj-doc}}</td>
<td>{{#edn-doc}}[<img width="18px" valign="middle" src="http://i.imgur.com/I8uNXHv.png">]({{&.}}){{/edn-doc}}</td>
<td><samp>[{{&display-name}}]({{&link}})</samp></td>
<td><samp>{{#syntax-form}}{{&.}}<br>{{/syntax-form}}</samp></td>
<td><samp>{{&type}}</samp></td>
<td>{{#history}}{{&.}} {{/history}}</td>
</tr>
{{/symbols}}
</table>
{{/ns-symbols}}
{{/syntax-api}}

## Library API

### Sources

ClojureScript's core language features and libraries span multiple sources,
shown in the table below.

|                 | clojure            | cljs compiler      | cljs library       | closure\*          | js\*               |
|-----------------|:------------------:|:------------------:|:------------------:|:------------------:|:------------------:|
| macros          | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |                    |                    |
| functions       |                    |                    | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| vars            |                    |                    | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| specials        |                    | :heavy_check_mark: |                    |                    |                    |
| protocols       |                    |                    | :heavy_check_mark: |                    |                    |
| types           |                    |                    | :heavy_check_mark: |                    |                    |

_\* included in and accessible from every ClojureScript application:_

- [Google Closure Library](http://www.closurecheatsheet.com/)
- [JavaScript's native library](https://developer.mozilla.org/docs/Web/JavaScript/Reference)

### Clojure vs. ClojureScript

To show the significant overlap between Clojure and ClojureScript, we mark the symbols
in the following reference section as follows:

 <table>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"></td>
<td>
ported from Clojure (re-implemented)
</td>
</tr>
<tr>
<td><img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>→</samp></td>
<td>
imported directly from Clojure
</td>
</tr>
</table>

Also, see the :no_entry_sign: [Clojure symbols not yet ported](UNPORTED.md).

### Library API Reference

{{#library-api}}
| Namespace | Description |
|-----------|-------------|
{{#ns-symbols}}
| [{{&ns}}](#{{&ns-link}}) | {{&ns-description}} |
{{/ns-symbols}}

{{#ns-symbols}}
#### {{ns}}

 <table>
<thead><tr>
<th>=</th>
<th>Name</th>
<th>Type</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr>
<td>{{#clj-symbol}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&link}}){{#import}} <samp>→</samp>{{/import}}{{/clj-symbol}}</td>
<td><samp>{{&display-prefix}}[{{&display-name}}]({{&link}})</samp></td>
<td><samp>{{type}}</samp></td>
<td>{{#history}}{{&.}} {{/history}}</td>
</tr>
{{/symbols}}
</table>
{{/ns-symbols}}

{{/library-api}}

## Compiler API

### Compiler API Reference

{{#compiler-api}}
| Namespace | Description |
|-----------|-------------|
{{#ns-symbols}}
| [{{&ns}}](#{{&ns-link}}) | {{&ns-description}} |
{{/ns-symbols}}

{{#ns-symbols}}
#### {{ns}}

 <table>
<thead><tr>
<th>=</th>
<th>Name</th>
<th>Type</th>
<th>History</th>
</tr></thead>
{{#symbols}}
<tr>
<td>{{#clj-symbol}}[<img width="18px" valign="middle" src="http://i.imgur.com/1GjPKvB.png">]({{&link}}){{#import}} <samp>→</samp>{{/import}}{{/clj-symbol}}</td>
<td><samp>[{{&display-name}}]({{&link}})</samp></td>
<td><samp>{{type}}</samp></td>
<td>{{#history}}{{&.}} {{/history}}</td>
</tr>
{{/symbols}}
</table>
{{/ns-symbols}}

{{/compiler-api}}

----

_made by [@shaunlebron](http://twitter.com/shaunlebron)_
