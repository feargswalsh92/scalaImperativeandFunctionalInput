package src.main.scala

package object common {

  type process = (Int, Int, String)

  type ProcessTree = Map[Int, Seq[Process]]

}