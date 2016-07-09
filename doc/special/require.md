## Name
special/require

## Type
special form (repl)

## Notes

description below taken from `repl-special-doc-map`

## Description

Only usable from a REPL.

Loads libs, skipping any that are already loaded. Each argument is
either a libspec that identifies a lib or a flag that modifies how all the identified
libs are loaded.

### Libspecs

A libspec is a lib name or a vector containing a lib name followed by
options expressed as sequential keywords and arguments.

Recognized options:

- `:as` takes a symbol as its argument and makes that symbol an alias to the
  lib's namespace in the current namespace.
- `:refer` takes a list of symbols to refer from the namespace..
- `:refer-macros` takes a list of macro symbols to refer from the namespace.
- `:include-macros` takes a list of macro symbols to refer from the namespace.

### Flags

A flag is a keyword. Recognized flags:

- `:reload` forces loading of all the identified libs even if they are
  already loaded
- `:reload-all` implies :reload and also forces loading of all libs that the
  identified libs directly or indirectly load via require or use
- `:verbose` triggers printing information about each load, alias, and refer

## Related
special/require-macros

## Examples

```clj
(require '[clojure/string :as string])
```
