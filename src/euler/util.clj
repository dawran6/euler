(ns euler.util)

(defn divide? [d n]
  (zero? (mod n d)))

(defn sqrt [n] (Math/floor (Math/sqrt n)))

(def sum (partial reduce +))

(defn pow [base exp] (reduce * (repeat exp base)))

(def fibs
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn factors [n]
  ((fn step [n p] (cond
                    (> p n) nil
                    (divide? p n) (cons p (lazy-seq (step (quot n p) p)))
                    :else (recur n (inc p))))
   n 2))

(def factorize
  (comp frequencies factors))

(defn palindrome? [n]
  (let [s (str n)]
    (= (seq s) (reverse s))))
