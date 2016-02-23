(ns sicp.chapter-1.exercise-1-8)


(defn average [& numbers]
  (/ (reduce + numbers) (count numbers)))


(defn square [x] (* x x))


(defn improve [guess x]
  (/ (+ (/ x (square guess)) (* 2 guess)) 3))


(defn good-enough? [prev current]
  (> 0.0001 (Math/abs (- prev current))))


(defn sqrt-iter [guess x prev]
  (if (good-enough? prev guess)
    guess
    (sqrt-iter (improve guess x) x guess)))


(defn sqrt3 [x] (sqrt-iter 1.0 x 100))
