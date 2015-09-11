# ClojureScript Library API

The core ClojureScript library.

Some symbols are not namespaced:

{{#pseudo-ns-symbols}}
- [{{&ns-display}}]({{&ns-link}})
{{/pseudo-ns-symbols}}

The rest of the symbols are in the following namespaces:

| Namespace | Description |
|-----------|-------------|
{{#ns-symbols}}
| [{{&ns-display}}]({{&ns-link}}) | {{&ns-caption}} |
{{/ns-symbols}}

_See external API references for [Google Closure Library] and [JavaScript's
native library], both accessible from every ClojureScript application._

[Google Closure Library]:http://google.github.io/closure-library/api/
[JavaScript's native library]:https://developer.mozilla.org/docs/Web/JavaScript/Reference
