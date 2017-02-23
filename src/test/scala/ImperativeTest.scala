package scala.main
import org.scalatest.{BeforeAndAfterEach, FunSuite }
import scala.io.Source._



  class ImperativeTest extends FunSuite with BeforeAndAfterEach {


  //  test("testInputList") {
  //  val inputData = fromFile("inputData/input.txt").getLines
  //  val expectedList = List("3", "4", "5", "7", "8", "10", "45")
  //  assert((new imperativeProgram).constructList(inputData).sorted == expectedList.sorted)
   //
  //   }

  test("testGenerateTest") {
    val inputData = fromFile("inputData/input.txt").getLines
    val expectedOutput = (3,4,5,6,7,8,10,45)
    var listeners: List[generateStats => ()] = Nil
    def listen(listener: generateStats => ()) {
       listeners ::= listener
       }
    def notify(ev: generateStats) for (l <- listeners) l(ev)

  }
}



    // test("testConstructArrayBuffer") {
    //   val inputList = List("5","7","8","4")
    //   val expectedBuffer = scala.collection.mutable.ArrayBuffer("5","7","8","4")
    //
    //   assert((new imperativeProgram).constructArrayBuffer(inputList) == expectedBuffer)
    //   //tst to check if array has been constructed properly
    //
    // }






  //list = new
  //   val input = fromFile("data/input.txt").getLines
  //   assert((new ImperativeProgram).echoInputData(input) == input)
  //   //fil in xx with echofunction output
  // }
