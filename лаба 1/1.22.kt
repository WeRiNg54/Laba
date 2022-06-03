fun main() {
    var n = 0;

    print("Введите целое число: ");
    val num = readLine()!!.toInt();
    for (i in num downTo 1 step 1){
        if (num % i == 0){
            println("$i ")
            n+=1;
        }
    }
    println("Кол-во делителей: $n")
}