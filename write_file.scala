import java.io._
object write_file{
    def main(args : Array[String])={
        val writer = new PrintWriter(new File("test_01.txt"))
        writer.println("Aditya Srivastava")
        writer.println("20MIP10037")
        writer.println("VIT BHOPAL")
        writer.close()
    }
}