;;
;; Demostrate Invoke Clojure class from Clojure class
;;

(ns com.freizl.TestInvokeClojure
    (:use [clojure.test]
          [com.freizl.pages.AboutAnother]))

(deftest test-one
    (is (= "AboutAnother Info" (getAboutInfo))))
