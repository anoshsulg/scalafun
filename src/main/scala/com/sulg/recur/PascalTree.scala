package com.sulg.recur

object PascalTree {
  def main(args: Array[String]): Unit = {
    println("pascal traingle")
    println(pascalTriangleGood(5,3))
  }
/**
 *       1
 *      2 3
 *     4 5 6
 *    7 8 9  
 *       1
 *      1  1
 *     1  2  1
 *    1 3   3  1
 *   1 4  6   4  1      
 * 
 */
  
  def pascalTriangle(r: Int, c: Int): Int = {
    (r,c) match {
      case (1,_) => 1
      case (_, 1) => 1
      case (y,x) => if(x==y) return 1 else pascalTriangle(y-1,x-1) + pascalTriangle(y-1,x) 
    }
    
  }
  
  def pascalTriangleGood(r: Int, c: Int) : Int = {
    def pascalLoop(i:Int, j:Int, map: Map[(Int,Int),Int]):Int = {
      println("i,j " + i + " , " + j)
      (i,j) match {
        case(1, 1) => pascalLoop(i+1,j, map) 
        case(m,n) => if(m==r && n==c) return map.get((i-1,j-1)).get + map.get((i-1,j)).get
        else if(n==1) pascalLoop(m,n+1, map ++ Map(((m,n),1)))   
        else if(m==n) pascalLoop(m+1,1, map ++ Map(((m,n),1))) 
        else 
          pascalLoop(m, n + 1, map ++  Map(((m,n),  map.get((i-1,j-1)).get + map.get((i-1,j)).get ) ))
      }
      
    }
    println("r,c : " + r + "," + c)
    pascalLoop(1,1, Map(((1,1),1) ))
  }
}


