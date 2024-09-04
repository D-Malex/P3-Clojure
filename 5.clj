; Definir la función capicua? que reciba un número entero no negativo
; de hasta 5 dígitos y devuelva true si el número es capicúa; si no, false.
;--------------------------------------------------------------------------

(defn capicua? [ne] 
    (= (str ne)  (apply str(reverse (str ne)))))

(println)
(println "Ingresa 123654  es capicua? " (capicua? 123654))
(println "Ingresa 1235321 es capicua? " (capicua? 1235321))
(println "Ingresa 1       es capicua? " (capicua? 1))
(println)
