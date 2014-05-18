(defproject cljsvalidate "0.1.0-SNAPSHOT"
  :description "Om plus brepl"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [om "0.6.2"]]

  :source-paths ["src/clj" "src/cljs"]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler {:output-to "resources/public/js/om_brepl.js"
                                   :output-dir "resources/public/js/out"
                                   :source-map true
                                   :optimizations :none}}]})
