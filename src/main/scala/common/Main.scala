package src.main.scala.common
import scala.collection.mutable. {Map,SynchronizedMap,HashMap}
trait Main extends TreeBuilder {

  def main(args: Array[String]) {
    //println(args(0))
   // val argsInts = args.map(_.toInt)
   // argsInts.foreach(println)
    val increment = args(0)
    val windowSizes = args(1)
    println(windowSizes)
    val lines = scala.io.Source.stdin.getLines
    val words = lines.flatMap(_.split("\\W+"))
    val numbers = words.map(_.toInt)
   // println(numbers)
    //:t numbers
    //numbers.foreach(println)
    println("in main method")
   //
    // val fp = new functionalProgram()
    //val outputStr = fp.generateStats()




  }

  //println("in main")
}

    //val args = Array("5","7")


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
