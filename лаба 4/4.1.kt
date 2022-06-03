class Book(var author : String, var title : String, var year : String){
    fun Info(){
        println("Книга $title, автора $author. Выпущена в $year году.")
    }
}

class Library(){
    var books = mutableListOf<Book>()

    fun AllBooks(){
        for (i in books){
            i.Info()
        }
    }

    fun add(book : Book){
        books.add(book)
    }

    fun pop(title : String){
        for (i in books){
            if (i.title == title){
                books.removeAt(books.indexOf(i))
            }
        }
    }

    fun find(author: String = "", title : String = "", year : String = ""){
        for (i in books){
            if (author == i.author || title == i.title || year == i.year){
                i.Info()
            }
        }
    }
}

fun main() {
    var book1 = Book("Александр Дюма","Граф Монте-Кристо","1844")
    var book2 = Book( "Эрих Ремарк", "Время жить и время умирать", "1954")
    var book3 = Book( "Фёдор Достоевский", "Бесы", "1871")
    var book4 = Book( "Лев Толстой", "Война и мир", "1865")
    var book5 = Book( "Оскар Уайльд", "Портрет Дориана Грея", "1890")

    var lib = Library()
    lib.add(book1)
    lib.add(book2)
    lib.add(book3)
    lib.add(book4)
    lib.add(book5)

    lib.AllBooks()
    println()

    lib.pop("Эрих Ремарк")
    println()

    lib.AllBooks()
    println()

    println("Поиск по году 1844:")
    print(lib.find(year="1844"))
    println()

    println("Поиск по автору Толстой:")
    print(lib.find(author="Толстой"))
    println()

    println("Поиск по названию Портрет Дориана Грея:")
    print(lib.find(title="Портрет Дориана Грея"))
    println()

}