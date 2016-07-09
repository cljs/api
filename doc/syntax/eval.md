## Name
syntax/eval

## Display
#= eval

## Usage
#=...

## Description

Allows the reader to evaluate the following form.

This feature is carried from tools.reader is not intended for use in ClojureScript,
though it works for basic forms not using symbols.

## Examples

```clj
#=123
;;=> 123

#="foo"
;;=> foo

(def foo 1)
#='foo
;;=> 1
```

The following is the output for the ClojureScript compiler on the JVM:

```clj
#=(+ 1 2)
;; java.lang.RuntimeException: Unable to resolve symbol: + in this context

#=(clojure.core/+ 1 2)
;;=> 3
```
