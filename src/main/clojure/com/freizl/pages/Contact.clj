;;
;; Generate a Class that would be invoked by Tapestry, a.k.a Java
;;

(ns com.freizl.pages.Contact)

(gen-class                                                   
    :name "com.freizl.pages.Contact"
    :methods [[getContactInfo [] String]]
    :prefix "")

(defn getContactInfo [this]
    "Contact Info from Contact.clj")
