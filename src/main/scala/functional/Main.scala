package src.main.scala
package functional
import scala.collection._
import common.{Process,ProcessTree}

object Main extends common.Main with functionalProgram

trait functionalProgram extends common.TreeBuilder {

  def buildTree(processes: Iterator[Process]): ProcessTree =  {

    println("I'm in the buildTree:")

    ???

  }


}



  //val lines = scala.io.Source.stdin.getLines
  //println(lines)
