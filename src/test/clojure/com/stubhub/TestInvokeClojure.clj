;;
;; Demostrate Invoke Clojure class from Clojure class
;;

(ns com.stubhub.TestInvokeClojure
    (:use [clojure.test]
          [com.stubhub.pages.AboutAnother]))

(deftest test-one
    (is (= "AboutAnother Info" (getAboutInfo))))
