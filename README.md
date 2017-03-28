# ClojureScript API Docs

Generates data for the __[API Documentation Site]__

- Create with: `lein run`
- Download data: [`cljs-api.edn`]
- Learn about data format: [`cljs-api-format.edn`]
- Contribute extra documentation in [`docfiles/`]

[API Documentation Site]:http://cljs.github.io/api/
[`cljs-api.edn`]:cljs-api.edn
[`cljs-api-format.edn`]:cljs-api-format.edn
[`docfiles/`]:docfiles

We parse every version of ClojureScript to build a versioned catalog for the
syntax, library, and compiler.  We also supplement this data with curated
descriptions, examples, cross-refs, and associate each ClojureScript form with
an equivalent Clojure form where appropriate.

CLJS master branch changes are represented with a pseudo-version ending in `+`.
For example, if `1.9.23` is latest published version, `1.9.23+` will represent
what is currently in master.

## License

MIT, Copyright © 2014-2017 Shaun LeBron
