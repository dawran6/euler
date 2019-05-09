(ns euler.util)

(defn divide? [d n]
  (zero? (mod n d)))

(def sum (partial reduce +))
