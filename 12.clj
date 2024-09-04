; Definir la función repartir que, llamada sin argumentos, devuelva la
; cadena "Uno para vos, uno para mí". De lo contrario, se devolverá una 
; lista, en la que habrá una cadena "Uno para X, uno para mí" por cada
; argumento X.
;------------------------------------------------------------------------

(defn repartir 
    ([] "Uno para vos, uno para mi")
    ([& names] (map #(str "Uno para "%", uno mi") names))
)

(repartir)  "Uno para vos, uno para mi"
(repartir "juan") ("Uno para juan, uno mi")
(repartir "juan" "pepe") ("Uno para juan, uno mi" "Uno para pepe, uno mi")
(repartir "juan" "pepe" "paula")  ("Uno para juan, uno mi" "Uno para pepe, uno mi" "Uno para paula, uno mi")
(repartir "juan" "pepe" "paula" "matheo")  ("Uno para juan, uno mi" "Uno para pepe, uno mi" "Uno para paula, uno mi" "Uno para matheo, uno mi")
