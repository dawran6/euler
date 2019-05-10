(ns euler.util)

(defn divides? [d n]
  (zero? (mod n d)))

(defn sqrt [n] (Math/floor (Math/sqrt n)))

(defn sqr [n] (* n n))

(def sum (partial reduce +))

(defn pow [base exp] (reduce * (repeat exp base)))

(def fibs
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn factors [n]
  ((fn step [n p] (cond
                    (> p n) nil
                    (divides? p n) (cons p (lazy-seq (step (quot n p) p)))
                    :else (recur n (inc p))))
   n 2))

(def factorize
  (comp frequencies factors))

(defn palindrome? [n]
  (let [s (str n)]
    (= (seq s) (reverse s))))

(defn primes
  ([] (primes 2 []))
  ([i found-primes]
   (if (some
        #(divides? % i)
        (take-while #(<= (sqr %) i) found-primes))
     (recur (inc i) found-primes)
     (cons i (lazy-seq (primes (inc i) (conj found-primes i)))))))
