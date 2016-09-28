package skeleton

import org.scalatest.{FunSpec, Matchers}
import org.scalamock.scalatest.MockFactory

class HelloSpec extends FunSpec with Matchers with MockFactory {
  describe("hello") {
    it("returns the correct value") {
      Hello.hello("foo") should be ("hello, foo")
    }

    it("gets name from name provider") {
      val provider = mock[NameProvider]
      val hello = new Hello(provider)

      (provider.name _).expects("foo").returning("bar")

      hello.hello("foo") should be("hello, bar")
    }
  }
}
