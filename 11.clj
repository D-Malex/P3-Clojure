; Definir la función digs que reciba un número y devuelva una lista
; con sus dígitos.
;------------------------------------------------------------------

(defn parseInt [str-n] (Integer/parseInt str-n))

(defn digs [n] (map parseInt (map str (str n))))