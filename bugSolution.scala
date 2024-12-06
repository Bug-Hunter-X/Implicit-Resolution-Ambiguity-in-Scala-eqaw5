```scala
class MyClass[T : Ordering](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

val instance1 = new MyClass(10)
val instance2 = new MyClass("hello")

println(instance1.myMethod) // compiles and works fine
println(instance2.myMethod) // compiles and works fine
```