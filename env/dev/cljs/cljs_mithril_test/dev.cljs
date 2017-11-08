(ns ^:figwheel-no-load cljs-mithril-test.dev
  (:require
    [cljs-mithril-test.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
