(ns om-brepl.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn hello-component [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/h1 nil "Hello " (:who data) " " (:count data)))))

(def app-data (atom {:who "Om" :count 0}))

(om/root
 hello-component
 app-data
 {:target (.getElementById js/document "app")})


(comment
  (js/alert "Hello browser")
  (.log js/console "Hello console")

  ;; Make sure to eval the ns form before trying the following
  (swap! app-data #(assoc % :who "Emacs"))
  (swap! app-data #(update-in % [:count] inc))
)

