(λx.x ((λy.y) o) ((λx.x) ((λz.p) v)) s) (λx.x x)
Aplico Alpha y Eta.
    Alpha --> s === q
    Eta --> ((λz.p) v) === p

ORDEN NORMAL (Aplico regla Beta, resolviendo desde la izquierda)
(λx.x ((λy.y) o) ((λx.x) p) q) (λx.x x)

Beta -->    (λx.x ((λy.y) o))
            ((λy.y) o)

(λx.x x) ((λy.y) o) ((λx.x) p) q

Beta -->    (λx.x x) ((λy.y) o)
            ((λy.y) o) ((λy.y) o)

((λy.y) o) ((λy.y) o) ((λx.x) p) q

Beta -->    ((λy.y) o)
            o

o ((λy.y) o) ((λx.x) p) q

Beta -->    ((λy.y) o)
            o

o o ((λx.x) p) q

Beta -->    ((λx.x) p)
            p

o o p q
