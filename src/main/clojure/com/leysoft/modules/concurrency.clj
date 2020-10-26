(ns com.leysoft.modules.concurrency)

;; Delays
;; Evaluating it only upon demand
(def d
  (delay
    (println "Running...")
    :done))
;; Demand
(deref d)

;; Future
(defn slow []
  (println "Init...")
  (Thread/sleep 1000)
  (println "End...")
  "Done")
(println @(future (slow)))

;; Promise
(defn other-slow []
  (let [p (promise)]
    (deliver p (@(future slow)))
    p))
;; (println (deref (other-slow)))
(println @(other-slow))

;; Atom
(def my-atom
  (atom []))
;; Get value
(println @my-atom)
;; Mutate value Synchronous and Uncoordinated
(swap! my-atom conj "New Value")
(println @my-atom)
;; Reset
(reset! my-atom [])
(println @my-atom)

;; Agents
(def my-agent
  (agent 0))
;; Get value
(println @my-agent)
;; Mutate value Asynchronous and Uncoordinated
(send-off my-agent inc)
(println @my-agent)

;; Ref
(def my-ref
  (ref 0))
;; Get value
(println @my-ref)
;; Mutate value Synchronous and Coordinated
(dosync
  (alter my-ref inc))
(println @my-ref)