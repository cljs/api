;; Generate an overview of the main namespaces in the Google Closure Library
;;
;; git clone https://github.com/google/closure-library
;; ^ in repo run `bb googs.clj`
;;
;; OUTPUT:
;;
;;   Google Closure Library - main namespaces
;;
;;   :i  :ns               :type    :filename                                :overview
;;   0   goog.array        module   closure/goog/array/array.js              Utilities for manipulating arrays.
;;   1   goog.asserts      module   closure/goog/asserts/asserts.js          Utilities to check the preconditions, postconditions and invariants runtime.
;;   2   goog.color        provide  closure/goog/color/color.js              Utilities related to color and color conversion.
;;   3   goog.crypt        provide  closure/goog/crypt/crypt.js              Namespace with crypto related helper functions.
;;   4   goog.cssom        provide  closure/goog/cssom/cssom.js              CSS Object Model helper functions.
;;   5   goog.date         provide  closure/goog/date/date.js                Functions and objects for date representation and manipulation.
;;   6   goog.db           provide  closure/goog/db/db.js                    Wrappers for the HTML5 IndexedDB.
;;   7   goog.debug        provide  closure/goog/debug/debug.js              Logging and debugging utilities.
;;   8   goog.dispose      module   closure/goog/disposable/dispose.js       The dispose method is used to clean up references and resources.
;;   9   goog.dom          provide  closure/goog/dom/dom.js                  Utilities for manipulating the browser's Document Object Model Inspiration taken *heavily* from mochikit (http://mochikit.com/).
;;   10  goog.events       provide  closure/goog/events/events.js            An event manager for both native browser event targets and custom JavaScript event targets (`goog.events.Listenable`).
;;   11  goog.format       provide  closure/goog/format/format.js            Provides utility functions for formatting strings, numbers etc.
;;   12  goog.fs           provide  closure/goog/fs/fs.js                    Wrappers for the HTML5 File API.
;;   13  goog.functions    provide  closure/goog/functions/functions.js      Utilities for creating functions.
;;   14  goog.fx           provide  closure/goog/fx/fx.js                    Legacy stub for the goog.fx namespace.
;;   15  goog.graphics     provide  closure/goog/graphics/graphics.js        Graphics utility functions and factory methods.
;;   16  goog.iter         provide  closure/goog/iter/iter.js                Python style iteration utilities.
;;   17  goog.json         provide  closure/goog/json/json.js                JSON utility functions.
;;   18  goog.locale       provide  closure/goog/locale/locale.js            Functions for dealing with Date formatting & Parsing, County and language name, TimeZone list.
;;   19  goog.log          provide  closure/goog/log/log.js                  Basic strippable logging definitions.
;;   20  goog.math         provide  closure/goog/math/math.js                Additional mathematical functions.
;;   21  goog.memoize      module   closure/goog/memoize/memoize.js          Tool for caching the result of expensive deterministic functions.
;;   22  goog.messaging    provide  closure/goog/messaging/messaging.js      Functions for manipulating message channels.
;;   23  goog.object       module   closure/goog/object/object.js            Utilities for manipulating objects/maps/hashes.
;;   24  goog.positioning  provide  closure/goog/positioning/positioning.js  Common positioning code.
;;   25  goog.proto        provide  closure/goog/proto/proto.js              Protocol buffer serializer.
;;   26  goog.reflect      provide  closure/goog/reflect/reflect.js          Useful compiler idioms.
;;   27  goog.singleton    module   closure/goog/singleton/singleton.js      Provides an implementation for getInstance() methods.
;;   28  goog.soy          module   closure/goog/soy/soy.js                  Provides utility methods to render soy template.
;;   29  goog.string       provide  closure/goog/string/string.js            Utilities for string manipulation.
;;   30  goog.structs      provide  closure/goog/structs/structs.js          Generics method for collection-like classes and objects.
;;   31  goog.style        provide  closure/goog/style/style.js              Utilities for element styles.
;;   32  goog.testing      provide  closure/goog/testing/functionmock.js     Enable mocking of functions not attached to objects whether they be global / top-level or anonymous methods / closures.
;;   33  goog.tweak        provide  closure/goog/tweak/tweak.js              Provides facilities for creating and querying tweaks.
;;   34  goog.url          module   closure/goog/url/url.js                  Class for parsing strings into URLs using browser native resolution.
;;   35  goog.vec          provide  closure/goog/vec/vec.js                  Supplies global data types and constants for the vector math library.
;;   36  goog.webgl        provide  closure/goog/webgl/webgl.js              Constants used by the WebGL rendering, including all of the constants used from the WebGL context.
;;   37  goog.window       provide  closure/goog/window/window.js            Utilities for window manipulation.

(ns googs
  (:require
    [clojure.java.shell :refer [sh]]
    [clojure.java.io :as io]
    [clojure.string :as str]))

(defn goog-ns-class? [n]
  (not= n (str/lower-case n)))

(defn parse-goog-ns [line]
  (when-let [[_ filename type ns]
             (re-matches #"(.*):goog\.(provide|module)\('(.*)'\);" line)]
    {:filename filename
     :type type
     :ns ns
     :level (count (str/split ns #"\."))
     :class? (goog-ns-class? ns)}))

(defn table [entries keys]
  (let [sep "|"
        row #(str/join sep (map % keys))
        header (str/join sep keys)
        text (str/join "\n" (list* header (map row entries)))]
    (println (:out (sh "column" "-s" sep "-t" :in (str text "\n"))))))

(defn first-sentence [s]
  (if-let [i (str/index-of s ". ")]
    (subs s 0 (inc i))
    s))

(defn get-overview [filename]
  (with-open [rdr (io/reader filename)]
    (let [lines (line-seq rdr)
          start? #(str/includes? % "@fileoverview")
          end? #(or (str/starts-with? % " * @")
                    (#{"*/" "*" ""} (str/trim %)))
          match-lines (loop [[line & etc] lines, result []]
                        (if (seq result)
                          (if (end? line) result (recur etc (conj result line)))
                          (recur etc (if (start? line) (conj result line) result))))
          clean-line #(-> (str/replace % #" \* " "")
                          (str/replace #"@fileoverview " "")
                          (str/trim))
          overview (->> match-lines
                        (map clean-line)
                        (str/join " ")
                        (first-sentence))]
      overview)))

(let [lines (str/split-lines (:out (sh "git" "grep" "^goog\\.\\(provide\\|module\\)('goog" "closure")))
      names (->> lines
                 (map parse-goog-ns)
                 (filter #(str/ends-with? (:filename %) ".js"))         ;; only .js files
                 (remove #(str/ends-with? (:filename %) "_test.js"))    ;; remove test files
                 (remove #(str/includes? (:filename %) "test_module"))  ;; remove test_module for test files
                 (remove #(= (:ns %) "goog.module"))                    ;; remove placeholder
                 (remove #(= (:ns %) "goog.testing"))                   ;; remove since I think goog.setTestOnly makes these inaccessible
                 (remove :class?)                                       ;; remove everything we think is a class (capitals)
                 (sort-by :ns))
      mains (->> names
                 (filter #(= 2 (:level %)))
                 (map #(assoc % :overview (get-overview (:filename %))))
                 (map-indexed #(assoc %2 :i %1)))]
  (println "\nGoogle Closure Library - main namespaces\n")
  (table mains [:i :ns :type :filename :overview]))

