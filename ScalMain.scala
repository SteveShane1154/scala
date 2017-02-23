import org.apache.hadoop.yarn.webapp.hamlet.HamletSpec.I
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import scala.io.Source


/**
  * Created by steve on 2/8/2017.    **** TO CHANGE FONT SIZE - CTL and Mouse Wheel....
  */
object ScalMain {

  def main(args:Array[String]): Unit = {
    println("Hello Scala!!!!");

    var myVar : String = "Steve";
    myVar = "Shane";


    //--String Stuff....
    //val name = "Steve"
    //val greeting = "Hello"
    //println(s"$greeting $name, I hope you are having a great day")
    //println(s"${greeting*2} $name, I hope you rock it out")

    //Yield Example and using .MAP instead
    //val fruits = "apple" :: "banana" :: "orange" :: Nil
    //val out = for (e <- fruits) yield e.toUpperCase
    //println(out)
    //val DotMapout = fruits.map(_.toUpperCase)
    //println(DotMapout)



    //fn_steve();

    //val sss = new clsShane();
    //sss.fn_showFullName("Kathy", "Shane");

    //var a = 0;
    //val numList = List(1,2,3,4,5,6);
    //// for loop execution with a collection
    //for( a <- numList ){
    //  println( "Value of a: " + a );
    //}


    //val xx : Int = addInt(3, 5);
    //println(xx);
    //or
   // println(addInt(5,5))

// Read File
val filename = "fileopen.scala"
    for (line <- Source.fromFile(filename).getLines()) {
      println(line)
    }


//-- Not working
//    val logFile = "ss.txt" // Should be some file on your system
//    val conf = new SparkConf().setAppName("Simple Application")
//    val sc = new SparkContext(conf)
//    val logData = sc.textFile(logFile, 2).cache()
//    val numAs = logData.filter(line => line.contains("a")).count()
//    val numBs = logData.filter(line => line.contains("b")).count()
//    println(s"Lines with a: $numAs, Lines with b: $numBs")
//    sc.stop()








  }


  def fn_steve(): Unit ={
    println("Steve")
   // println(Unit);
  }

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }


}
