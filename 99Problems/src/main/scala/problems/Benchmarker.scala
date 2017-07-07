package problems

import org.scalameter
import org.scalameter.{Key, Quantity, Warmer, config}

/**
  * Created by adarsh on 06/07/2017.
  */
object Benchmarker {

  private val standardConfig = config(
    Key.exec.minWarmupRuns -> 5,
    Key.exec.maxWarmupRuns -> 10,
    Key.exec.benchRuns -> 10
    //      ,Key.verbose -> true
  ) withWarmer (new Warmer.Default)

  private val footprintMeasurer = new scalameter.Measurer.MemoryFootprint
  def measureTime(s: =>Any): Quantity[Double] = standardConfig measure s
  def measureMemory(s: =>Any): Quantity[Double] = standardConfig withMeasurer footprintMeasurer measure s

}
