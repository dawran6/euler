(ns euler.util-test
  (:require [clojure.test :refer :all]
            [euler.util :refer :all]))

(deftest divide-test
  (is (true? (divides? 2 10)))
  (is (true? (divides? 1 0)))
  (is (false? (divides? 3 10))))

(deftest sum-test
  (is (= (sum '(1 1 1)) 3)))

(deftest fib-test
  (is (= (take 10 fibs) '(0 1 1 2 3 5 8 13 21 34))))

(deftest factors-test
  (is (= (factors 2) '(2)))
  (is (= (factors 12) '(2 2 3)))
  (is (= (factors 49) '(7 7)))
  (is (= (factors 2310) '(2 3 5 7 11))))

(deftest palindrome-test
  (is (true? (palindrome? 9009)))
  (is (false? (palindrome? 1234))))

(deftest factorize-test
  (is (= (factorize 10) {2 1
                         5 1}))
  (is (= (factorize 100) {2 2
                          5 2})))

(deftest primes-test
  (is (= (take 10 (primes)) '(2 3 5 7 11 13 17 19 23 29))))

(deftest pythagorean-test
  (is (true? (pythagorean-triplet? '(3 4 5))))
  (is (false? (pythagorean-triplet? '(3 4 6)))))
