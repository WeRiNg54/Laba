fun funct(n : String): Boolean {
    if (n == n.reversed()) return true
    else return false
}

fun main() {
    print("Введите первое натуральное число: ")
    val n1 = readLine()!!
    print("Введите второе натуральное число: ")
    val n2 = readLine()!!

    if (funct(n1) || funct(n2)){
        print("Хотя бы одно из заданных чисел является палиндромом!")
    }
    else print("Ни одно из заданных чисел не является палиндромом!")

}