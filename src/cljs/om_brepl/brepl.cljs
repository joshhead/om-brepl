(ns om-brepl.brepl
  (:require [clojure.browser.repl :as repl]))

(defn ^:export connect
  ([]
     (connect 9000))
  ([port]
     (repl/connect (str "http://localhost:" port "/repl"))))
