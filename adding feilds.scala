class Rational(n : Int,d: Int){
    require(d!=0)
    val num : Int = n
    val denom : Int = d
    override def toString = s"$num/$denom"

    def add(newObj : Rational): Rational = {
        val newNum = num*newObj.denom+newObj.num*denom
        val newDenom = denom*newObj.denom
        new Rational(newNum,newDenom)
    }
    def multiply(newObj : Rational): Rational={
        val newNum = num*newObj.num
        val newDenom = denom*newObj.denom
        new Rational(newNum,newDenom)
    }
}
object adding{
    def main(args : Array[String])={
        val R1 = new Rational(1,4)
        val R2 = new Rational(1,4)

        val sum = R1.add(R2)
        println(sum.toString)
        val mult = R1.multiply(R2)
        println(mult)
    }
}