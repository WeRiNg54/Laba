fun main() {
    print("Введите натуральное число K: ");
    val k = readLine()!!.toInt();
    print("Введите натуральное число M: ");
    val m = readLine()!!.toInt();

    var res = "";

    for (i in k..m){
        res += "$i ";
    }

    print(res);
}