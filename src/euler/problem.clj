(ns euler.problem
  (:require [euler.core :as e]))

(defn problem-1 [bound]
  (apply + (for [i (range bound)
                 :when (or (zero? (mod i 3))
                           (zero? (mod i 5)))]
             i)))
