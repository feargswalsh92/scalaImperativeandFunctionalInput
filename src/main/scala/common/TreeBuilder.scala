package src.main.scala.common

trait TreeBuilder {

 def buildTree(processes: Iterator[Process]): ProcessTree

}
