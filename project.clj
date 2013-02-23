(defproject environ-files "0.1.0-SNAPSHOT"

  :description "Explore the possibility of reading an environ env map from a file"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[environ "0.3.0"]]
  :plugins [[environ/environ.lein "0.3.0"]]
  :hooks [environ.leiningen.hooks]

  :profiles {:one {:env ~(read-string (slurp "resources/profiles/one.edn"))}
             :two {:env ~(read-string (slurp "resources/profiles/two.edn"))}
             :three {:env ~(read-string (slurp "resources/profiles/three.edn"))}})
