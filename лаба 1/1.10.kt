fun main() {
    print("Введите m: ")
    var m = readLine()!!.toInt()
    print("Введите n: ")
    var n = readLine()!!.toInt()
    var a = IntArray(m)
    var k = 0
    var r = 0
    for (i in 0..m-1) {
        print("Введите a$i: ")
        var ai = readLine()!!.toInt()
        if (ai % n == 0) {
            k += 1
            a[i] = ai
        }
    }
    for (i in 0..m-1) {
        r += a[i]
    }
    r = r/k
    print("Среднее арифметическое: $r")
}