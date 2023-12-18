class Rational(n: Int ,d : Int){
    println("Created"+n+"/"+d)
}
object Rational_Constructor{
    def main(args : Array[String])={
        val x = new Rational(1,2)
        println(x)
    }
}
