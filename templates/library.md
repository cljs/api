# Library API

The core ClojureScript library.

These symbols span multiple sources, which you don't really need to know (see
table below).  We omit Google Closure\* and JavaScript\*\* symbols from this API
reference, though they are included in and accessible from every ClojureScript
application.

- [Google Closure Library](http://google.github.io/closure-library/api/)
- [JavaScript's native library](https://developer.mozilla.org/docs/Web/JavaScript/Reference)

|                 | clojure            | cljs compiler      | cljs library       | closure\*          | js\*\*             |
|-----------------|:------------------:|:------------------:|:------------------:|:------------------:|:------------------:|
| macros          | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |                    |                    |
| functions       |                    |                    | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| vars            |                    |                    | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| specials        |                    | :heavy_check_mark: |                    |                    |                    |
| protocols       |                    |                    | :heavy_check_mark: |                    |                    |
| types           |                    |                    | :heavy_check_mark: |                    |                    |

## Namespaces

| Namespace | Description |
|-----------|-------------|
{{#namespaces}}
| [{{&ns-display}}](#{{&ns-link}}) | {{&ns-caption}} |
{{/namespaces}}
