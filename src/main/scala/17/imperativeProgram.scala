package cs372.com
import scala.io.Source, scala.io.Source._

//import main.scala

import scala.collection._

class imperativeProgram {
val file = "input.txt"
var lines = List[String]()


def constructList(stream: Iterator[String]): List[String] = {
  val stream = Source.fromFile(file)
  var all = stream.getLines.toList
  println(all)
  all
  //lines
  }
}
