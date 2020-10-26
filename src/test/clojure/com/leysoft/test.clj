(ns com.leysoft.test
  (:require [clojure.test :refer :all]
            [com.leysoft.core :refer :all]))

(deftest a-test
  (testing "1 + 1 = 2"
    (is (= (+ 1 1) 2)))
  (testing "1 + 1 <= 2"
    (is (<= (+ 1 1) 2))))
