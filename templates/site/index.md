---
layout: page
title: API/Syntax Docs
sectionid: docs
---

# ClojureScript API/Syntax

{{#release}}
 <div id="release">
<div id="version">__{{cljs-version}}__ [all](/docs/versions.html)</div>
<div id="date">{{cljs-date}}</div>
<div id="clojure">[<img valign="middle" width="24px" src="http://i.imgur.com/1GjPKvB.png"> Clojure {{clj-version}}](http://clojure.github.io/clojure/branch-master/index.html)</div>
<div id="gclosure">[<img valign="middle" width="18px" src="http://i.imgur.com/yGyeE7k.png"> Closure Lib {{gclosure-lib}}](http://google.github.io/closure-library/api/)</div>
</div>
{{/release}}

This is a versioned API and syntax reference for ClojureScript, auto-generated
by [this project](https://github.com/cljsinfo/cljs-api-docs), and _supplemented
with your help_ by curated descriptions, examples, and cross-refs.

__[Offline version available here](https://github.com/cljsinfo/cljs-api-docs#offline-docset-for-dash)__

## Syntax

{{#syntax-api}}
{{#ns-symbols}}
[syntax forms]({{&ns-link}})
{{/ns-symbols}}
{{/syntax-api}}

## Library API

The core ClojureScript library.

{{#library-api}}
| Namespace | Description |
|-----------|-------------|
{{#ns-symbols}}
| [{{&ns-display}}]({{&ns-link}}) | {{&ns-description}} |
{{/ns-symbols}}
{{/library-api}}

## Compiler API

ClojureScript analysis and compilation.

This is currently not indexing the whole compiler, just the parts that are
expected to be public and stable.

{{#compiler-api}}
| Namespace | Description |
|-----------|-------------|
{{#ns-symbols}}
| [{{&ns-display}}]({{&ns-link}}) | {{&ns-description}} |
{{/ns-symbols}}
{{/compiler-api}}
