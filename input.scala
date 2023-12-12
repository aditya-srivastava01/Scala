import scala.io.StdIn as read

object input{
    def main(args : Array[String])={
        println("Enter the input : ")
        val line = read.readLine("Enter a line of text : ")
        println(s"You Entered : $line")
    }
}