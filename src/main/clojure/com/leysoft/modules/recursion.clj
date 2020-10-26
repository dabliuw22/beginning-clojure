(ns com.leysoft.modules.recursion)

(defn my-sum
  ([] 0)
  ([values] (my-sum 0 values))
  ([total values]
   (if (empty? values)
     total
     (recur
       (+ (first values) total)
       (rest values)))))

(def total (my-sum '(1, 2, 3, 4, 5)))

(println total)

(def total2
  (reduce
    (fn [sum value] (+ sum value))
    0
    '(1 2 3 4 5)))

(println total2)
