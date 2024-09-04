; Un ISBN-10 es válido si sus 10 dígitos x1, x2, x3, ... x10 cumplen lo 
; siguiente:
; (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9 * 2 + x10 * 1) mod 11 == 0
; Un ISBN-10 está dividido en cuatro partes: el código de país o lengua de
; origen (de 1 a 5 dígitos), el editor, el número del artículo y un dígito 
; de control. Opcionalmente, estas cuatro partes pueden estar separadas 
; mediante espacios en blanco o guiones.
; El dígito de control puede valer X que representa el valor 10. POR EJ,
; 3-598-21507-X es un ISBN-10 válido. Escribir la función isbn-10? que 
; devuelve true si la cadena recibida es un ISBN-10 válido; si no, false.
;--------------------------------------------------------------------------

(defn parseInt [str-n] (Integer/parseInt str-n))


(defn ISBN-10? [isbn]
    (let[   pais (parseInt (str (first isbn)))
            pisbn (control-dig (no-space isbn))
        ]
        (if (not (and (pos? pais) (<= pais 5))) false
            
)))

(defn no-space [isbn] 
    (apply str (filter #(not= % \space)
    (apply str (filter #(not= % \-) isbn))))
)

(defn control-dig [isbn]
    (if (= \X (last isbn)) 
        (str (apply str (butlast isbn)) 10)
        isbn
))



(range 10 0 -1) -> (10 9 8 7 6 5 4 3 2 1)
(map parseInt (map str "3598215079")) -> (3 5 9 8 2 1 5 0 7 9)
