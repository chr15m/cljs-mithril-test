(ns cljs-mithril-test.core
  (:require [m]))

(def m js/m)
(def render (aget m "render"))
(enable-console-print!)

(defn mount-root []
  (js/console.log "Hello")
  (print "Yes")
  (js/console.log "Again")
  (render (.getElementById js/document "app") (m "div" "Hello")))

(defn init! []
  (mount-root))
