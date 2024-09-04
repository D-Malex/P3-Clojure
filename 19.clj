; Definir una función para ordenar una lista de listas por longitud creciente.
;----------------------------------------------------------------------------


(defn order-by-log [lst]
    (let [keys (atom '()) values  (atom '())]
        (dotimes [i (count lst)] (reset! keys (conj @keys (count (nth lst i)))))
        (reset! keys (reverse @keys))

        (dotimes [i (count lst)] (reset! values (conj @values (nth lst i))))
        (reset! values (reverse @values))

        (vals (sort (zipmap @keys @values)))
))

(order-by-log '((1 2 3 4 5 6) (1) (1 2) (1 2 3 4) (1 2 3)))