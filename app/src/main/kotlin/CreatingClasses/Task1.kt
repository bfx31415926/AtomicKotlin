// CreatingClasses/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package CreatingClasses

class SomeClass {
  fun a() {
    println("42")
  }

  fun b() {
    a()
  }

  fun c() {
    this.b()
  }
}
