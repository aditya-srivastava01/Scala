class Road{
    var front = false
    var crossing = false
    var green = false
}
object Question5{
    def main(args : Array[String])={
        var road = new Road()
        if(road.green==true && road.crossing==false && road.front==false){
            println("Move")
        }else{
            println("Stop")
        }
    }
}
