package scala.com
import scala.io.Source._



object imperativeMain extends App {
  val imp = new imperativeProgram()
  val lines = scala.io.Source.stdin.getLines
  //val header = lines.next()
  val parse = parseLine(header)
  val words = lines.flatMap(_.split("\\W+"))

  println(lines)
  println(words)

  var list = imp.constructList(words)
  println(list)




//sbt "runMain scala.com.imperativeMain" < inputData/input.txt
//   for (line <- Source.fromFile(file).getLines) {
// //  println(line
//   }
//



  //val lines = scala.io("input.txt").stdin.getLines
  //println(lines)
//  val words = lines.flatMap(_.split("\\W+"))

}
