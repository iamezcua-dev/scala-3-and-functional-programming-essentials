package com.rockthejvm
package part1.basics

object ValuesAndTypes {
  def main(args: Array[String]): Unit = {
    // values
    val meaningOfLife: Int = 21 // This is a constant value, similarly to const or final
    // reassigning to them is not allowed

    // Type inference
    val anInteger = 67 // `: Int` is optional, since the compiler infers the type when possible
    println(s"The number ${anInteger} is an Int.")

    // Common Types
    val areYouARockstar: Boolean = true
    val ranaInitial: Char = 'E'
    val loveIsADangerZoneDifficulty: Int = 21 // 4 bytes
    val aShort: Short = 27 // 2 bytes
    val targetSales: Long = 3_000_000L // 8 bytes
    val PI: Float = 3.141592f // 4 bytes
    val eulerNumber: Double = 2.828182845904523536028747135266d
    println(f"Euler number is: $eulerNumber")
  }
}
