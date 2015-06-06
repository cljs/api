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
| [catalog](https://github.com/cljsinfo/api-refs/tree/catalog) | API reference release (force-pushed) |

#### Version Tags

The catalog branch contains version tags for locating the API reference for
specific versions of ClojureScript.  You can use the [history
table](https://github.com/cljsinfo/api-refs/blob/catalog/HISTORY.md) to navigate
the version tags.

#### Catalog Files

The catalog branch has each of the generated files for exploring/using the API reference:

| Catalog File | Description |
|-----:|-------------|
| <samp>[autodocs.edn]</samp> | a data structure containing all API information ([see format details]) |
| <samp>[README.md]</samp>    | an overview of the API with reference tables |
| <samp>[refs/\*.md]</samp>   | dedicated view for a specific API symbol |
| <samp>[HISTORY.md]</samp>   | table of all versions and their changes |
| <samp>[UNPORTED.md]</samp>  | list of symbols that are not ported from Clojure |

[autodocs.edn]:https://github.com/cljsinfo/api-refs/blob/catalog/autodocs.edn
[README.md]:https://github.com/cljsinfo/api-refs/blob/catalog/README.md
[refs/\*.md]:https://github.com/cljsinfo/api-refs/blob/catalog/refs/cljs.core_assoc-in.md
[HISTORY.md]:https://github.com/cljsinfo/api-refs/blob/catalog/HISTORY.md
[UNPORTED.md]:https://github.com/cljsinfo/api-refs/blob/catalog/UNPORTED.md

[see format details]:#autodocs-edn-format

##### Autodocs EDN format

```clj
{;; release data
 :release {;; clojurescript
           :cljs-version     "0.0-3297",
           :cljs-tag         "r3297",
           :cljs-date        "2015-05-23",

           ;; clojure
           :clj-version      "1.7.0-beta2",
           :clj-tag          "clojure-1.7.0-beta2",

           ;; tools.reader
           :treader-version  "0.9.2",
           :treader-tag      "tools.reader-0.9.2",

           ;; google closure library
           :gclosure-lib     "0.0-20150505-021ed5b3"},

 ;; symbols not ported from clojure
 :clj-not-cljs #{"clojure.core/the-ns"
                 "clojure.core/create-struct"
                 ;; ...
                 }

 ;; library api symbols and changes
 :library-api {:symbols
               {"cljs.core/keys"
                {:ns                "cljs.core",
                 :name              "keys",
                 :full-name         "cljs.core/keys",
                 :full-name-encode  "cljs.core_keys",
                 :clj-symbol        "clojure.core/keys",
                 :type              "function",
                 :docstring         "Returns a sequence of the map's keys."},
                 :signature         ["[hash-map]"],
                 :history           [["+" "0.0-927"]],
                 :source {:code     "... full source code ...",
                          :repo     "clojurescript"
                          :tag      "r3297"
                          :filename "src/main/cljs/cljs/core.cljs",
                          :lines    [7559 7563]},
                ;; ...
                }

               :changes
               [{:cljs-version     "0.0-3115",
                 :cljs-date        "2015-03-15",
                 :clj-version      "1.6.0",
                 :treader-version  "0.9.2",
                 :gclosure-lib     "0.0-20140718-946a7d39",
                 :added            #{"clojure.browser.repl/bootstrap"
                                     "clojure.browser.repl/load-queue"},
                 :removed          #{"cljs.core/load-file*"}}
                ;; ...
                ]}

 ;; compiler api symbols and changes
 :compiler-api {:symbols {} ;; same as :library-api :symbols
                :changes [] ;; same as :library-api :changes
                }}
```

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

---

 <table>
<tr><td>
:warning: __Markdown File generation requires a case-sensitive file system__

If you're just trying to generate the autodocs.edn file, you can ignore this.
Otherwise, the per-symbol markdown ref files will overwrite one another if
they have the same name when case is ignored by the file system. For example,
`cljs.core_cons.md` and `cljs.core_Cons.md` will clobber one another on Windows
and Mac since they consider them the same name, whereas Clojure recognizes them
as separate symbols.

See [Issue #48](https://github.com/cljsinfo/api-refs/issues/48) for how I solved
this on Mac.
</td></tr>
</table>

---


## Implementation

To build the API reference, we are doing self-analysis of literal forms created
from `tools.reader` rather than using `tools.analyzer`. We may use the helpful
wrapper [codox] if this becomes insufficient.

[codox]:https://github.com/weavejester/codox

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
| <samp>[docset.clj]</samp>      | generates the offline docset for Dash                           |
| <samp>[docstring.clj]</samp>   | helpers for extracting/formatting/removing docstrings           |
| <samp>[encode.clj]</samp>      | encoding scheme to create filenames for symbols                 |
| <samp>[parse.clj]</samp>       | parse namespaces for their symbols                              |
| <samp>[syntax.clj]</samp>      | all data related to syntax forms                                |
| <samp>[read.clj]</samp>        | read forms from namespaces                                      |
| <samp>[repo_cljs.clj]</samp>   | helpers for traversing official Clojure and ClojureScript repos |
| <samp>[result.clj]</samp>      | transforms parsed data into a final result structure            |
| <samp>[write.clj]</samp>       | writes all output files for the data created by `result.clj`    |
| <samp>[util.clj]</samp>        | miscellaneous functions                                         |


[core.clj]:src/cljs_api_gen/core.clj
[catalog.clj]:src/cljs_api_gen/catalog.clj
[clojure_api.clj]:src/cljs_api_gen/clojure_api.clj
[config.clj]:src/cljs_api_gen/config.clj
[docset.clj]:src/cljs_api_gen/docset.clj
[docstring.clj]:src/cljs_api_gen/docstring.clj
[encode.clj]:src/cljs_api_gen/encode.clj
[parse.clj]:src/cljs_api_gen/parse.clj
[syntax.clj]:src/cljs_api_gen/syntax.clj
[read.clj]:src/cljs_api_gen/read.clj
[repo_cljs.clj]:src/cljs_api_gen/repo_cljs.clj
[result.clj]:src/cljs_api_gen/result.clj
[write.clj]:src/cljs_api_gen/write.clj
[util.clj]:src/cljs_api_gen/util.clj

### Template Files

These are the mustache templates that we use to render the catalog files.

| Template File | Description |
|--------------:|-------------|
| <samp>[readme.md]</samp>   | API overview page |
| <samp>[ref.md]</samp>      | per-symbol details page |
| <samp>[history.md]</samp>  | version history and changes |
| <samp>[unported.md]</samp> | table of symbols not ported from clojure |

[readme.md]:templates/readme.md
[ref.md]:templates/ref.md
[history.md]:templates/history.md
[unported.md]:templates/unported.md

:+1: I use __[Grip]__ to preview the rendered github-flavored markdown.

[Grip]:https://github.com/joeyespo/grip

### Offline docset for Dash

![screenshot](http://i.imgur.com/ENMsXHc.png)

This is an offline ClojureScript API docset that can be read by the following apps:

- [Dash for Mac](https://kapeli.com/dash)
- [Zeal for Linux/Windows](http://zealdocs.org/)
- [Velocity for Windows](https://velocity.silverlakesoftware.com/)

There are two options for getting the docset:

1. __Manual:__ [Download ClojureScript.docset](https://github.com/cljsinfo/api-refs/releases) from latest release.
1. __Auto:__ Search "ClojureScript" in User-Contributed in Dash. This docset will auto-update.

    ![user-contributed](http://i.imgur.com/6z2gpCL.png)


#### Generating

This is currently a strange setup for making offline versions of GitHub's
rendered markdown pages for our API catalog.  This is expected to be temporary
while we work on better designed docs with usage examples, cross-refs, etc.

The process for creating this is documented in the commands below

```sh
# Go to docset working directory.
$ cd docset

# Download latest catalog HTML files from github.
# (Requires httrack.)
$ ./download-pages.sh

# Format pages to isolate the markdown views,
# and correct a few other things.
# (Requires phantomjs.)
$ ./format-pages.js
```

```sh
# Build docset for Dash.
# (errors will tell if you something isn't setup correctly)
$ lein run :docset
```

## License

The API reference generator is released under the MIT license, Copyright © 2014-2015 Shaun LeBron

The source code contained in the API reference files are EPL licensed, Copyright Rich Hickey.
