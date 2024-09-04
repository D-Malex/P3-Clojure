; Definir una función para obtener el último símbolo de una lista 
; (a todo nivel).
;----------------------------------------------------------------

(defn get-last [lst] (last(flatten lst)))
(defn get-last [lst] (nth (flatten lst) (- (count (flatten lst)) 1)))