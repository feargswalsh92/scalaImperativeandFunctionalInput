package src.main.scala.common

import java.io.{ BufferedWriter, OutputStreamWriter }

import scala.collection.JavaConversions.enumerationAsScalaIterator

import scala.math.max

trait IO {





}
//def parseLine(header: String):(String) => Process = {
//  val cols = new java.util.StringTokenizer(header).toList
//  val iPid = cols indexOf "PID"
//  val iPpid = cols indexOf "PPID"
//  val iCmd = max(header indexOf "CMD", header indexOf "COMMAND")
//
//  require(iPid >= 0, "required header field PID missing!")
//  require(iPpid >= 0,"required header field PPID missing!")
//  require(iCmd > max(iPid,iPpid), "required header field CMD or Command missing or not last!")
//
//  (line: String) => {
//
//    val sTok = new java.util.StringTokenizer(line)
//
//    val words = (0 to max(iPid, iPpid)).map(_ => sTok.nextToken())
//
//    (words(iPid).toInt, words(iPid).toInt, line.substring(iCmd))
//
//  }
//}
//
//val IO_BUF_SIZE = 8192
//
//implicit val stdout = new BufferedWriter(new OutputStreamWriter(System.out), IO_BUF_SIZE)
//





