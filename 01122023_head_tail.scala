object List01{
    def main (args : Array[String])={
        val fruit : List[String] = List("Orange","Strawberry","Mango","Watermelon")
        val first_element : String = fruit.head
        val rest_elements : List[String] = fruit.tail
        println("First Element : " +first_element)
        println("Rest of the Elements : ")
        for(e<-fruit.tail){
            print(e+" ")
        }
        println()
        val isEmpty : Boolean = fruit.isEmpty
        print("Is the List Empty? "+isEmpty)
    }
}