;True
(defn funTrue [x] (defn f [y] x))

;False
(defn funFalse [x] (defn f [y] y))

;ToBoolean
(defn funToBoolean [x] ((x true) false))

;And
(defn funAnd [x] (defn f [y] ((x y) funFalse)))

;Or
(defn funOr [x] (defn f [y] ((x funTrue) y)))

;Not
(defn funNot [x] ((x funFalse) funTrue))

;Xor
(defn funXor [x] (defn f [y] ((x ((y funFalse) funTrue)) y) ))

;IfThenElse
(defn funITE [x] (defn f1 [y] (defn f2 [z] ((x y) z) )))

;Ejemplos
(funToBoolean ((funAnd funTrue) funTrue)) ;true

(funToBoolean ((funXor funTrue) funTrue)) ;false

(funToBoolean ((funXor funTrue) funFalse)) ;true

(((funITE funTrue) "Is true") "Is false") ;"Is true"