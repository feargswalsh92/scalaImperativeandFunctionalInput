package scala.com
package common
//https://github.com/lucproglangcourse/processtree-scala/blob/master/src/main/scala/mutable/Main.scala
import java.io.{ BufferedWriter, StringWriter }
import scala.language.reflectiveCalls
import org.scalatest.WordSpec

  class PrintSpec extends WordSpec with IO {
    def fixture() = new {
      val stringWriter = new StringWriter
      implicit val strout = new BufferedWriter(StringWriter, IO_BUF_SIZE)
    }

    "The string writer" when {
      "when used through a BufferedWriter" should {
        "return the output as a string" in {
          val f = fixture()
          f.strout.append("asdf")
          f.strout.flush()
          assert(f.stringWriter.toString == "asdf")
        }
      }
    }
  }
