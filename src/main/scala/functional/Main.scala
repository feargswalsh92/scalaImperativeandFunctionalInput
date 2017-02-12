package src.main.scala
package functional
import scala.collection._
import common.{Process,ProcessTree}

object Main extends common.Main with functionalProgram

trait functionalProgram extends common.TreeBuilder {

  def buildTree(processes: Iterator[Process]): ProcessTree=  {

    println("I'm in the buildTree:")

      val (sum, count) = processes.foldLeft {
        (0, 0)
      } { case ((sum, count), next) =>
        (sum + next.length, count + 1)
      }
      val result = sum.toFloat / count
      result
    }

      //  (m,p) =>
      // val iPpid = p._2
      //
      // val children = m.getOrElse(iPpid, Vector.empty) :+ p
      //
      // m + (iPpid -> children)





}



  //val lines = scala.io.Source.stdin.getLines
  //println(lines)
