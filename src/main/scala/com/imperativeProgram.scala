package scala.com
import scala.io.Source, scala.io.Source._

//import main.scala

import scala.collection._



class imperativeProgram {

var wordsList = List[String]()
//@param lines from Main
//@param words  "     "
//Is this how you get program to recognize variables instanstiated in main?


def constructList(words: Iterator[String]): List[String] = {
  for (word <- words) { //possibly add toList
  word :: wordsList
  }
  wordsList
  }
}
