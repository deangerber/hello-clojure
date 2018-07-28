(ns hello.core-test
  (:require [clojure.test :as t]
            [hello.core :as hc]))

(t/deftest core-tests
  (t/testing "it returns hello world"
    (t/is (= (with-out-str (hc/-main)) "Hello world!\n"))))
