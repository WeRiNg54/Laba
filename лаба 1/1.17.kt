fun main() {
    print("Введите кол-во потраченных минут: ")
    val n = readLine()!!.toInt();

    if (n <= 500){
        print("С вас 350р")
    }
    else {
        print("С вас " + (350 + (n-500)*2) + "p.")
    }
}