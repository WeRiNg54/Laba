import kotlin.math.sqrt
fun main() {
    print("Введите площадь круга: ")
    var s1 = readLine()!!.toDouble()
    print("Введите площадь квадрата: ")
    var s2 = readLine()!!.toDouble()
    var a1: Double = sqrt(s1/3.14)
    var a2: Double = sqrt(s2)/2
    if (a1 <= a2) {
        print("Круг помещается в квадрате")
    }
    else {
        print("Круг не помещается в квадрате")
    }
}