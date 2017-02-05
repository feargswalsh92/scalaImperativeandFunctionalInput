package cs372.p1

import scala.io.Source
import java.util


object Main extends App {
  //val imp = new imperativeProgram()

  val file = "input.txt"
  for (line <- Source.fromFile(file).getLines) {
  println(line)
  }

  
  //val lines = scala.io("input.txt").stdin.getLines
  //println(lines)
//  val words = lines.flatMap(_.split("\\W+"))

}
