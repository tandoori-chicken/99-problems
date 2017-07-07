import problems.P26

val testList = (1 to 9).toList
val countsList = List(2, 7)

//for{
//  prefix<-P26.combinations(2,testList)
//  remainingList<- testList diff prefix
//}yield testList diff prefix

def group[T](counts: List[Int], list: List[T]): List[List[List[T]]] = (counts, list) match {
  case (Nil, _) => List(List())
  case (h :: t, _) =>

    for {
      prefix <- P26.combinations(h, list)
      suffix <- group(t, list diff prefix)
    } yield prefix :: suffix

}

val result = group(List(2, 2,5), List(1, 2, 3, 4,5,6,7,8,9))

result.size