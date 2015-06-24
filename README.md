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

To this end, this repo provides:

- __API generator__ for each version of ClojureScript
- __manual docs__ to add extended descriptions and examples to each API symbol
- __published API__ for browsing the docs online
- __offline API__ for browsing the docs offline

### Branches

There are two main branches in this repo:

| Branch  | Description |
|---------|-------------|
| master  | API generator and manual docs |
| [catalog] | API release (force-pushed) |

### Pseudo-namespaces?

To help categorization of special case symbols that do not have a namespace, we
just invent some "psuedo-namespaces":

- `special` - special forms
- `specialrepl` - REPL special forms
- `syntax` - syntax forms (we think these deserve API docs too)

## Published API

The API docs are published to the [catalog] branch.

[catalog]:https://github.com/cljsinfo/api-refs/tree/catalog

### Version Tags

The catalog branch contains version tags for locating the API reference for
specific versions of ClojureScript.  You can use the [history
table](https://github.com/cljsinfo/api-refs/blob/catalog/HISTORY.md) to navigate
the version tags.

### Catalog Files

The catalog branch has each of the generated files for exploring/using the API reference:

| Catalog File | Description |
|-----:|:------------|
| <samp>[cljs-api.edn]</samp>  | a data structure containing all API information ([see format details]) |
| <samp>[README.md]</samp>     | an overview of the API with reference tables |
| <samp>[refs/\*.md]</samp>    | dedicated view for a specific API symbol |
| <samp>[HISTORY.md]</samp>    | table of all versions and their changes |
| <samp>[UNPORTED.md]</samp>   | list of symbols that are not ported from Clojure |
| <samp>[UNFINISHED.md]</samp> | table of symbols that have unfinished manual docs |

[README.md]:https://github.com/cljsinfo/api-refs/blob/catalog/README.md
[refs/\*.md]:https://github.com/cljsinfo/api-refs/blob/catalog/refs/cljs.core_assoc-in.md
[HISTORY.md]:https://github.com/cljsinfo/api-refs/blob/catalog/HISTORY.md
[UNPORTED.md]:https://github.com/cljsinfo/api-refs/blob/catalog/UNPORTED.md

[see format details]:cljs-api-format.edn

#### API EDN format

See [cljs-api-format.edn] for details on how the latest
[cljs-api.edn] file is structured.

[cljs-api-format.edn]:cljs-api-format.edn
[cljs-api.edn]:https://github.com/cljsinfo/api-refs/blob/catalog/cljs-api.edn

## Manual Docs

We write manual docs to add more detailed descriptions and usage examples to the generated API.

| File             | Description |
|-----------------:|:------------|
| [cljsdoc/]       | extended descriptions and examples for each symbol (as plaintext files) |
| [encode.clj]     | shows how to encode filenames for symbols<br>(e.g. `cljs.core/assoc!` to `cljs.core_assocBANG`) |
| [UNFINISHED.md]  | table for tracking which symbols are missing manual docs |
| [Examples Guide] | guide for writing examples |

[cljsdoc/]:cljsdoc
[encode.clj]:src/main/cljs_api_gen/encode.clj
[UNFINISHED.md]:https://github.com/cljsinfo/api-refs/blob/catalog/UNFINISHED.md
[Examples Guide]:https://github.com/cljsinfo/api-refs/wiki/Examples-Guide

_Pull requests welcome!_

### Example

See [cljs.core_assoc-in.cljsdoc](cljsdoc/cljs.core_assoc-in.cljsdoc)
for an example of the cljsdoc format.

### Validating

Run the following to compile and validate the manual docs:

```
lein run :cljsdoc
```

## The API generator

The API generator parses info from the ClojureScript repo and
merges it with the [manual docs](#manual-docs).

### Running

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

If you're just trying to generate the cljs-api.edn file, you can ignore this.
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


### Implementation

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
|------------:|:------------|
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


[core.clj]:src/main/cljs_api_gen/core.clj
[catalog.clj]:src/main/cljs_api_gen/catalog.clj
[clojure_api.clj]:src/main/cljs_api_gen/clojure_api.clj
[config.clj]:src/main/cljs_api_gen/config.clj
[docset.clj]:src/main/cljs_api_gen/docset.clj
[docstring.clj]:src/main/cljs_api_gen/docstring.clj
[encode.clj]:src/main/cljs_api_gen/encode.clj
[parse.clj]:src/main/cljs_api_gen/parse.clj
[syntax.clj]:src/main/cljs_api_gen/syntax.clj
[read.clj]:src/main/cljs_api_gen/read.clj
[repo_cljs.clj]:src/main/cljs_api_gen/repo_cljs.clj
[result.clj]:src/main/cljs_api_gen/result.clj
[write.clj]:src/main/cljs_api_gen/write.clj
[util.clj]:src/main/cljs_api_gen/util.clj

### Template Files

These are the mustache templates that we use to render the catalog files.

| Template File | Description |
|--------------:|:------------|
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
$ cd ..
$ lein run :docset
```

```sh
# Prepare a Pull Request commit to update published docset.
# (manual update steps will be printed)
$ script/docset-pr.sh
```

## License

The API reference generator is released under the MIT license, Copyright © 2014-2015 Shaun LeBron

The source code contained in the API reference files are EPL licensed, Copyright Rich Hickey.
