; Definir la función cant-dig que reciba un número entero
; y devuelva la cantidad de dígitos que este tiene.
;---------------------------------------------------------

(defn cant-dig [ne] 
    (if (integer? ne) 
        (count (str ne)) 
        (println "ERROR: "ne" no es un numero entero")))


(println "ERRORS")
(println "(cant-dig \"123456\") =>"(cant-dig "123456"))
(println "(cant-dig 123456.0) =>"(cant-dig 123456.0))
(println)
(println "(cant-dig 1)         =>"(cant-dig 1))
(println "(cant-dig 123456)    =>"(cant-dig 123456))
(println "(cant-dig 121365489) =>"(cant-dig 121365489))
(println)