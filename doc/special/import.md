## Name
special/import

## Signature
[& import-symbols-or-lists]

## Description

import-list => (closure-namespace constructor-name-symbols*)

Only usable from a REPL.

Import Google Closure classes.

## Examples

```clj
(import 'goog.math.Long
        '[goog.math Vec2 Vec3]
        '[goog.math Integer])

(Long. 4 6)
;;=> #<25769803780>

(Vec2. 1 2)
;;=> #<(1, 2)>

(Vec3. 1 2 3)
;;=> #<(1, 2, 3)>

(Integer.fromString "10")
;;=> #<10>
```
