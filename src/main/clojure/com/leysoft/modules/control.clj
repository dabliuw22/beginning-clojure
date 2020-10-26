(ns com.leysoft.modules.control)

;; Let exp
(let [x "Name"]
  (println (str "Hello " x))
  )

(def val 4)
(if (> val 0)
  (println "Valid")
  (println "Invalid"))

(def msg "Msg")
(if-not (empty? msg)
  (do
    (println "Valid")
    :ok))
  nil

(cond
  (= msg "Msg") :msg
  (= msg "Text") :text
  :other :nothing)

(case msg
  "Msg" :msg
  "Text" :text
  :nothing)
