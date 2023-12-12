import scala.io.Source as sc

object read_img{
    def main(args : Array[String])={
        val img = sc.fromFile("image_01.jpg","ISO-8859-1")
        for(e<-img.getLines){
            println(e)
        }
        println()
    }
}