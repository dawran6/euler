(ns euler.problem
  (:require [euler.util :as u]))

(defn problem-1 [bound]
  (u/sum (for [i (range bound)
               :when (or (u/divide? 3 i)
                         (u/divide? 5 i))]
           i)))

