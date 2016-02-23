(ns sicp.chapter-1.test-1-8
  (:require [clojure.test :refer :all]
            [sicp.test-helper :refer :all]
            [sicp.chapter-1.exercise-1-8 :refer :all]))


(deftest test-solution
  (map
    #(nearly-equal (sqrt3 %1) (Math/pow %1 (/ 1 3)))
    '(3 5 50000 0.12034 4.234123 0.00000001)))
