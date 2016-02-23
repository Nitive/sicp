(ns sicp.chapter-1.test-1-7
  (:require [clojure.test :refer :all]
            [sicp.test-helper :refer :all]
            [sicp.chapter-1.exercise-1-7 :refer :all]))


(deftest test-average
  (assert-equal (average 1 2 3) 2))

(deftest test-solution
  (map
    #(nearly-equal (sqrt %1) (Math/sqrt %1))
    '(3 5 50000 0.12034 4.234123 0.00000001)))
