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
library and syntax.  To this end, this repo provides a tool to build the API reference for each
version of ClojureScript.

#### Branches

There are two main branches in this repo:

| Branch  | Description |
|---------|-------------|
| master  | API reference generator |
| [catalog](https://github.com/cljsinfo/api-refs/tree/catalog) | API reference release |

#### Version Tags

The catalog branch contains version tags for locating the API reference for
specific versions of ClojureScript.  You can use the [history
table](https://github.com/cljsinfo/api-refs/blob/catalog/HISTORY.md) to navigate
the version tags.

#### Catalog Files

The catalog branch has each of the generated files for exploring/using the API reference:

| Catalog File | Description |
|-----:|-------------|
| <samp>[autodocs.edn]</samp> | a data structure containing all API information |
| <samp>[README.md]</samp>    | an overview of the API with reference tables |
| <samp>[refs/\*.md]</samp>   | dedicated view for a specific API symbol |
| <samp>[HISTORY.md]</samp>   | table of all versions and their changes |
| <samp>[UNPORTED.md]</samp>  | list of symbols that are not ported from Clojure |

[autodocs.edn]:https://github.com/cljsinfo/api-refs/blob/catalog/autodocs.edn
[README.md]:https://github.com/cljsinfo/api-refs/blob/catalog/README.md
[refs/\*.md]:https://github.com/cljsinfo/api-refs/blob/catalog/refs/cljs.core_assoc-in.md
[HISTORY.md]:https://github.com/cljsinfo/api-refs/blob/catalog/HISTORY.md
[UNPORTED.md]:https://github.com/cljsinfo/api-refs/blob/catalog/UNPORTED.md

#### Better Docs

The [api docs project](https://github.com/cljsinfo/api-docs) is an effort to
combine this repo's generated API reference with detailed descriptions, example
usages, and cross-refs.

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

These are the source files concerned with the API reference generator:

| Source File | Description |
|------------:|-------------|
| <samp>[core.clj]</samp>        | main entry                                                      |
| <samp>[catalog.clj]</samp>     | builds a catalog or single version output                       |
| <samp>[clojure_api.clj]</samp> | retrieves original clojure api info to correlate with cljs      |
| <samp>[config.clj]</samp>      | filename constants and dynamic vars for output directories      |
| <samp>[docstring.clj]</samp>   | helpers for extracting/formatting/removing docstrings           |
| <samp>[parse.clj]</samp>       | parse namespaces for their symbols                              |
| <samp>[read.clj]</samp>        | read forms from namespaces                                      |
| <samp>[repo_cljs.clj]</samp>   | helpers for traversing official Clojure and ClojureScript repos |
| <samp>[result.clj]</samp>      | transforms parsed data into a final result structure            |
| <samp>[write.clj]</samp>       | writes all output files for the data created by `result.clj`    |
| <samp>[util.clj]</samp>        | miscellaneous functions                                         |


[core.clj]:src/cljs_api_gen/core.clj
[catalog.clj]:src/cljs_api_gen/catalog.clj
[clojure_api.clj]:src/cljs_api_gen/clojure_api.clj
[config.clj]:src/cljs_api_gen/config.clj
[docstring.clj]:src/cljs_api_gen/docstring.clj
[parse.clj]:src/cljs_api_gen/parse.clj
[read.clj]:src/cljs_api_gen/read.clj
[repo_cljs.clj]:src/cljs_api_gen/repo_cljs.clj
[result.clj]:src/cljs_api_gen/result.clj
[write.clj]:src/cljs_api_gen/write.clj
[util.clj]:src/cljs_api_gen/util.clj

[codox]:https://github.com/weavejester/codox
