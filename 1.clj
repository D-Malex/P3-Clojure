; Definir la función tercer-angulo que reciba los valores de dos de los ángulos
; interiores de un triángulo y devuelva el valor del restante.
;------------------------------------------------------------------------------

(defn tercer-angulo [angulo1, angulo2]
    (- 180 angulo1 angulo2)
)

(print "Si tenemos un angulo de 100 y otro de 25 el tercero es " (tercer-angulo 100 25))