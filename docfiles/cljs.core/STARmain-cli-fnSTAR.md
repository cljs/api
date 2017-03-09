---
name: cljs.core/*main-cli-fn*
see also:
---

## Summary

When compiled for a command-line target, whatever function
`*main-cli-fn*` is set to will be called with the command-line
argv as arguments.

## Details

Currently only available for Node (compiler option `:target :nodejs`)

## Examples

```clj
(defn -main [& args]
  (println "You passed the following command line args:")
  (println args))

(set! *main-cli-fn* -main)
```
