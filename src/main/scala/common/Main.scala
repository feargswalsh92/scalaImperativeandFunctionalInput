package src.main.scala.common

import src.main.scala.Imperative.ImperativeProgram

//import scala.collection.mutable. {Map,SynchronizedMap,HashMap}
trait Main extends App with statsBuilder {

  override def main(args: Array[String]) {
    println(args(0))
    val inputArgs = args.foreach(println)
    val argsInts = args.map(_.toInt)
    argsInts.foreach(println)
    val increment = args(0)
    val windowSizes = args(1)
    val windowSizesInt = windowSizes.toInt
    println("window sizes = " + windowSizes)
    val lines = scala.io.Source.stdin.getLines
    val words = lines.flatMap(_.split("\\W+"))
    val numbers = words.map(_.toInt)
    println(numbers)
    object imperative extends Main with ImperativeProgram
    imperative.generateStats(numbers,windowSizesInt)

  }


}

    //val args = Array("5","7")

 // val lines = scala.io.Source.stdin.getLines
      //



      //println("Hello, " + args(0) + "!")

      //println(args.length)
      //args.foreach(x => println(args))

      // val words = lines.flatMap(_.split("\\W+"))
      //
      // val header = lines.next()

      //args.foreach(println)
  //val numbers = words.map(String -> Int)
  //val numbers = scala.collection.Map[String,Int]()
     // println("in main")

//  override def generateStats(numbers: Iterator[Int], windowSizes: Int): Unit = ???

  //val windowSize = scala.io.Source.stdin.args


//  println(processes)

     //println(header)

//  val processTree = AnyObject


  //val args = stdin.args pseudocode of how I would have obtained input
  //args.parseLine to split the input into window size and increment amount


  //val parse = parseLine(header)

  //val processes = lines map parse



  //val processes = lines map
  //print(func)

  //val parse = parseLine(header)
//with IO with treebuilder
