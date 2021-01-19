(defun f (x y)(if (= y 0) (+ x 1)(* (f x (- y 1)) (+ (+ x 1) y))) )(defun g (x y)(+ (f x y) y))(write(g 10 10))
