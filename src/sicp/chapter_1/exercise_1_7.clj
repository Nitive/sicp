(ns sicp.chapter-1.exercise-1-7)


(defn average [& numbers]
  (/ (reduce + numbers) (count numbers)))


(defn square [x] (* x x))


(defn improve [guess x]
  (average guess (/ x guess)))


(defn good-enough? [guess x]
  (> 0.0001 (Math/abs (- x (square guess)))))


(defn sqrt [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt (improve guess x) x)))
