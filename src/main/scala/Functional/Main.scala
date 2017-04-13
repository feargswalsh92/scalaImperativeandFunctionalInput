package src.main.scala
package Functional
import scala.collection._
import common.{Process, ProcessTree}

import scala.collection.mutable.ArrayBuffer

object Main extends common.Main with functionalProgram

trait functionalProgram extends common.statsBuilder {

  
  //   ???//

  def generateStats(numbers: Iterator[Int], windowSizes:Int) {
    val itList = numbers.toList
    itList.foldLeft()
   // println ("I'm in the functional genrateStats")

  }

//  def constructMap(itList:List[Int]): immutable.ListMap[Int,Int] = {
//    val lengthOccurences = it
//  }
//    //add  map iterator as input type
    //(processes: Iterator[Process]) {
    //println(args)
    //println(args(0))
    //   val (sum, count) = processes.foldLeft {
    //     (0, 0)
    //   } { case ((sum, count), next) =>
    //     (sum + next.length, count + 1)
    //   }
    //   val result = sum.toFloat / count
    //   result
    // }

      //  (m,p) =>
      // val iPpid = p._2
      //
      // val children = m.getOrElse(iPpid, Vector.empty) :+ p
      //
      // m + (iPpid -> children)





}



  //val lines = scala.io.Source.stdin.getLines
  //println(lines)
