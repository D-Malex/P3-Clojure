; ¿Cu ́ales de las siguientes representan expresiones-λ correctas seg ́un las convenciones sint ́acticas?  
; ¿Cu ́ales no?  En caso de responder negativa-mente, explicar porque; 
; en caso de responder afirmativamente, indicar aqu ́e expresi ́on-λ- corresponde.
;----------------------------------------------------------------------------------------------------

•(λx.x)         ✅
•(λxx)          ❌ (λxx) Esto se entiende como una funcion lambda que tiene 2 parametros pero no cuerpo. Necesita ser asi por EJ: (λxx.xx)
•(λx.x)         ✅
•(λx.xy)        ✅
•(λx.xyλz.xz.y) ❌ (λx.xyλz.xz.y) Hay un incorrecto uso de los '.', dado que estos son los que marcan el final de la firma de la funcion 
                                    y el comienzo de su cuerpo. Para arreglarlo habria que solo hacer esto: (λx.xy (λz.x) (λz.y))