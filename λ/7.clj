; Determinar las redex-βde cada uno de los siguientes t ́erminos-λ-.
; De serposible,β-reducirlos hasta obtener su forma normal
;-------------------------------------------------------------------

• (λx.λy.xy)(λy.yz)
    (λxy.xy)(λy.yz)
    (λy.yz)y
    yz

• (λx.λy.xy)(λz.yz)z
    (λxy.xy)(λz.yz)z
    (λz.yz) z
    yz

• (λx.(λy.x)yλz.z)(λy.yz)
    (λx.x λz.z)(λy.yz)
    (λy.yz) (λz.z)
    (λz.z) z
    z

• (λf.(λx.f(xx))(λx.f(xx)))
    Infinity Recursion