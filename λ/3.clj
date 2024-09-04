; Indicar, para cada variable, cu ́ales de sus ocurrencias son libres y cualesacotadas,
; en las siguientes expresiones. Indicar a que abstracci ́on-λest ́aligada cada ocurrencia no libre.
;-----------------------------------------------------------------------------------------------------

•(λy.y(λx.x)z) --> (λy.y(λx.x)z)
; LIGADA: 'y' en (λy.y 
; LIGADA: 'X' en (λx.x)
; LIBRE:  'z' en (z)

•(λy.x(λx.x)z)
; LIGADA: 'y' en (λy.x
; LIGADA: 'x' en (λx.x)
; LIBRE:  'x' en (λy.x
; LIBRE:  'z' en (z)

•(λy.y(λy.y)yx)
; LIGADA: 'y' en (λy.y
; LIGADA: 'y' en yx)
; LIBRE:  'x' en yx)