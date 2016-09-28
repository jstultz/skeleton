package skeleton

trait NameProvider {
  def name(key: String): String
}

object IdentityNameProvider extends NameProvider {
  def name(key: String) = key
}

class Hello(nameProvider: NameProvider) {
  def hello(name: String): String = s"hello, ${nameProvider.name(name)}"
}

object Hello extends Hello(IdentityNameProvider) {
  def main(args: Array[String]): Unit = {
    println(hello(args(0)))
  }
}
