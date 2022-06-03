fun main() {
    print("Введите натуральное число: ")
    var x = readLine()!!.toInt()
    var l: Int = 0
    while (x > 0) {
        l = l * 10 + x % 10
        x = x / 10
    }
    print(l)
}