(ns sicp.chapter-1.test-1-10
  (:require [clojure.test :refer :all]
            [sicp.test-helper :refer :all]
            [sicp.chapter-1.exercise-1-10 :refer :all]))


(deftest test-1-10
  (assert-equal (A 1 10) 1024)
  (assert-equal (A 2 4) 65536)
  (assert-equal (A 3 3) 65536))
