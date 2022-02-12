fun main() {
    AQuestion()
    println()
    BQuestion()
    println()
    CQuestion()
}

fun AQuestion(){
    var temp: Int
    val array = arrayListOf(1,6,3,5,8,7,4,20)
    for(i in 0 until array.size){
        for(j in i + 1 until array.size){
            if(array[i] > array[j]){
                temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }
    for(item in array){
        print("$item ")
    }
}

fun BQuestion(){
    val array = arrayListOf(1,2,3,4,5,6)
    for(i in 0 until array.size){
        print("${array[i] * array[array.size-(i+1)]} ")
    }
}

fun CQuestion(){
    val array = arrayListOf(10,33,13,72,44,51,17)
    for(i in 0 until array.size-1){
        if(i % 2 != 0){
            print("${array[i] - array[i+1]} ")
        }else{
            print("${array[i] + array[i+1]} ")
        }
    }
}