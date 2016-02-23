(ns sicp.test-helper
  (:require [clojure.test :refer :all]))


(defn assert-equal [expected actual]
  (is (= expected actual)))


(defn nearly-equal [expected actual]
  (is (> 0.01 (Math/abs (- expected actual)))))
