fun Sum(n : Int) : Int{
    if (n < 10) return n
    else return Sum(n / 10) + n % 10
}

fun Root (n : Int): Int {
    if (n < 10) return n
    else return Root(Sum(n))
}

fun main() {
    print("Введите число: ")
    val n = readLine()!!.toInt()
    println("Цифровой корень из числа " + n + " равен " + Root(n))
}