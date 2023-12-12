object reverse_list{
    def main(args : Array[String])={
        val arr : Array[Int] = Array(1,2,3,4,5,6)
        println("Original Array")
        print_arr(arr)
        println("Reversed Array")
        reverse(arr)
    }
    def reverse(arr : Array[Int])={
        val n = arr.length
        for(i<-0 to n/2){
            val temp = arr(i)
            arr(i) = arr(n-i-1)
            arr(n-i-1) = temp
        }
        print_arr(arr)
    }
    def print_arr(arr : Array[Int])={
        for(e<-arr){
            print(e+" ")
        }
        println()
    }
}