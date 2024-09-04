; Definir una función para producir una lista con los elementos en las
; posiciones pares de dos listas dadas.
;------------------------------------------------------------------------

(defn list-even-elements [list0 list1]
    (concat 
        (map #(nth list0 %) (range 0 (count list0) 2))
        (map #(nth list1 %) (range 0 (count list1) 2))
))

; * AGREGADO PERSONAL: Para n listas
(defn list-even-elements [& lists]
    (flatten (map 
        (fn[lst] (map #(nth lst %) (range 0 (count lst) 2))) lists)))