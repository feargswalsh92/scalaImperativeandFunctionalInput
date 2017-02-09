package scala.functional
import org.scalatest.{BeforeAndAfterEach, FunSuite }
import scala.io.Source._





class functionalistogramTest extends FunSuite with BeforeAndAfterEach {

test("testInputList") {

 val inputData = fromFile("inputData/input.txt").getLines
 val expectedList = List("3", "4", "5", "7", "8", "10", "45")
 assert((new imperativeProgram).constructList(inputData).sorted == expectedList.sorted)

  }



  test("testConstructArrayBuffer") {
    val inputList = List("5","7","8","4")
    val expectedBuffer = scala.collection.mutable.ArrayBuffer("5","7","8","4")

    assert((new imperativeProgram).constructArrayBuffer(inputList) == expectedBuffer)
    //tst to check if array has been constructed properly

  }
}
