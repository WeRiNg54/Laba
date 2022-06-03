fun main() {
    print("Введите а: ");
    val a = readLine()!!.toInt();
    print("Введите b: ");
    val b = readLine()!!.toInt();

    if (a<b) {
        print("Дробь a/b является правильной")
    }
    else {
        print("Дробь a/b не является правильной")
    }
}