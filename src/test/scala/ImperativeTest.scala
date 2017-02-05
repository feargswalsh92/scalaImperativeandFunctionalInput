package cs372.com
import org.scalatest.{BeforeAndAfterEach, FunSuite }
import scala.io.Source._

class imperativeTest extends FunSuite with BeforeAndAfterEach {

  test("testInputList") {
   val inputData = fromFile("inputdata/input.txt").getLines
   val dummyList = List("xxxxx", "xxxxx", "", "xx", "xxxxx", "", "xxxxx")
   assert((new imperativeProgram).constructList(inputData).sorted == dummyList.sorted)

    }
  //list = new
  //   val input = fromFile("data/input.txt").getLines
  //   assert((new ImperativeProgram).echoInputData(input) == input)
  //   //fil in xx with echofunction output
  // }
}
