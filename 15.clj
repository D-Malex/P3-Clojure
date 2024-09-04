; Definir una función para eliminar las ocurrencias de un dato escalar
; en una lista (a todo nivel).
;----------------------------------------------------------------------

(defn delete-element-frm-list [elmt lst]
    (filter #(not= elmt %) (flatten lst))
)