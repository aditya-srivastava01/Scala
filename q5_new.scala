class Road(x: Boolean,y : Boolean,z: Boolean) {
    var front = x
    var crossing = y
    var green = z
}
class Question5{
    def main(args : Array[String])={
        check(new Road(true,true,false))
        check(new Road(false,false,true))
    }
    def check(road : Road)={
        if(road.green==true && road.crossing==false && road.front==false){
            println("Move")
        }else{
            println("Stop")
        }
    }
}
