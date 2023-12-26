object Factorial extends App{
    def factorial(n : Int): AnyVal = {
        var result = 1
        var i = 1
        while(i<=n){
            result *= i
            i += 1
        }
        result
    }
    val num = 15
    val result = factorial(num)
    println(s"The factorial of $num is $result")
}