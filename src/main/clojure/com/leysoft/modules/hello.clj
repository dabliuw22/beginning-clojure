(ns com.leysoft.modules.hello
  (:gen-class))

;; Comment
(defn helloWorld []
  (def a 2)
  (def b 1.3)
  (println "Hello World")
  (println (+ a b)))

(helloWorld)