object tuples{
    def main(args : Array[String])={
        val tuple1 : (Int,String,Double) = (10037,"Aditya",7.79)
        val val1 : Int = tuple1._1
        val val2 : String = tuple1._2
        val val3 : Double = tuple1._3
        println("First Element is "+val1)
        println("Second Element is "+val2)
        println("Third Element is "+val3)
    }
}