import kotlin.math.abs

fun main() {
    print("Введите x первой точки: ")
    val x1 = readLine()!!.toDouble()
    print("Введите y первой точки: ")
    val y1 = readLine()!!.toDouble()
    print("Введите x второй точки: ")
    val x2 = readLine()!!.toDouble()
    print("Введите y второй точки: ")
    val y2 = readLine()!!.toDouble()
    print("Введите x третьей точки: ")
    val x3 = readLine()!!.toDouble()
    print("Введите y третьей точки: ")
    val y3 = readLine()!!.toDouble()

    val S : Double = abs(x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2
    print("Площадь заданного треугольника равна: " + S)
}