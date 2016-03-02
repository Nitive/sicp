(ns sicp.chapter-1.exercise-1-10)

(defn A
  [x y]
  (cond
    (= y 0) 0
    (= x 0) (* 2 y)
    (= y 1) 2
    :else (A (- x 1)
             (A x (- y 1)))))

(defn f [n] (A 0 n))
(defn g [n] (A 1 n))
(defn h [n] (A 2 n))
