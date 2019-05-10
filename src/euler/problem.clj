(ns euler.problem
  (:require [euler.util :as u]))

(defn problem-1 [bound]
  (u/sum (for [i (range bound)
               :when (or (u/divide? 3 i)
                         (u/divide? 5 i))]
           i)))

(defn problem-2 [bound]
  (u/sum (for [i u/fibs
               :while (< i bound)
               :when (u/divide? 2 i)]
           i)))

(defn problem-3 [bound]
  (last (u/factors bound)))

(defn problem-4 [bound]
  (let [low (u/pow 10 (dec bound))
        high (u/pow 10 bound)]
    (apply max (for [i (range low high)
                     j (range i high)
                     :let [n (* i j)]
                     :when (u/palindrome? n)]
                 n))))

(defn problem-5 [bound]
  (->> (for [i (range (inc bound))] (u/factorize i))
       (apply merge-with max)
       (reduce (fn [acc [k v]] (* acc (u/pow k v))) 1)))
