object Main {
  def main(args: Array[String]): Unit = {
        println ("Enter Value > 0 : ") 
       var x:Int = scala.io.StdIn.readInt() 

      if( x < 18 ){
         println("Value of X is < 18");
      } else if( x > 19 ){
         println("Value of X is > 20");
      } else if( x == 18 ){
         println("Value of X is 18");
      } else{
         println("Error Value");
      }
   }
}