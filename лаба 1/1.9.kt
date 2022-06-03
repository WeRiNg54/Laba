fun main() {
    var time = 3
    var k = 1
    while (time <= 24) {
        k = k * 2
        println("Шёл $time-ий час, амёб стало $k")
        time = time + 3
    }
}