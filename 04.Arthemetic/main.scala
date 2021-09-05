object Main {
  def main(args: Array[String]): Unit = {
    var z =10;
    val a=scala.io.StdIn.readInt()
    println("The value of a is "+ a)
    val b=scala.io.StdIn.readInt()
    println("The value of b is "+ b)
    z=a+b;
    println("The value of a+b is "+ z)
    z=a-b;
    println("The value of a-b is "+ z)
    z=a*b;
    println("The value of a*b is "+ z)
    z=a/b;
    println("The value of a/b is "+ z)
    
  }
}
