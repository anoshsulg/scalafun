package com.sulg.recur

object CountingChange {
  def main(args: Array[String]): Unit = {
    println("combinations of coins to form the change")
  }

  def countChange(change: Int, coins: List[Int]): Int = {
    if(change == 0) return 1
    else if(change < 0 || coins.isEmpty) return 0
    else countChange(change - coins.head, coins) + countChange(change, coins.tail)

  }
}