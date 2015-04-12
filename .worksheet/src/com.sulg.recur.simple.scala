package com.sulg.recur

object simple {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  println("Welcome to the Scala worksheet");$skip(39); 

  val d: List[Int] = List(4, 5, 6, 2);System.out.println("""d  : List[Int] = """ + $show(d ));$skip(13); val res$0 = 

  d.reverse;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(231); 

  def rev(x: List[Int]): List[Int] = {
    def revrecur(xs: List[Int], ys: List[Int]): List[Int] = {
      xs match {
        case Nil => ys
        case x :: xr => revrecur(xr, x :: ys)
      }

    }
    revrecur(x, List())
  };System.out.println("""rev: (x: List[Int])List[Int]""");$skip(7); val res$1 = 
rev(d);System.out.println("""res1: List[Int] = """ + $show(res$1))}
}
