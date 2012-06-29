;;
;; Generate a Class that would be invoked by Tapestry, a.k.a Java
;;

(ns com.stubhub.pages.About)

(gen-class
    :name "com.stubhub.pages.About"
    :methods [[getAboutInfo [] String]]
    :prefix "")

(defn getAboutInfo [this]
    "About Info from About.clj")
