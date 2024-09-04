; Definir la función sig-mul-10 que reciba un número entero 
;y devuelva el primer múltiplo de 10 que lo supere.
;----------------------------------------------------------

(defn sig-mul-10 [ne]
    (if (integer? (/ ne 10))
        ne
        (* 10 (+ (/ ne 10) (- (+ 1 (quot ne 10)) (/ ne 10))))
))

; 21
; 2         (quot ne 10)
; 3         (+ 1 (quot ne 10))
; 2.1       (/ ne 10)
; 0.9       (- (+ 1 (quot ne 10)) (/ ne 10))
; 30        (* 10 (2.1+0.9))

(println)
(println "Ingresa 2  , el siguiente multiplo de 10 es " (sig-mul-10 2))
(println "Ingresa 15 , el siguiente multiplo de 10 es " (sig-mul-10 15))
(println "Ingresa 21 , el siguiente multiplo de 10 es " (sig-mul-10 21))
(println "Ingresa 100, el siguiente multiplo de 10 es " (sig-mul-10 100))
(println)