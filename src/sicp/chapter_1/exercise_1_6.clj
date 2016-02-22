(ns sicp.chapter-1.exercise-1-6)


(defn average [& numbers]
  (/ (reduce + numbers) (count numbers)))


(defn abs [number]
  ((if (pos? number) + -) number))


(defn improve [guess x]
  (average guess (/ x guess)))


(defn good-enough? [guess x]
  (> 0.0001 (abs (- x (* guess guess)))))


(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)))
