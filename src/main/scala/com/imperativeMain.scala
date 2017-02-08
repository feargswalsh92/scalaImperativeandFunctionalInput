package scala.com
import scala.io.Source._



object imperativeMain extends App {
  val imp = new imperativeProgram()
  val lines = scala.io.Source.stdin.getLines
  val words = lines.flatMap(_.split("\\W+"))
  println(lines)
  println(words)

  var list = imp.constructList(words)
  println(list)



//   for (line <- Source.fromFile(file).getLines) {
// //  println(line
//   }
//



  //val lines = scala.io("input.txt").stdin.getLines
  //println(lines)
//  val words = lines.flatMap(_.split("\\W+"))

}
