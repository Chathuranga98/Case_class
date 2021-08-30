import math.{sqrt,pow}
object MyApp extends App{
    val p1= new Point(9,7)
    val p2=new Point(3,2)
    val m=p1.move(2,3)
    val p3= new Point(6,10)
    val d= p1.distance(p2)

    println(f"Distance = ${d}%.2f")
    println(p1)
    println(p2)
    println(s"Add = ${p1+p2}")
    println(s"Invert = ${p3.invert()}")
}

case class Point(a:Int,b:Int){
    def x:Int=a
    def y:Int=b

    //Question 1
    def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)

    //Question 2
    def +(that:Point)= Point(this.x+that.x, this.y+that.y)

    //Question 3
    def distance(other:Point):Double = sqrt(pow(this.x - other.x, 2) + pow(this.y - other.y, 2))

    //Question 4
    def invert()= Point(this.y,this.x)
}