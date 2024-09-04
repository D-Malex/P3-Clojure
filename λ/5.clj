; Realizar las siguientes sustituciones:
;----------------------------------------

•(λy.x(λx.x)z)[z:= (λw.wt)]
;RESOLUCION:
    (λy.x (λx.x) (λw.wt))

•(λy.x(λx.x)z)[z:= (λw.wy)]
;RESOLUCION:
    (λy.x (λx.x) (λw.wy))

•(λy.yz)[y:=z]
;RESOLUCION:
    (λz.zz)

•(λy.yz)[z:=y]
;RESOLUCION:
    (λy.yy)