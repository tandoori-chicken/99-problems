package problems

import problems.P23.randomSelect

/**
  * Created by adarsh on 07/07/2017.
  */
object P25 {

  def randomPermute[T](list: List[T]): List[T] = randomSelect(list.size, list)
}
