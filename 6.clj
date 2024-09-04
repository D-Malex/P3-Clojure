; Definir la función aprox-pi que reciba la cantidad de términos a
; considerar entre los paréntesis de la expresión 
; 4 · (1 - 1/3 + 1/5 - 1/7 + ... + 1/n) y devuelva la correspondiente
; aproximación de π.
;----------------------------------------------------------------------

(defn crear-alternador []
    (let [estado (atom +)] 
        (fn [] (swap! estado #(if (= % +) - +)) @estado)))
(def alternar (crear-alternador))

(defn aprox-pi [ct]
    (let [resultado 
        (* 4 (+ 1 (reduce + (map #(/ ((alternar)1) %) (range 3 ct 2)))))] (def alternador (atom +))
        resultado)
)


(println)
(println "Aproximacion a pi de 2 : " (aprox-pi 2))
(println "Aproximacion a pi de 9   " (aprox-pi 9))
(println "Aproximacion a pi de 21: " (aprox-pi 21))
(println)


