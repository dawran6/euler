(ns euler.problem-test
  (:require [clojure.test :refer :all]
            [euler.problem :refer :all]))

(deftest problem-1-test
  (is (= (problem-1 10) 23)
      (= (problem-1 1000) 233168)))

(deftest problem-2-test
  (is (= (problem-2 10) 10)
      (= (problem-2 4000000) 4613732)))
