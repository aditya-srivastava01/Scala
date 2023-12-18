class Rational(n: Int ,d : Int){
    override def toString = s"$n/$d"
    // val x = Rational(1,1)
}
object Rational_Constructor{
    def main(args : Array[String])={
        val x = new Rational(1,3)
        println(x.toString)
    }
}
