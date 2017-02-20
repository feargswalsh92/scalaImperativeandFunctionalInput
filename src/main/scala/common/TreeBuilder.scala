package src.main.scala.common

trait TreeBuilder {
//rename trait
//SOC: why should the method that generates the stats deal with the conversion
//of strings to numbers.
//args come in as Strings, windowsizes as numbers
//constraint is constant space, ideally it would produce an iterator that pops up
//whenever an input appears,we cannot store them but we need to
//invoking that method will result in sending it to the listener,
//production version of listener prints the stats.
//test version: stores the stats, mutable collection to
//generate stats for example sequence of number and generate
//when testing you plug the statsbuilder together with the test implementation of the listener
//dependency injection, system under test, func or imperative, production output listener, test func or imperative with test output listener
//design the listener method of the test carefully, like processTree,
//choice representation of the stats as a scala structure, number,count, min,max,average
//tuples(fixed), sequence(0 or more), optional
//at the top level it's fixed each stat is fixed if its at a level where the window size hasn't been reached yet it's an optional type(none ??? and some(there is data))

def generateStats()
//numbers: Map[String,Int])
  //windowSizes),NO return type:

 // imperative verbose
//functional foldleft???

}
