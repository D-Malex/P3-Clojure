; Definir la función invertir que reciba un número entero no negativo 
; y lo devuelva espejado.
;--------------------------------------------------------------------

(defn parseInt [str-n] (Integer/parseInt str-n))
(defn valido? [nenn] (and (integer? nenn) (pos? nenn)))

(defn invertir [nenn]
    (if (valido? nenn) 
        (parseInt (apply str (reverse (str nenn)))) 
        "No es un numero valido, entero positivo."))


(println)
(println "El numero  123.0      invertida es " (invertir 123.0))
(println "El numero  123456789  invertido es " (invertir 123456789))
(println "La cadena \"123456789\" invertida es " (invertir "123456789"))
(println)