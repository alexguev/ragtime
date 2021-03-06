(defproject org.clojars.alexguev.ragtime/ragtime.sql.files "0.3.4.1"
  :description "Ragtime adapter that reads migrations from SQL files. (patched with support to load migrations from classpath)"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [org.clojure/java.classpath "0.2.2"]]
  :profiles
  {:dev {:dependencies [[com.h2database/h2 "1.3.160"]
                        [org.clojars.alexguev.ragtime/ragtime.sql "0.3.4.1"]]}})
