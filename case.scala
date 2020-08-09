case class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy

  }
  override def toString: String =
    s"($x, $y)"
    
    def invert()={
        Point(y,x)
    }
    def add()={
        x + y
    }
    def distance()={
        x-y
    }
        
   
}
object MyClass {
    def main(args: Array[String]){
    val Point1 = new Point(2, 3) //Q2
println(Point1.x)  
println(Point1)  
Point1.move(10,10);
println (Point1);

val Point2=Point1.distance; //Q3
println(Point2) ;

val Point3=Point1.add();//Q1
println(Point3) ;

 val  Point4= Point1.invert();//Q4
println(Point4) ;

    }
}