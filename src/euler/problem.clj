(ns euler.problem
  (:require [clojure.string :as string]
            [euler.util :as u]))

(defn problem-1 [bound]
  (u/sum (for [i (range bound)
               :when (or (u/divides? 3 i)
                         (u/divides? 5 i))]
           i)))

(defn problem-2 [bound]
  (u/sum (for [i u/fibs
               :while (< i bound)
               :when (u/divides? 2 i)]
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

(defn problem-6 [bound]
  (let [ns             (range (inc bound))
        sum-of-squares (apply + (map u/sqr ns))
        square-of-sums (u/sqr (reduce + ns))]
    (- square-of-sums sum-of-squares)))

(defn problem-7 [bound]
  (nth (u/primes) (dec bound)))

(defn problem-8 [bound]
  (let [digits "73167176531330624919225119674426574742355349194934
96983520312774506326239578318016984801869478851843
85861560789112949495459501737958331952853208805511
12540698747158523863050715693290963295227443043557
66896648950445244523161731856403098711121722383113
62229893423380308135336276614282806444486645238749
30358907296290491560440772390713810515859307960866
70172427121883998797908792274921901699720888093776
65727333001053367881220235421809751254540594752243
52584907711670556013604839586446706324415722155397
53697817977846174064955149290862569321978468622482
83972241375657056057490261407972968652414535100474
82166370484403199890008895243450658541227588666881
16427171479924442928230863465674813919123162824586
17866458359124566529476545682848912883142607690042
24219022671055626321111109370544217506941658960408
07198403850962455444362981230987879927244284909188
84580156166097919133875499200524063689912560717606
05886116467109405077541002256983155200055935729725
71636269561882670428252483600823257530420752963450"]
    (->> (string/split-lines digits)
         (string/join "")
         (seq)
         (map #(Character/digit % 10))
         (partition bound 1)
         (map (partial apply *))
         (apply max))))

(defn problem-9 [bound]
  (for [a (range 1 bound)
        b (range (inc a) bound)
        :let [c (- bound a b)]
        :while (> c b a)
        :when (u/pythagorean-triplet? [a b c])]
    (* a b c)))

(comment


  )
