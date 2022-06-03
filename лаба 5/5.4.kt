fun main() {
    val pack1 = mutableSetOf<String>()
    val pack2 = mutableSetOf<String>()

    print("Введите товары первого пользователся(для прекращения введите Стоп): ")
    while (true) {
        var n = readLine()!!.toString()
        if (n == "Стоп") break
        pack1.add(n)
    }

    print("Введите товары второго пользователся(для прекращения введите Стоп): ")
    while (true) {
        var n = readLine()!!.toString()
        if (n == "Стоп") break
        pack2.add(n)
    }

    println("Общие товары пользователей: ")
    println(pack1.intersect(pack2))

    println("Уникальные товары для 1-го пользователя: ")
    println(pack1 - pack1.intersect(pack2))

    println("Товары, которые есть у обоих пользователей: ")
    println(pack1 + pack2)

}