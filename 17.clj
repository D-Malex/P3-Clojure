; Definir una función para obtener el elemento central de una lista.
;------------------------------------------------------------------

(defn get-mean-elmnt [lst] 
    (nth lst (quot (count lst) 2)))