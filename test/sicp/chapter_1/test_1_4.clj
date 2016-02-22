(ns sicp.chapter-1.test-1-4
  (:require [clojure.test :refer :all]
            [sicp.test-helper :refer :all]
            [sicp.chapter-1.exercise-1-4 :refer :all]))

(deftest test-1-4
  (assert-equal (a-plus-abs-b 1 2) 3)
  (assert-equal (a-plus-abs-b 1 -2) 3)
  (assert-equal (a-plus-abs-b -1 -2) 1)
  (assert-equal (a-plus-abs-b -1 2) 1))
