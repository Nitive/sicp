(ns sicp.chapter-1.test-1-10
  (:require [clojure.test :refer :all]
            [sicp.test-helper :refer :all]
            [sicp.chapter-1.exercise-1-10 :refer :all]))


(deftest test-1-10-basic
  (assert-equal (A 1 10) 1024)
  (assert-equal (A 2 4) 65536)
  (assert-equal (A 3 3) 65536))

(deftest test-1-10-math-definitions
  (let [x 3]
    (assert-equal (f x) (* 2 x))
    (assert-equal (g x) (int (Math/pow 2 x)))))
