(ns com.leysoft.modules.records)

;; Types
(deftype Person [name])
;; Create
(def person
  (->Person "Name"))
(println person)
;; Get
(println (.name person))

;; Records
(defrecord User [email username])
;; Create
(def user
  (->User "test@email.com" "test"))
(println user)
;; Get
(println (:email user))

;; Protocol
(defprotocol Shape
  (area [this])
  (perimeter [this]))

(defrecord Circle [radio]
  Shape
  (area [this] (* (. Math PI) (:radio this) (:radio this)))
  (perimeter [this] (* 2 (:radio this) (. Math PI))))

(def circle
  (->Circle 4))

(println (area circle))
(println (perimeter circle))