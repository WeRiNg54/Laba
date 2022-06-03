fun main() {
    print("Введите возраст: ")
    val age = readLine()!!.toInt();

    if (age <= 6) print("Дошкольник");
    else if (age in 7..18) print("Школьник");
    else if (age in 19..59) print("Рабочий");
    else if (age >= 60) print("Пенсионер");
}