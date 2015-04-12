package com.sulg.recur

object Balance {
  def main(arr: Array[String]) = {
    println("This will balance the braces.")
    def test1 = balance("(if (zero? x) max (/ 1 x))".toList )
    println("(if (zero? x) max (/ 1 x)) : " + test1)
    def test2 = balance("())(".toList)
    println("())( : " + test2)
  }

  // check if the opening and closing braces match
  def balance(str: List[Char]): Boolean = {

    def balanceLoop(r: List[Char], counter: Int): Boolean = {
      println(" " + r + "  , counter : " + counter)
      r match {
        case List() => counter == 0
        case '(' :: rstr => balanceLoop(rstr, counter + 1)
        case ')' :: rstr => if (counter > 0) balanceLoop(rstr, counter - 1) else balanceLoop(rstr, counter)
        case _ :: rstr => balanceLoop(rstr, counter)
      }
    }
    balanceLoop(str,0)
  }

  
}