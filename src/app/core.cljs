(ns app.core
  (:require
;;   [reagent.core :as r]
;;   [goog.dom :as gdom]
   [reagent.dom :as rdom]))

(defn app
  []
  [:div "Cheffy!"])

(defn ^:dev/after-load start
  []
  (rdom/render [app]
               (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))
