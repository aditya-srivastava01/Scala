class Rational(n: Int ,d : Int){
    require(d!=0)
    println("Created"+n+"/"+d)
}
object Rational_Constructor{
    def main(args : Array[String])={
        val x = new Rational(1,2)
        println(x)
    }
}
