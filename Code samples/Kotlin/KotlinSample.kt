/*
    The following defines an integer (in this case, 5) and prints one of
    two values depending on whether the integer is fully divisiable by 2
    (in this case, the output is "X is odd").
*/

fun main(){
    val x: Int = 5
    when (x % 2 == 0){
        true -> println("X is even")
        else -> println("X is odd")
    }
}