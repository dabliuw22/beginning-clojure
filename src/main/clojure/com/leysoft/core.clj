(ns com.leysoft.core)

(require '[com.leysoft.modules.recursion :refer [my-sum]])
(require '[clojure.string :as s])

(defn foo []
  (println
    (my-sum 0 [1 2 3 4])))

(defn -main []
  (foo)
  (println
    (s/split "a,b,c" #",")))