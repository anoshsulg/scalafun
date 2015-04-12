package com.sulg.recur

object simple {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val d: List[Int] = List(4, 5, 6, 2)             //> d  : List[Int] = List(4, 5, 6, 2)

  d.reverse                                       //> res0: List[Int] = List(2, 6, 5, 4)

  def rev(x: List[Int]): List[Int] = {
    def revrecur(xs: List[Int], ys: List[Int]): List[Int] = {
      xs match {
        case Nil => ys
        case x :: xr => revrecur(xr, x :: ys)
      }

    }
    revrecur(x, List())
  }                                               //> rev: (x: List[Int])List[Int]
rev(d)                                            //> res1: List[Int] = List(2, 6, 5, 4)
}