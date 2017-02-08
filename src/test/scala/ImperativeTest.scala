package scala.com
import org.scalatest.{BeforeAndAfterEach, FunSuite }
import scala.io.Source._

class imperativeTest extends FunSuite with BeforeAndAfterEach {

  test("testInputList") {
   val inputData = scala.io.Source.stdin.getLines
   val inputWords = inputData.flatMap(_.split("\\W+"))
   val dummyList = List("3", "4", "5", "7", "8", "10", "45")
   assert((new imperativeProgram).constructList(inputData).sorted == dummyList.sorted)


    }

    test("printWindowSize") {


    }


  //list = new
  //   val input = fromFile("data/input.txt").getLines
  //   assert((new ImperativeProgram).echoInputData(input) == input)
  //   //fil in xx with echofunction output
  // }
}
