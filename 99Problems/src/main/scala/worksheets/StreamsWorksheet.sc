val fibonacci:Stream[Int] = 1 #:: 1 #:: fibonacci.zip(fibonacci.tail).map(l=>l._1+l._2)

fibonacci(1000)