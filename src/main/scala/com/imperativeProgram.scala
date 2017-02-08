package scala.com
import scala.io.Source, scala.io.Source._

//import main.scala

import scala.collection._
import scala.collection.mutable.{ ArrayBuffer }


class imperativeProgram {
val mutableArray = scala.collection.mutable.ArrayBuffer.empty[Int]
var wordsList = List[String]()
//@param lines from Main
//@param words  "     "
//Is this how you get program to recognize variables instanstiated in main?


def constructList(words: Iterator[String]): List[String] = {
  for (word <- words.toList) {
  wordsList ::= word
    }
  wordsList
   //TODO Printing list in wrong format (sort)
  }



def constructArrayBuffer(wordsList: List[String]): mutable.ArrayBuffer[Int] = {
    // for ( <- lines) {
    //  mutableArray
    // }

    mutableArray
  }
}
