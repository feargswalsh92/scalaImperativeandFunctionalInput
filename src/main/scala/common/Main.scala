package src.main.scala.common

trait Main extends App with IO with TreeBuilder{

  val lines = scala.io.Source.stdin.getLines

  val words = lines.flatMap(_.split("\\W+"))

  val header = lines.next()
  //val args = stdin.args pseudocode of how I would have obtained input
  //args.parseLine to split the input into window size and increment amount
  println("in main")

  val parse = parseLine(header)

  val processes = lines map parse

  println(processes)

  println(header)

  val processTree = buildTree(processes)


  //val processes = lines map
  //print(func)

  //val parse = parseLine(header)
}//with IO with treebuilder
