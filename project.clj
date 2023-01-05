(defproject lancope-clojure "0.1.0-SNAPSHOT"
  :description "A Clojure re-implementation of the old Lancope interview test\n"

  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.lancope/gnode "2.0"]]
  :repl-options {:init-ns lancope-clojure.core})
