(ns sicp.test-helper
  (:require [clojure.test :refer :all]))

(defn assert-equal
  [expected actual]
  (is (= expected actual)))
