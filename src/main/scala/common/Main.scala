package src.main.scala.common
import scala.collection.mutable. {Map,SynchronizedMap,HashMap}
trait Main extends App with TreeBuilder{

  val lines = scala.io.Source.stdin.getLines

  val words = lines.flatMap(_.split("\\W+"))

  val header = lines.next()
  args.foreach(println)
  //val numbers = words.map(String -> Int)
  //val numbers = scala.collection.Map[String,Int]()
  println("in main")
  println(args)
  //val windowSize = scala.io.Source.stdin.args


//  println(processes)

  println(header)

//  val processTree = AnyObject


  //val args = stdin.args pseudocode of how I would have obtained input
  //args.parseLine to split the input into window size and increment amount


  //val parse = parseLine(header)

  //val processes = lines map parse



  //val processes = lines map
  //print(func)

  //val parse = parseLine(header)
}//with IO with treebuilder
