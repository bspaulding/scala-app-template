import cats.effect.ExitCode
import org.scalatest._
import starter.Main

class MainSpec extends FunSuite with DiagrammedAssertions {
  test("that you wrote some tests") {
    assert(true.==(false))
  }

  test("your app works") {
    val exitCode = Main.run(List()).unsafeRunSync()
    assert(exitCode.==(ExitCode.Success))
  }
}
