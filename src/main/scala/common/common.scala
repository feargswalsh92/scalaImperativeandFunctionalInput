package src.main.scala

package object common {

  type Process = (Int, Int, String)

  type ProcessTree = Map[Int, Seq[Process]]

}
