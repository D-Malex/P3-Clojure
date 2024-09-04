; Definir la función pot? que reciba dos números naturales y devuelva true 
; si el primero es potencia del segundo; si no, false.
;-------------------------------------------------------------------------

(defn cal-pot [nn0 mm nn1]
    (if (= nn0 nn1) true
    (if (> nn1 nn0) false
        (cal-pot nn0 mm (* nn1 mm))))
)

(defn pot? [nn0 nn1] (cal-pot nn0 nn1 nn1))

(println)
(println "(pot? 500 5)  =>"(pot? 500 5))
(println "(pot? 16 3)   =>"(pot? 16 3))
(println "(pot? 5 3)    =>"(pot? 5 3))
(println "(pot? 4 2)    =>"(pot? 4 2))
(println "(pot? 16 4)   =>"(pot? 16 4))
(println "(pot? 729 9)  =>"(pot? 729 9))
(println "(pot? 625 5)  =>"(pot? 625 5))
(println "(pot? 9 3)    =>"(pot? 9 3))
(println "(pot? 125 5)  =>"(pot? 125 5))
(println "(pot? (* 9 9 9 9 9 9 9 9 9 9 9) 9) =>"(pot? (* 9 9 9 9 9 9 9 9 9 9 9) 9))
(println)
