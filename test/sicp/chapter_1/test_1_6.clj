(ns sicp.chapter-1.test-1-6
  (:require [clojure.test :refer :all]
            [sicp.test-helper :refer :all]
            [sicp.chapter-1.exercise-1-6 :refer :all]))


(defn nearly-equal [expected actual]
  (is (> 0.01 (abs (- expected actual)))))

(deftest test-1-6
  (assert-equal (average 1 2 3) 2)
  (assert-equal (abs 1) 1)
  (assert-equal (abs -1) 1)
  (nearly-equal (sqrt-iter 2.0 2) 1.414))
