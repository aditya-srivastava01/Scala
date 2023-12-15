case class Counter(value : Int = 0){
    def increment : Counter = copy(value = value+1)

    def decrement : Counter = copy(value = value-1)

    def add(amount : Int): Counter = copy(value = value+amount)

    def isZero: Boolean = value==0
}

object Functional_Object{
    def main(args : Array[String])={
        val Counter_1 = new Counter(10);
        println(s"Coonter_1 value : "+Counter_1.value)
        val Counter_2 = Counter_1.increment
        println(s"Counter_2 value : "+Counter_2.value)
        val Counter_3 = Counter_1.decrement
        println(s"Counter_3 value : "+Counter_3.value)
        val Counter_4 = Counter_1.add(59)
        println(s"Counter_4 value : "+Counter_4.value)
        println(s"Is Value of Counter_1 Zero ? "+Counter_1.isZero)
    }
}