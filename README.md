
# ClojureScript API Reference

 <table>
<tr>
<td>
  __[Latest API Release](https://github.com/cljsinfo/api-refs/tree/catalog)__
</td>
</tr>
</table>

Hello! We are building a ClojureScript website. A section of this website will
be devoted to providing beautiful and informative documentation for the core
library and syntax.

To this end, this repo provides a tool to build the API reference for each
version of ClojureScript. The result is hosted on the
[`catalog`](https://github.com/cljsinfo/api-refs/tree/catalog) branch.

The [api docs project](https://github.com/cljsinfo/api-docs) also combines this
output with detailed descriptions, example usages, and cross-refs.

## Running

- __Full Catalog__: run the following to build a full catalog of docs. The
  catalog is a git repo with commits tagged for each version of ClojureScript.
  (It can be re-run to update your catalog with a newly released version)

    ```
    lein run '{:catalog :all}'
    ```

  NOTE: This is how the [catalog branch](https://github.com/cljsinfo/api-refs/tree/catalog)
  is [generated](script/build-publish.sh).


- __Partial Catalog__: for development purposes, you may wish to stop the
  process after a certain number of versions to verify its output.  The
  following will stop after 4 versions. (It can be re-run to process the next
  _n_ versions)

    ```
    lein run '{:catalog 4}'
    ```

- __Single Version Docs__: To generate docs for a single version (without symbol history data),
  pass it the tag value for the desired ClojureScript version, or `:latest` for the most recent
  version.

    ```
    lein run '{:version "r3211"}'
    or
    lein run '{:version :latest}'
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

To build the API reference, we are doing self-analysis of literal forms created
from `tools.reader` rather than using `tools.analyzer`. We may use the helpful
wrapper [codox] if this becomes insufficient.

It's worth nothing that parsing the full `cljs.core` namespace requires:

- finding __macros__ in `clojure.core` (specific clj version in `cljs/script/bootstrap`)
    - excluding those in `(:refer-clojure :exclude` in `cljs.core`
    - including those in `(import-macros clojure.core` in `cljs.core`
- finding __special forms__ as `(defmethod parse` in `cljs.analyzer` (`cljs.compiler` for older)
- finding __repl special forms__ in `cljs.repl`

### Source Files

- `core.clj` - main entry
- `catalog.clj` - builds a catalog or single version output
- `clojure_api.clj` - retrieves original clojure api info to correlate with cljs
- `config.clj` - filename constants and dynamic vars for output directories
- `docstring.clj` - helpers for extracting/formatting/removing docstrings
- `parse.clj` - parse namespaces for function/macro/special forms
- `read.clj` - read forms from namespaces
- `repo_cljs.clj` - helpers for traversing official Clojure and ClojureScript repos
- `result.clj` - transforms parsed data into a final result structure
- `write.clj` - writes all output files for the data created by `result.clj`
- `util.clj` - miscellaneous functions

[codox]:https://github.com/weavejester/codox
