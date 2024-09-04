; Definir las funciones red, green, blue y alpha que reciban
; el valor numérico de un color de 32 bits y devuelvan, respectivamente,
; los valores de las componentes rojo, verde, azul y alfa 
; (RGBA: red, green, blue, alpha) del mismo.
;------------------------------------------------------------------------

(defn alpha [color32]
    (bit-shift-right (bit-and color32 0xFF000000) 24))

(defn red [color32]
    (bit-shift-right (bit-and color32 0x00FF0000) 16))

(defn green [color32]
    (bit-shift-right (bit-and color32 0x0000FF00) 8))

(defn blue [color32]
    (bit-and color32 0x000000FF))