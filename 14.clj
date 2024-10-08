; La transcripción es el proceso en el que la secuencia de ADN de un gen se 
; copia (transcribe) para hacer una molécula de ARN. La cadena de ARN 
; transcrita se forma reemplazando cada nucleótido del ADN por su 
; complemento de ARN: G → C, C → G, T → A, A → U. Definir la función
; adn2arn que reciba una cadena de ADN y la devuelva transcrita en ARN.
;---------------------------------------------------------------------------

(defn adn2arn [ADN]
    (apply str 
    (map #(case % "G" "C" "C" "G" "T" "A" "A" "U") (map str ADN))))