fun main() {
    print("Введите число а: ")
    val a = readLine()!!.toDouble()
    print("Введите число b: ")
    val b = readLine()!!.toDouble()
    val z = minOf(a,3*b) * minOf(2*a-b,2*b)
    println("z = $z")
}