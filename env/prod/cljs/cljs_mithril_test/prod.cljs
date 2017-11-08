(ns cljs-mithril-test.prod
  (:require
    [cljs-mithril-test.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
