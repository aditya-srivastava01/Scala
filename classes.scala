class SmartPhone{
    var num : Int = 16
    var name :String = "Google"
    def show()={
        println(f"The name of company is : "+name);
        println(f"Total Number of smartphone generation : "+num);
    }
}

object main{
    def main(args : Array[String])={
        var obj = new SmartPhone();
        obj.show()
    }
}