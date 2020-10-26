(ns com.leysoft.modules.java
  (:import (java.util Date Calendar)))

(println (Date. (System/currentTimeMillis)))

(def now (Date.))
(println (. now getTime))
(println (.getTime now))

;; Thread t = new Thread() {
;;     public void run () {
;;          System.out.println("Run...);
;;     }
;; }

(def t
  (proxy [Thread] []
    (run [] (println "Run..."))))

(.run t)