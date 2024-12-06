```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Ordered[T]): T = value
}

val instance1 = new MyClass(10)
val instance2 = new MyClass("hello")

println(instance1.myMethod) // compiles and works fine
println(instance2.myMethod) // Compilation error
```