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

## License

MIT, Copyright © 2014-2016 Shaun LeBron
