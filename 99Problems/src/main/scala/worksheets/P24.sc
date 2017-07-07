

val allResults = (0 to 1000).toList.flatMap(_=>problems.P24.lotto(5,10))

allResults.groupBy(identity).mapValues(_.size)