object concat_Array{
    def main(args : Array[String])={
        var arr1 : Array[Int] = Array(1,2,3,4)
        var arr2 : Array[Int] = Array(5,6,7,8)
        var concat_arr : Array[Int] = arr1++arr2
        for(e<-concat_arr){
            print(e+" ")
        }
        println()
    }
}