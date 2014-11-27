# Get Symbol Metadata

This subproject generates symbol metadata from the clojure & clojurescript repositories.
(work in progress)

## Submodules

We use git submodules to associate our project's commits to commits in the
clojure & clojurescript repositories.  Run the following to populate the
submodule directories appropriately for a given project commit:

```
git submodule init
git submodule update
```

