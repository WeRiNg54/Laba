import java.awt.Point

fun Perimeter(a:Point,b:Point,c:Point): Double {
    return (a.distance(b) + b.distance(c) + c.distance(a))
}

fun main() {
    print("Введите x первой вершины: ")
    val x1 = readLine()!!.toDouble()
    print("Введите y первой вершины: ")
    val y1 = readLine()!!.toDouble()
    val a = Point()
    a.setLocation(x1,y1)
    print("Введите x второй вершины: ")
    val x2 = readLine()!!.toDouble()
    print("Введите y второй вершины: ")
    val y2 = readLine()!!.toDouble()
    val b = Point()
    b.setLocation(x2,y2)
    print("Введите x третьей вершины: ")
    val x3 = readLine()!!.toDouble()
    print("Введите y третьей вершины: ")
    val y3 = readLine()!!.toDouble()
    val c = Point()
    c.setLocation(x3,y3)

    print("Длины периметра равна: " + Perimeter(a,b,c))
}