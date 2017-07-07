val lol = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))

lol.groupBy(_.size).toList.map({case (i,l)=>(l.size,l)}).sortBy(_._1).flatMap(_._2)