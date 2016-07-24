---
name: syntax/shebang
display as: "#! shebang"
see also:
---

## Summary

ClojureScript allows [shebang lines] simply by making `#!` equivalent to
[doc:syntax/comment].

`#!/usr/bin/env planck` - use Planck to execute this file

[shebang lines]:https://en.wikipedia.org/wiki/Shebang_(Unix)

## Details

## Examples

```clj
#!/bin/cljs
;; waits for another form since #!/bin/cljs was ignored.

123 #! this is ignored
;;=> 123
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/comment]:https://github.com/cljs/api/blob/master/docfiles/syntax/comment.md
