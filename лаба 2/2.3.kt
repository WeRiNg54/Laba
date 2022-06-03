fun funct(n : Int): Boolean {
    if (n % 10 != 0 && n % 5 == 0) {return true}
    else return false
}

fun main() {
    print("Введите число n: ")
    val n = readLine()!!.toInt()
    var k = 0

    for (i in 1..n){
        print("Введите следующее число ai: ")
        if(funct(readLine()!!.toInt())) k+=1
    }

    print("Чисел, кратных 5: $k")
}