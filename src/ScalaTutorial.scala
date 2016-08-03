

import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting._
import scala.util._

object ScalaTutorial {

  /**
    * Chapter 5 Classes
    */
  class Counter {
    private var value = 0
    def increment(): Unit = {
      value += 1
    }
    def current = value
    def isLess(other : Counter) = value < other.value
  }

  class Person{
    @BeanProperty var newName: String = _
    var name = ""
    private var privateAge = 0


    def age = privateAge
    def age_=(newValue: Int): Unit ={
      if(newValue > privateAge) privateAge = newValue
    }
  }

  class PersonWithAuxiliaryConstructors{
    private var name = ""
    private var age = 0

    //Auxiliary Constructors
    def this(name: String){
      this()
      this.name = name
    }
    def this(name: String, age: Int){
      this(name)
      this.age = age
    }
  }

  class Message {
    val timeStamp = new java.util.Date()
  }


  def main(args: Array[String]): Unit = {
    var i = 0
    val randLetters = "BRYANT"
    val aList = List(1, 2, 3, 4, 5)

    val nums = ArrayBuffer(1,2,4,5,45,32,65,65436,65464346)
    val names = ArrayBuffer("BC", "BWC", "BWCII").min
    val numsSorted = nums.sorted
    val a = Array(6,5,4,3,2,1)

    /**
      * Chapter 5 Classes
      */

      val myCounter = new Counter //can use new Counter()
      myCounter.increment()
      println(myCounter.current)

      val pete = new Person
      pete.name = "Pete"
      pete.age = 21 //calls age_=
      pete.age = 30
      pete.age = 24
    println(pete.age) //calls age() method

    val time = new Message
    val rightNow = time.timeStamp
    println(rightNow)






    /**
      * Chapter 4 exercise
      */

    //TODO chapter four exercise

    /**
      * Chapter 4 Maps and Tuples
      */
    /*
    var scores = Map("Bryant" -> 25, "Josh" -> 21, "Noah" -> 30)

    scores = scores + ("Bryant" -> 40, "Fred" -> 30 )
    scores = scores - "Josh"

    val JamesScore = scores.getOrElse("Josh", 0)
    val keys = scores.keySet
    println("Josh score: " + JamesScore)
    println(keys)
    for(v <- scores.values)
      println(v)
    for((k, v) <- scores)
      printf("K: %s, V: %d\n", k , v)

   val reverseMap = for((k,v) <- scores) yield (v, k)
    for(result <- reverseMap)
      println(result)

    val t = (1, 3.24, "Fred")

    val (first, second, third) = t
    println(first)

    val newYork = "New York".partition(_.isUpper)
    println(newYork)

    val symbols = Array("<", "-", ">")
    val count = Array(2, 10, 2)
    val pairs = symbols.zip(count)

    for((s, c) <- pairs)
      print((s * c))
      */

    /**
      * Chapter 3 ecerises
      */
/*

    val matrix = Array.ofDim[Double](3,4)

    matrix(0)(1) = 5

    val triangle = new Array[Array[Int]](10)
    for( i <- 0 until triangle.length)
      triangle(i) = new Array[Int](i+1)

    //1
    val num = new Array[Int](10)

    for(i <- 0 until num.length )
      num(i) = Random.nextInt(100)
    println(num.mkString(", "))
  //2
    var swapArray = Array[Int](1,2,3,4,5,6)

    for(i <- 0 until (if(swapArray.length % 2 == 0) swapArray.length else swapArray.length -1))
      if(i % 2 == 1) {
        var temp = swapArray(i)
        swapArray(i) = swapArray(i -1)
        swapArray(i -1) = temp
      }
    println(swapArray.mkString(","))
  //3
    for(i <- 0 until swapArray.length) yield if(i % 2 == 1) {swapArray(i-1)
    } else if(i == swapArray.length -1) swapArray(i) else swapArray( i + 1)

    println(swapArray.mkString("> "))

    */

    // quickSort(a)
   // println(a.mkString(", "))

   // println(nums.toString)

    //for(i <- numsSorted)
     // println(i)



    /*
    var first = true
    val indexes = for( i <- 0 until nums.length if first || nums(i) >= 0)
      yield{
        if(nums(i) <0) first = false
        i
      }
    for(j <- 0 until indexes.length) nums(j) = nums(indexes(j))
    nums.trimEnd(nums.length - indexes.length)
*/
/*
    val result = for(elem <- nums)yield 2 * elem
    val result2 = for(elem <- nums if elem % 2 == 0) yield 2 * elem
    val result4 = nums.filter(_ % 2 == 0).map(2 * _)
   // for(elem2 <- result)
     // println(elem2)

    for(elem4 <- result4)
      println(elem4)
      */

    //for(i <- 0 until nums.length)
     // println(i + ": " + nums(i))

    //for(elem <- nums)
      //println(elem)

/*
    def product(s: String) ={
      var y: Long = 1
      for(g <- s) y *= g.toInt
      println(y)
    }

    product("Hello")
    */
    //val c = "Hello"
  // println( c.foldLeft(1L)(_*_.toInt))

  //  var v: Long = 1
    //for(c <- "Hello") v *= c.toInt
    //println(v)



/*
    def countDown(n: Int): Unit = {
      for( result <- n to 0 by -1)
        println(result)
    }

    countDown(25)*/
    /*
    def box(s : String): Unit ={
      val border = "-" * s.length + "--\n"
      println(border + "|" + s + "|\n" + border)
    }

    box("Super Man")

    def signum(result: Int) = {
      if(result > 0) { 1
      } else if(result == 0) 0 else -1
    }

    println(signum(20))
    println(signum(-21))
    println(signum(0))

*/


    /*
    def sum(args: Int*) = {
      var result = 0
      for(arg <- args)
        result += arg
      println(result)
    }

    sum(1,2,4,5)
    sum(23,23)

    def recursiveSum(args: Int*) : Int = {
      if(args.length == 0) 0 else args.head + recursiveSum(args.tail : _*)
    }

    println(recursiveSum(1 to 5: _*))*/
    /*
   def decorate(str: String, left: String = "<<<", right: String= ">>>") =
     println(left + str + right)


   decorate("Bryant")
   decorate("Bryant", "[", "]")
   */
    /*
 def abs(z: Double) = if(z >= 0) z else -z
     println(abs(-16))

   def fac(n: Int) = {
     var r = 1
     for(result <- 1 to n)
       r=r*result
     r
   }

   println(fac(4))

   def fac2(n: Int): Int = if(n<1) 1 else n * fac2(n -1)

   println(fac2(6))

   */

    /*
   var random = for(c <- "hello"; result <- 0 to 1) yield(c+result).toChar
   for( result <- random )
     print(result)

   println()

   var random1 = for(result <- 0 to 1; c <- "hello") yield(c+result).toChar
   for(result <- random1)
     print(result)

*/

    /*
   var mod = for(result <- 1 to 10) yield result * 2

   for(result <- mod)
     println(result)
*/

    /*
   for(result <- 1 to 3;
       from = 4 -result;
       j <- from to 3)
     println((10*result+j)+ " ")
     */

    /*
   for (result <- 1 to 3; j <- 1 to 3 if result != j)
   println((10*result+j)+ " ")

 //for(result <- 1 to 3; j <- 1 to 3)
   //println((10 * result +j) + " ")
*/
    /*
   var evenList = for{result <- 1 to 20
     if(result % 2 ) == 1
   }yield result

   for(result <- evenList)
     println(result)
     */

    /*
   for(result <- aList){
     println("List items " + result)
   }


   for(result <- 0 until randLetters.length)
     println(randLetters(result))
*/
    /*
    var result = 0
  for (result <- 10 to 1 by -1 )
    println(result)



  do{
//     println(result)
     result += 1
   }while(result <= 20)



  // while(result <= 10) {
     //println(result)
    // result += 1

   }
*/
  }

}
