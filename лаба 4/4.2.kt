class Product(var name : String){

}

class Salesman(){
    var products = mutableListOf<Product>()

    fun ProductList(){
        println("Товары продавца: ")
        for (i in products){
            println(i.name)
        }
    }

    fun add(product : Product){
        products.add(product)
    }

    fun buy(name : String, buyer : Buyer){
        for (i in products){
            if (i.name == name){
                buyer.add(i)
                products.removeAt(products.indexOf(i))
            }
        }
    }
}

class Buyer(){
    var products = mutableListOf<Product>();

    fun ProductList(){
        println("Покупки: ")
        for (i in products){
            println(i.name)
        }
    }

    fun add(product : Product){
        products.add(product)
    }
}

fun main() {

    var pr1 = Product("Сыр")
    var pr2 = Product("Хлеб")
    var sale = Salesman()
    var buyer = Buyer()

    sale.add(pr1)
    sale.add(pr2)

    sale.ProductList()

    print("Введите название товара для покупки: ")
    sale.buy(readLine().toString(),buyer)

    sale.ProductList()
    buyer.ProductList()

}