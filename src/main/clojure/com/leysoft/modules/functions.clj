(ns com.leysoft.modules.functions)

;; Anonymous Function
(def f
  (fn []
    (println "Anonymous Function")))
(def o #(println "Other Anonymous Function"))
;; Call f and o
(f)
(o)

;; Function
(defn fun1 []
  (println "Function"))
;; Call fun1
(fun1)

;; Function with arguments
(defn fun2 [name]
  (println (str "Function with argument: " name)))
;; Call fun2
(fun2 "Name")

;; Function with arguments
(defn fun3 [name text]
  (println (str "Function with argument: " name text)))
;; Call fun2
(fun3 "Name" "Text")

(defn fun4 [& args]
  (println (str "Args: " (apply str args))))
(fun4 "A" "B" "C" "D")

(defn fun
  ([] "Empty Arguments")
  ([value] (str "OneArguments " value)))
(println (fun "Value"))

(defn fun5 [{ value :key }]
  (println (fun (str "Value " value))))
(fun5 { :key "Value" })