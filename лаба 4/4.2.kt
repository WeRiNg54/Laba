class Product(var name : String){

}

class Salesman(){
    var prs = mutableListOf<Product>()

    fun ProductList(){
        println("Товары продавца: ")
        for (i in prs){
            println(i.name)
        }
    }

    fun buy(name : String, buyer : Buyer){
        for (i in prs){
            if (i.name == name){
                buyer.add(i)
                prs.removeAt(prs.indexOf(i))
            }
        }
    }

    fun add(pr: Product) {
        prs.add(pr)
    }
}

class Buyer(){
    var prs = mutableListOf<Product>();

    fun ProductList(){
        println("Покупки: ")
        for (i in prs){
            println(i.name)
        }
    }

    fun add(pr : Product){
        prs.add(pr)
    }
}

fun main() {

    var sale = Salesman()
    var buyer = Buyer()
    while(true) {
        print("Введите продукт (для того чтобы закончить введите Стоп): ")
        var pr = readLine()!!
        if (pr == "Стоп") {
            break
        }
        else {
            var prs = Product(pr)
            sale.add(prs)
        }
    }

    sale.ProductList()

    print("Введите название товара для покупки: ")
    sale.buy(readLine().toString(),buyer)

    sale.ProductList()
    buyer.ProductList()

}
