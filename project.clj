(defproject ring "1.11.0-alpha3"
  :description "A Clojure web applications library."
  :url "https://github.com/ring-clojure/ring"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[ring/ring-core "1.11.0-alpha3"]
                 [ring/ring-devel "1.11.0-alpha3"]
                 [ring/ring-jetty-adapter "1.11.0-alpha3"]
                 [org.ring-clojure/ring-jakarta-servlet "1.11.0-alpha3"]]
  :plugins [[lein-sub "0.3.0"]
            [lein-codox "0.10.7"]]
  :sub ["ring-core"
        "ring-devel"
        "ring-jetty-adapter"
        "ring-servlet"]
  :codox {:output-path "codox"
          :source-uri "http://github.com/ring-clojure/ring/blob/{version}/{filepath}#L{line}"
          :source-paths ["ring-core/src"
                         "ring-devel/src"
                         "ring-jetty-adapter/src"
                         "ring-servlet/src"]}
  :aliases {"test"     ["sub" "test"]
            "test-all" ["sub" "test-all"]
            "bench"    ["sub" "-s" "ring-bench" "run"]})
