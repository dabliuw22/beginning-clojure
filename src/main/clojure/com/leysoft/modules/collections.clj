(ns com.leysoft.modules.collections)

;; Create List
(def l '(1 2 3 4))
;;(def l (list 1 2 3 4))
(println l)
(println (list? l))
;; First element
(println (first l))
;; Last element
(println (last l))

;; Create HashSet
(def hs #{ 1 2 3 4 })
;;(def hs (hash-set 1 2 3 4))
(println hs)
(println (set? hs))

;; Create Vector
(def v [1 2 3 4])
;;(def v (vector 1 2 3 4))
(println v)
(println (vector? v))

;; Create HashMap
(def m { :key1 1 :key2 2 })
;;(def m (hash-map :key1 1 :key2 2))
(println m)
(println (map? m))
;; Get by key
(println (:key1 m))
(println (m :key1))
(println
  (get m :key1))