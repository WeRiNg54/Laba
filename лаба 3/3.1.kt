class Computer(var name : String, var ip : String, var user : String, var password : String,var cores : Int, var vram : Int, var hdd_gb : Int){
    var logged_in = false;


    fun UserInfo(){
        if (logged_in) println("В данный момент активен пользователь $user")
        else println("Вы не авторизованы.")

    }

    fun TechInfo(){
        println("Технические характеристики компьютера: ")
        println("IP: $ip\n Кол-во ядер: $cores\n Объём VRAM: $vram\n Объём HDD: $hdd_gb")
    }

    fun login(u : String, pass : String): Boolean {
        if (u == user && pass == password) logged_in = true
        return logged_in
    }

    fun unlogin(): Boolean {
        if (!logged_in){
            return false
        }
        logged_in = false
        return true
    }

    fun change_password(pass : String): Boolean {
        if (!logged_in) {
            println("Невозможно изменить пароль. Вы не авторизованы.")
            return false
        };
        password = pass
        println("Пароль изменен.")
        return true
    }



}

fun main() {
    val comp1 = Computer("Enigma", "192.168.1.1", "Gregor", "qwerty", 2, 4, 512)
    val comp2 = Computer("Brom", "192.168.1.1", "Mike", "qwerty", 4, 8, 1024)
    val comp3 = Computer("Gidro", "192.168.0.1", "Josh", "qwerty", 8, 12, 128)



    comp1.UserInfo() // Вы не авторизованы
    println(comp1.login("Gregor", "qwerty")) // Авторизация
    comp1.UserInfo() // Выведет инфу т.к. авторизовались

    comp1.change_password("1234567") // меняем пароль
    comp1.unlogin() //выходим
    println(comp1.login("Gregor", "qwerty")) // пробуем зайти по старому паролю - false

    comp2.TechInfo() // Выведет
    comp2.change_password("pass") // false - не авторизованы
}