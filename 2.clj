; Definir la función segundos que reciba los cuatro valores 
; (días, horas, minutos y segundos) del tiempo que dura un evento 
; y devuelva el valor de ese tiempo expresado solamente en segundos.
;-------------------------------------------------------------------

(defn segundos [dd, hh, mm, ss]
    (+ ss (* 60 mm) (* 3600 hh) (* 86400 dd))
)

(println)
(println "Un evento de Dias: 5, Horas: 20, Minutos: 35, Segundos: 51")
(println "Tiene un total de " (segundos 5 20 35 51) " segundos.")
(println)