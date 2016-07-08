## Name
syntax/shebang

## Display
#! shebang

## Description

Equivalent to [doc:syntax/comment].

This is intended to allow executable ClojureScript files under Unix by allowing
the first line of the file to have a [shebang line](https://en.wikipedia.org/wiki/Shebang_(Unix)).

## Example#de569a

```clj
#!/bin/cljs
;; waits for another form since #!/bin/cljs was ignored.

123 #! this is ignored
;;=> 123
```
