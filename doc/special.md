---
name: special
display: "Special Forms"
see also:
---

## Summary

The core constructs of ClojureScript.

## Details

Special Forms are a small collection of symbols which comprise the core
constructs of ClojureScript, upon which all functions and macros are built.

These special forms are special in the sense that they are not in a designated
namespace.  They also have special argument evaluation rules specific to each
form to allow things not possible with normal functions or macros.

It should also be noted that special forms have reserved names which cannot be
shadowed by your own vars.
