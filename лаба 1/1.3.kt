fun main() {
    print("Введите k: ")
    var k = readLine()!!.toInt()
    var x = k % 7
    when(x) {
        1 -> print("Понедельник")
        2 -> print("Вторник")
        3 -> print("Среда")
        4 -> print("Четверг")
        5 -> print("Пятница")
        6 -> print("Суббота")
        0 -> print("Воскресенье")
    }
}