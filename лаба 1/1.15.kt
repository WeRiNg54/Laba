import kotlin.math.*
fun main() {
    print("Введите х точки А: ")
    val x1 = readLine()!!.toDouble()
    print("Введите у точки А: ")
    val y1 = readLine()!!.toDouble()
    print("Введите х точки В: ")
    val x2 = readLine()!!.toDouble()
    print("Введите у точки А: ")
    val y2 = readLine()!!.toDouble()

    if (sqrt(x1.pow(2)+y1.pow(2)) < sqrt(x2.pow(2)+y2.pow(2))){
        println("Точка А ближе к началу координат.")
    }
    else{
        println("Точка В блиэе к началу координат.")
    }
}