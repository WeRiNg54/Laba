fun main() {
    var num = 0;
    println("Введите 5 чисел: ");
    for (i in 1..5){
        val n = readLine()!!.toDouble();
        if (n > 0){
            num++;
        }
    }
    print("Положительные среди ниж: $num")
}