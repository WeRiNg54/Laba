fun main() {
    val fuel = mapOf("92" to 47 , "95" to 51 , "98" to 60, "dis" to 55)

    print("Введите тип топлива - 92,95,98,dis: ");
    var fuel_type = readLine()
    print("Введите количество литров: ");
    val n = readLine()!!.toInt();

    val res = fuel[fuel_type]?.times(n);
    println("$res рублей за $n литров $fuel_type бензина")
}