import java.time.LocalDate
import java.time.format.DateTimeParseException

fun foo (y:String, m:String, d:String) {
    val dt = y+"-"+m+"-"+d;
    try {
        var date = LocalDate.parse(dt)
        print("Дата корректна");
    }
    catch ( e : DateTimeParseException){
        print("Дата не корректна");
    }
}
fun main() {
    print("Введите день: ")
    val d = readLine()!!;
    print("Введите месяц: ")
    val m = readLine()!!;
    print("Введите год: ")
    val y = readLine()!!;

    foo(y,m,d);
}