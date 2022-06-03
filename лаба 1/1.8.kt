fun main() {
    print("Какое кол-во груза: ")
    var k = readLine()!!.toInt()
    var sum: Int = 0
    for(i in 1..k) {
        print("Введите массу $i-го груза: ")
        var p = readLine()!!.toInt()
        sum = sum + p
    }
    print("Общая масса груза - $sum")
}