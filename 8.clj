; Definir la función nth-fibo que reciba un número entero no negativo y 
; devuelva el correspondiente término de la sucesión de Fibonacci.
;-----------------------------------------------------------------------

(defn valido? [nenn] (and (integer? nenn) (pos? nenn)))

(defn fibo [nenn n0 n1]
    (if (= nenn 0) n0
        (fibo (- nenn 1) n1 (+ n0 n1))))

(defn nth-fibo [nenn] (
    if (not (valido? nenn))
        (println "ERROR: "nenn" no es un numero entero positivo.")
        (fibo nenn 0 1)))



(println)
(println "(nth-fibo -1)  => "(nth-fibo -1))
(println "(nth-fibo 1.2) => "(nth-fibo 1.2))
(println "(nth-fibo \"9\") => "(nth-fibo "9"))
(println "(nth-fibo 0)   => "(nth-fibo 0))

(println)
(println "(nth-fibo 1)   => "(nth-fibo 1))
(println "(nth-fibo 1)   => "(nth-fibo 3))
(println "(nth-fibo 5)   => "(nth-fibo 5))
(println "(nth-fibo 7)   => "(nth-fibo 7))
(println "(nth-fibo 13)   => "(nth-fibo 13))
(println)