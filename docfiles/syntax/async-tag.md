---
name: syntax/async-tag
display as: "^:async"
since: 1.12.145
see also:
  - cljs.core/await
---

## Summary

Create a [JavaScript async function][js-async], wherein [doc:cljs.core/await] may be used.

- `(defn ^:async foo [] … (await …))`
- `(^:async fn [] … (await …))`
- `(deftest ^:async foo-test … (await …))`

[js-async]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/async_function

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/await]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/await.md
