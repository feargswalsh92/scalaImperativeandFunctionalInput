package src.main.scala
package Imperative
import scala.collection._
import math._

import common.{ Process,ProcessTree}

object Main extends common.Main with ImperativeProgram
  //override def generateStats(): Unit = ???

  //  override def generateStats(): Unit = ???
  //}


  trait ImperativeProgram extends common.statsBuilder {

    //2
    // println(wordsList)
    println("in imperative")


    def generateStats(numbers: Iterator[Int], windowSizes: Int) {
      var currmin = numbers.next()
      var currmax = currmin

      //println(currmin)
      val buf = scala.collection.mutable.ArrayBuffer.empty[Int]

      var count = 0


      numbers.foreach { i=>
        buf.append(i)
        if (i < currmin) {
          currmin = i
        }

        if (i > currmax) {
          currmax = i
        }

        var curravg = (currmin + currmax)/2

        //convert to float
        count += 1
        //println(i)

        println(s"$i $count $currmin $curravg $currmax ")



            // $min(buf)"







       // var imin = min(i)

      }

      //    while (numbers.hasNext)


      //    //updateStats(numbers) //call to update stats goes here
      //
      //      println(numbers.next)


    }

  }



//import scala.io.Source, scala.io.Source._

  //import main.scala
  //import scala.collection_
  //import scala.collection._
  //import common.{Process,ProcessTree}
  //import scala.collection.mutable.{ArrayBuffer, Buffer, HashMap}
  //val mutableArray = scala.collection.mutable.ArrayBuffer.empty[String]
  //var wordsList = List[String]()
//@param lines from Main
//@param words  "     "
//Is this how you get program to recognize variables instanstiated in main?


// def constructList(words: Iterator[String]): List[String] = {
//   for (word <- words.toList) {
//   wordsList ::= word
//   }
//   wordsList
//    //TODO Printing list in wrong format (sort)
//   }



// def constructArrayBuffer(wordsList: List[String]): mutable.ArrayBuffer[String] = {
//    for (word <- wordsList) {
//      mutableArray += word
//    }
//     mutableArray
//   }

