class Rational(n: Int ,d : Int){
    val num : Int = n
    val denom : Int = d
    def this(n : Int) = this(n,1)
    def display()={
        println(s"$n/$d")
    }
}
object Rational_Constructor{
    def main(args : Array[String])={
        val x = new Rational(1,2)
        x.display()
        val y = new Rational(6)
        y.display()
    }
}
