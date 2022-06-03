fun gcd(x : Int, y : Int): Int {
    var x = x
    var y = y

    if (y > x){
        var z = 0
        z = x
        x = y
        y = z
    }
    if (y == 0) return x
    return gcd(y, x % y)
}

fun lcm(x : Int,y : Int): Int {
    return x * y / gcd(x,y)
}

fun main() {
    println("Введите число а: ")
    var x = readLine()?.toIntOrNull()
    println("Введите число b: ")
    var y = readLine()?.toIntOrNull()

    println(lcm(x!!,y!!))

}