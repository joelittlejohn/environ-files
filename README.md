# environ-files

Explore the possibility of reading an environ env map from a file. The trick being to slurp an [edn](https://github.com/edn-format/edn) file into the project.clj like:

```clj
{:env ~(read-string (slurp "resources/profiles/one.edn"))}
```

## Usage

```sh
lein with-profile one jar && cat .lein-env

lein with-profile two jar && cat .lein-env

lein with-profile three jar && cat .lein-env
```

## License

Copyright © 2013 Joe Littlejohn

Distributed under the Eclipse Public License, the same as Clojure.
