fun main() {
    print("Введите натуральное число: ")
    var x = readLine()!!.toInt()
    var k = 0
    while (x > 0) {
        var l = x % 10
        x = x / 10
        if (l == 5 || l == 0) {
            k += 1
        }
    }
    print (k)
}