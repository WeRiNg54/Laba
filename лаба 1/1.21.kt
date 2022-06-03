fun main() {
    var fib1 = 1;
    var fib2 = 1;

    print("Введите номер элемента ряда Фибоначчи: ")
    val n = readLine()!!.toInt();

    var i = 0;
    while (i < n-2){
        var fib_sum = fib1 + fib2;
        fib1 = fib2;
        fib2 = fib_sum;
        i += 1;
    }

    println("Значение этого элемента: $fib2");
}