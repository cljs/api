# ClojureScript API Docs

This repo holds the API builder (run with `lein run`) and the latest API docs
file [cljs-api.edn], whose format is documented by [cljs-api-format.edn].  The
[site](https://github.com/cljs/site) repo reads this resulting data to build
the API pages seen here:

<http://cljs.github.io/api/>

We parse every version of ClojureScript to build a versioned catalog for the
syntax, library, and compiler.  It also supplements this data with curated
descriptions, examples, cross-refs found in the [cljsdoc] directory.
We also associate each ClojureScript form with an equivalent Clojure form.

[cljs-api.edn]:cljs-api.edn
[cljs-api-format.edn]:cljs-api-format.edn
[cljsdoc]:cljsdoc

## License

MIT, Copyright © 2014-2016 Shaun LeBron
