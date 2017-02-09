package src.main.scala.common

trait Main extends App with functionalTree{
  val lines = scala.io.Source.stdin.getLines
  val words = lines.flatMap(_.split("\\W+"))
  val header = lines.next
  //val args = stdin.args pseudocode of how I would have obtained input
  //args.parseLine to split the input into window size and increment amount
  println("in main")
  println(lines)
  println(header)
  //val parse = parseLine(header)
}//with IO with treebuilder
