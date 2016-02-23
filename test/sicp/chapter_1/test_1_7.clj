(ns sicp.chapter-1.test-1-7
  (:require [clojure.test :refer :all]
            [sicp.test-helper :refer :all]
            [sicp.chapter-1.exercise-1-7 :refer :all]))


(defn nearly-equal [expected actual]
  (is (> 0.01 (Math/abs (- expected actual)))))

(deftest test-1-7
  (assert-equal (average 1 2 3) 2)
  (nearly-equal (sqrt 2.0 2) 1.414))
