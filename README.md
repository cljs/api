# ClojureScript API Docs Generator
<img align="right" width="150" src="https://raw.githubusercontent.com/cljsinfo/cljs.info/master/00-scrap/cljs_logo_v10-01.png">

Hello! We are building a ClojureScript website. A section of this website will
be devoted to providing beautiful and informative documentation for the core
library and syntax.

This repo is dedicated to parsing all the possible documentation we can from
every version of the ClojureScript compiler and core library.  Our tool feeds
this crucial documentation data to the [larger sister
project](https://github.com/cljsinfo/api-docs), which combines it with curated
descriptions, examples, and cross-refs.

- __[Browse latest docs](https://github.com/cljsinfo/api-docs-generator/tree/docs)__
- __[Downloads](https://github.com/cljsinfo/api-docs-generator/releases)__

An `autodocs.edn` file is generated for each version with the following structure:
Some fields are pending work, marked `TODO`.

```clj
;; TOP-LEVEL
{:versions {:cljs ""      ;; clojurescript version
            :clj ""       ;; clojure version
            :closure ""}  ;; TODO: google closure version

 :clj-not-cljs #{}        ;; clojure symbols unavailable in clojurescript

 :library-api  {}         ;; API-DATA for core library
 :compiler-api {}         ;; TODO: API-DATA for compiler
 }
```

```clj
;; API-DATA
{:symbols {}              ;; api symbol => SYMBOL-DATA
 :changes [               ;; TODO: sorted by most recent version
           {:version ""   ;; TODO: version
            :added    #{} ;; TODO: symbols added
            :removed  #{} ;; TODO: symbols removed
            }]}
```

```clj
;; SYMBOL-DATA
{:full-name         "cljs.core/assoc-in"
 :clj-symbol        "clojure.core/assoc-in" ;; equivalent symbol in clojure
 :ns                "cljs.core"
 :name              "assoc-in"
 :type              "function"
 :signature         [[m [k & ks] v]]
 :docstring         "...full docstring..."
 :removed-version   ""  ;; TODO: last available version if symbol was removed
 :history           ["+r927"]
 :return-type       nil
 :source-filename   "clojurescript/src/cljs/cljs/core.cljs"
 :source-link       "https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L4018-L4025"
 :source            "...full source code..."}
```

__Readable Docs__ are also produced for each symbol.  For example, see:<br>
[`cljs.core_assoc-in.cljsdoc`](https://github.com/cljsinfo/api-docs-generator/blob/docs/docs/cljs.core_assoc-in.cljsdoc).

## Building the catalog

- __Full Catalog__: run the following to build a full catalog of docs. The
  catalog is a git repo with commits tagged for each version of ClojureScript.
  (It can be re-run to update your catalog with a newly released version)

    ```
    lein run '{:catalog :all}'
    ```

- __Partial Catalog__: for development purposes, you may wish to stop the
  process after a certain number of versions to verify its output.  The
  following will stop after 4 versions. (It can be re-run to process the next
  _n_ versions)

    ```
    lein run '{:catalog 4}'
    ```

- __Single Version Docs__: To generate docs for a single version (without symbol history data),
  pass it the tag value for the desired ClojureScript version.

    ```
    lein run '{:version "r3211"}'
    ```

- __Customize Output Directory__: The default output directory of a catalog is
  `catalog/`, and single-version output is written to `docs-<version>`.  To
  change this, use the `:out-dir` key:

    ```
    lein run '{:catalog :all, :out-dir "my-catalog"}'
    or
    lein run '{:version "r927", :out-dir "old-docs"}'
    ```

## Implementation

To gather docs, we are doing self-analysis of literal forms created from
`tools.reader` rather than using `tools.analyzer`. We may use the helpful
wrapper [codox] if this becomes insufficient.

It's worth nothing that parsing the full `cljs.core` namespace requires:

- finding __macros__ in `clojure.core` (specific clj version in `cljs/script/bootstrap`)
    - excluding those in `(:refer-clojure :exclude` in `cljs.core`
    - including those in `(import-macros clojure.core` in `cljs.core`
- finding __special-forms__ as `(defmethod parse` in `cljs.analyzer` (`cljs.compiler` for older)
    - (currently can't parse signatures and docstrings)

[codox]:https://github.com/weavejester/codox
