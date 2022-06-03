import kotlin.math.*
fun main() {
    print("Введите первую цифру: ")
    var c1 = readLine()!!.toDouble()
    print("Введите вторую цифру: ")
    var c2 = readLine()!!.toDouble()

    var c: Double = c1*10 + c2
    var res1 = c.pow(2.0)
    var r1 = c1.pow(3.0)
    var r2 = c2.pow(3.0)
    var res2 = 4*(r1+r2)
    println(res1)
    println(res2)
    if (res1 == res2) {
        println("Квадрат числа равен учетверённой сумме кубов его цифр")
    }
    else {
        println("Квадрат числа не равен учетверённой сумме кубов его цифр")
    }
}