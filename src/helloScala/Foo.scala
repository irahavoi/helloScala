package helloScala
class Foo {
  def foo(one: Int = 1,
    two: String = "two",
    three: Double = 2.5): String =
    two + one + three
}