(ns com.leysoft.modules.files)

(def file-path "/Users/will/Documents/workspaces/will-workspace/beginning-clojure/src/main/resources/test.txt")

;; Writer
(spit file-path "Hello")

;; Read
(println (slurp file-path))

(require '[clojure.java.io :as io])

(def reader (io/reader file-path))
(def lines (line-seq reader))
(println lines)
(.close reader)
