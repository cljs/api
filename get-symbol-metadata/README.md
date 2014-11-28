# Get Symbol Metadata

This subproject generates symbol metadata from the clojure & clojurescript
repositories.  It outputs `docs-generated/*.cljsdoc` files (at project root)
for each API symbol containing the following information:

- name
- namespace
- type (function or macro)
- docstring
- source
- github link

## Setup

We use git submodules to associate our project's commits to commits in the
clojure & clojurescript repositories.  Run the following to populate the
submodule directories appropriately after cloning our project.

```
git submodule init
git submodule update
```

If clojure or clojurescript comes out with a new version that we want
to support with our docs, we go to `code-to-parse/<repo>`, where we
can run `git pull` and `git checkout` to bring it to a desired version.

After making this update, we have to back out of the submodule directories
by going to the directory of this readme.  From here, we have to `git add`
our update submodules, and `git commit` to save our changes.

__NOTE__: This allows us to easily update version and generate permanent github
links for each symbol.

## Run

This creates the `docs-generated/*.cljsdoc` files at project root:

```
lein run
```
