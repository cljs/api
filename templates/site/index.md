# ClojureScript API/Syntax

This is a versioned API and syntax reference for ClojureScript, auto-generated
by [this project](https://github.com/cljsinfo/cljs-api-docs), and _supplemented
with your help_ by curated descriptions, examples, and cross-refs.

__[Offline version available here](https://github.com/cljsinfo/cljs-api-docs#offline-docset-for-dash)__

## Syntax

[ClojureScript's syntax forms]()

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
