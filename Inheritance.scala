class MyClass(value : Int){
    val myValue = value
    
    def printValue()={
        println(s"Value of this Instance is: $myValue")
    }
    def isSameValue(valToCompare : Int)={
        this.myValue==valToCompare
    }
}
object testObj extends App{
    val myObj = new MyClass(145575)
    myObj.printValue()
    val res = myObj.isSameValue(69)
    println(s"Is it the same value ? $res")
}