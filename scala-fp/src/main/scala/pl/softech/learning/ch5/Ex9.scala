package pl.softech.learning.ch5

import pl.softech.learning.ch5.Stream.Implicits._

object Ex9 {

  def from(n: Int): Stream[Int] = ???

  def main(args: Array[String]): Unit = {
    println(from(3).take(5).toList)
  }

}
