package cs372.com
import org.scalatest.{BeforeAndAfterEach, FunSuite }
import scala.io.Source._
class ImperativeTest extends FunSuite with BeforeAndAfterEach {

  test("testInputRead") {

    val input = fromFile("data/input.txt").getLines
    assert((new ImperativeProgram).echoInputData(input) == input)
    //fil in xx with echofunction output
  }
}
