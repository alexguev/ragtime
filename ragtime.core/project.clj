(defproject org.clojars.alexguev.ragtime/ragtime.core "0.3.4.1"
  :description "A database-independent migration library"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/tools.cli "0.2.2"]]
  :aot [ragtime.main]
  :clean-non-project-classes true
  :main ragtime.main)
