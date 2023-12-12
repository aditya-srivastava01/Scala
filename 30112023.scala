class Doge(name : String, breed : String ,age : Int,color : String){
    println("Name is "+ name + "\nBreed is "+breed)
    println("Age is "+ age + "\nColor is "+color)
    println()
}
object creating_obj{
    def main(args : Array[String])={
        var obj1 = new Doge("Shiba Inu","Shiba",2,"Orange");
        var obj2 = new Doge("snowy","Husky",1,"White");
    }
}