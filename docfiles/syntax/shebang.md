---
name: syntax/shebang
display: "#! shebang"
see also:
---

## Summary

## Details

Equivalent to [doc:syntax/comment].

This is intended to allow executable ClojureScript files under Unix by allowing
the first line of the file to have a [shebang line](https://en.wikipedia.org/wiki/Shebang_(Unix)).

## Examples

```clj
#!/bin/cljs
;; waits for another form since #!/bin/cljs was ignored.

123 #! this is ignored
;;=> 123
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/comment]:https://github.com/cljs/api/blob/master/docfiles/syntax/comment.md
