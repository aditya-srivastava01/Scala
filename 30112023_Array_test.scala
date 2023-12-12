import scala.math._
object array_test{
    def main(args : Array[String])={
        println()
        val nums : Array[Int] = Array(1,2,3,4,5)
        val names : Array[String] = Array("Mia","Anjela","Malkova")
        val num1 : Int = nums(0)
        val num2 : Int = nums(1)
        val num3 : Int = nums(2)
        val num4 : Int = nums(3)
        val num5 : Int = nums(4)

        nums(2) = 1400
        nums(4) = 782
        val name1 : String = names(0)
        val name2 : String = names(1)
        val name3 : String = names(2)


        names(1) = "Skylar Vox"
        names(2) = "Natasha"

        var minimum : Int= 1000000000
        var maximum : Int= -100000000
        var sum : Int = 0
        for(num<-nums){
            minimum = min(minimum,num)
            maximum = max(maximum,num)
            sum += num
            print(num+" ")
        }
        println()
        for(name<-names){
            print(name+" ")
        }
        println()

        println("Min is : "+minimum)
        println("Max is : "+maximum)
        println("Sum is : "+sum)
    }
}