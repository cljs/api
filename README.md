__status 2015-07-21__: feature freeze. break time! moving to website form in August.

# ClojureScript API Docs Builder

 <table>
<tr>
<td>
[<img valign="middle" src="https://travis-ci.org/cljsinfo/cljs-api-docs.svg?branch=master">](https://travis-ci.org/cljsinfo/cljs-api-docs)
</td>
<td>
  __[:book: Latest API Documentation](https://github.com/cljsinfo/cljs-api-docs/blob/catalog/INDEX.md)__
</td>
</tr>
</table>

Hello! We are building a ClojureScript website. A section of this website will
be devoted to providing beautiful and informative documentation for the core
syntax, library and compiler.  This repo provides the means to generate this
documentation.

:page_facing_up: __[Doc page sample](https://github.com/cljsinfo/cljs-api-docs/blob/catalog/refs/cljs.core_assoc-in.md)__<br>
:seedling: [How to contribute docs](https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files)

![overview](http://i.imgur.com/y8t80rb.png)

---

| Git Branch  | Description |
|------------:|:------------|
| master      | API generator and manual docs |
| [catalog]   | API release (force-pushed) |

## Table of Contents

1. [Published API](#published-api)
1. [API Generator](#api-generator)
1. [Offline Docs](#offline-docset-for-dash)

## Published API


The API docs are published to the [catalog] branch. It contains _version tags_
for locating the API reference for specific versions of ClojureScript.  You can
use the [history
table](https://github.com/cljsinfo/cljs-api-docs/blob/catalog/HISTORY.md) to
navigate the version tags.

The catalog branch has each of the generated files for exploring/using the API reference:

| Catalog File | Description |
|-----:|:------------|
| <samp>[cljs-api.edn]</samp>\*  | a data structure containing all API information |
| <samp>[INDEX.md]</samp>     | an overview of the API with reference tables |
| <samp>[refs/\*.md]</samp>    | dedicated view for a specific API symbol |
| <samp>[HISTORY.md]</samp>    | table of all versions and their changes |
| <samp>[UNPORTED.md]</samp>   | list of symbols that are not ported from Clojure |
| <samp>[UNFINISHED.md]</samp> | table of symbols that have unfinished manual docs |

_\* see format details at [cljs-api-format.edn]_

[catalog]:https://github.com/cljsinfo/cljs-api-docs/tree/catalog
[INDEX.md]:https://github.com/cljsinfo/cljs-api-docs/blob/catalog/INDEX.md
[refs/\*.md]:https://github.com/cljsinfo/cljs-api-docs/blob/catalog/refs/cljs.core_assoc-in.md
[HISTORY.md]:https://github.com/cljsinfo/cljs-api-docs/blob/catalog/HISTORY.md
[UNPORTED.md]:https://github.com/cljsinfo/cljs-api-docs/blob/catalog/UNPORTED.md
[UNFINISHED.md]:https://github.com/cljsinfo/cljs-api-docs/blob/catalog/UNFINISHED.md

[cljs-api-format.edn]:cljs-api-format.edn
[cljs-api.edn]:https://github.com/cljsinfo/cljs-api-docs/blob/catalog/cljs-api.edn

### Pseudo-namespaces?

To help categorization of special case symbols that do not have a namespace, we
just invent some "psuedo-namespaces":

- `special` - special forms
- `specialrepl` - REPL special forms
- `syntax` - syntax forms (we think these deserve API docs too)

---

## API Generator

The API generator parses info from the ClojureScript repo and
merges it with the [manual docs](https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files).

 <table>
<tr>
<td>:warning:</td>
<td>
##### Case-Sensitive file system required!

Example: `cljs.core_cons.md` and `cljs.core_Cons.md` must represent different pages.
See [Issue #48](https://github.com/cljsinfo/cljs-api-docs/issues/48) for Mac solution.

</td></tr>
</table>

This will generate docs for the _latest version_ of ClojureScript
and output them to the `catalog/` folder:

```
$ lein run
```

The generator has to parse the previous versions of ClojureScript to understand
the symbol history (takes about 5-10 minutes), but they will be cached for much
faster subsequent runs (~10 seconds).

Use [Grip] to preview the docs:

```
$ grip catalog
 * Running on http://localhost:5000/ (Press CTRL+C to quit)
```

__Watch/auto-compile cljsdoc changes__ with the following:

```
$ lein run '{:watch? true}'
```

#### Advanced

The generator can take an optional map at the command line.
Use this to target a specific version or tag.

```
$ lein run '{:version "0.0-3211"}'
```

Or target the master branch:

```
$ lein run '{:version :master}'
```

Or generate the [catalog
branch](https://github.com/cljsinfo/cljs-api-docs/tree/catalog) containing
pages for every version:

```
$ lein run '{:catalog? true      ;; Create a git repo catalog w/ doc commits for each cljs version.
             :skip-pages? false  ;; Don't skip generating the docs pages for previous versions.
            }'
```

Full table of options:

| option | description | e.g. | default |
|---:|:-------|-------|------|
| `:task` | a side task to run instead of the main one | `:docset` `:cljsdoc` | `nil` |
| `:version` | version to process | `"<tag>"` `:latest` `:master` | `:latest` |
| `:catalog?` | create a catalog repo? | `true` `false` | `false` |
| `:skip-pages?` | skip page-creation for previous versions? | `true` `false` | `true` |
| `:skip-parse?` | skip parsing versions if already cached? | `true` `false` | `true` |
| `:watch?` | watch and recompile cljsdoc changes | `true` `false` | `false` |
| `:new-release` | force recognize new version (because maven api can be slow) | `1.7.10` | `nil` |

### Implementation

To build the API reference, we are doing self-analysis of literal forms created
from `tools.reader` rather than using `tools.analyzer`. We may use the helpful
wrapper [codox] if this becomes insufficient.

[codox]:https://github.com/weavejester/codox

Here is sample output of the parser to get an idea of the types of things we parse:

![parse-output](http://i.imgur.com/Bgq50Z3.png)

These are the source files concerned with the API reference generator:

| Source File | Description |
|------------:|:------------|
| <samp>[core.clj]</samp>        | main entry                                                      |
| <samp>[catalog.clj]</samp>     | builds the API catalog of docs for release                      |
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
| <samp>[display.clj]</samp>     | creates titles for pseudo-symbols and sorts them by namespace.  |
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
[display.clj]:src/main/cljs_api_gen/display.clj
[util.clj]:src/main/cljs_api_gen/util.clj

These are the mustache templates that we use to render the catalog files.

| Template File | Description |
|--------------:|:------------|
| <samp>[index.md]</samp>   | API overview page |
| <samp>[ref.md]</samp>      | per-symbol details page |
| <samp>[history.md]</samp>  | version history and changes |
| <samp>[unported.md]</samp> | table of symbols not ported from clojure |

[index.md]:templates/index.md
[ref.md]:templates/ref.md
[history.md]:templates/history.md
[unported.md]:templates/unported.md

:+1: I use __[Grip]__ to preview the rendered github-flavored markdown.

[Grip]:https://github.com/joeyespo/grip

---

## Offline docset for Dash

![screenshot](http://i.imgur.com/ENMsXHc.png)

This is an offline ClojureScript API docset that can be read by the following apps:

- [Dash for Mac](https://kapeli.com/dash)
- [Zeal for Linux/Windows](http://zealdocs.org/)
- [Velocity for Windows](https://velocity.silverlakesoftware.com/)

There are two options for getting the docset:

1. __Manual:__ [Download ClojureScript.docset](https://github.com/cljsinfo/cljs-api-docs/releases) from latest release.
1. __Auto:__ Search "ClojureScript" in User-Contributed in Dash. This docset will auto-update.

    ![user-contributed](http://i.imgur.com/6z2gpCL.png)


### Generating

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
$ lein run '{:task :docset}'
```

```sh
# Prepare a Pull Request commit to update published docset.
# (manual update steps will be printed)
$ script/docset-pr.sh
```

---

## License

MIT, Copyright © 2014-2015 Shaun LeBron
