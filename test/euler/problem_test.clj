(ns euler.problem-test
  (:require [clojure.test :refer :all]
            [euler.problem :refer :all]))

(deftest problem-1-test
  (is (= (problem-1 10) 23)
      (= (problem-1 1000) 233168)))

(deftest problem-2-test
  (is (= (problem-2 10) 10)
      (= (problem-2 4000000) 4613732)))

(deftest problem-3-test
  (is (= (problem-3 100) 5))
  (is (= (problem-3 600851475143) 6857)))

(deftest problem-4-test
  (is (= (problem-4 2) 9009))
  (is (= (problem-4 3) 906609)))

(deftest problem-5-test
  (is (= (problem-5 10) 2520))
  (is (= (problem-5 20) 232792560)))

(deftest problem-6-test
  (is (= (problem-6 10) 2640))
  (is (= (problem-6 100) 25164150)))

(deftest problem-7-test
  (is (= (problem-7 6) 13))
  (is (= (problem-7 10001) 104743)))
