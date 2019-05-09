(ns euler.util)

(defn divide? [d n]
  (zero? (mod n d)))

(def sum (partial reduce +))

(def fibs
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))
