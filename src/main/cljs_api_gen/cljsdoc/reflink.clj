(ns cljs-api-gen.cljsdoc.reflink)

(def reflink-pattern
  "Detect valid symbol references in markdown, not followed by ().
  Example: [cljs.core/foo], not [cljs.core/foo](example.com)"
  #"\[([a-z.-]+/[a-zA-Z0-9.><!?*+=/-]+)\](?!\()")

