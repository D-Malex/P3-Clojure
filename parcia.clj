
(defn repartir [lmnt lst]
    (map #(cons % (list lmnt)) lst))

(defn repartir [lmnt lista1]
    (let [result (atom '())] 
        (dotimes [i (count lista1)] 
            (reset! result (conj (conj @result (nth lista1 i)) lmnt)))
        (reverse @result))
)

