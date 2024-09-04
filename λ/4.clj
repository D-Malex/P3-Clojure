; Encontrar los subt ́erminos de las siguientes expresiones:
;----------------------------------------------------------------------------------------------------

•(λy.y(λx.x)z)
; ABSTRACCION: (λy.y) Funcion que recibe como parametro 'y' y lo devuleve intacto.
; ABSTRACCION: (λx.x) Funcion que recibe como parametro 'x' y lo devuleve intacto.
; VARIABLE: (z)

•(λy.x(λx.x)z)
; ABSTRACCION: (λy.x) Funcion que recibe como parametro 'y' pero devuelve 'x' (Identidad).
; ABSTRACCION: (λx.x) Funcion que recibe como parametro 'x' y lo devuleve intacto.
; VARIABLE: (z)
