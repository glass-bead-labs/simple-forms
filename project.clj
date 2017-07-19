(defproject simple-forms "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.671"]
                 [rum "0.10.8"]
                 [io.forward/yaml "1.0.6"]
                 ]
  :main ^:skip-aot simple-forms.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
