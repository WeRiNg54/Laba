class Enclosure(var name : String, var amount : String, var male : String, var female : String, var sound : String){
    fun Info(){
        var res = "Вольер с $name. В нем обитает $amount животных. Среди них $male мужских особей и $female женских.Они $sound";
        println(res)
    }
}

class Menu(){
    var enclosures = mutableListOf<Enclosure>();

    fun check(){
        println("Введите название вольера, к которому хотите подойти: ")
        for (i in enclosures){
            println(i.name)
        }
        var ch = readLine().toString();
        for (i in enclosures){
            if(i.name == ch){
                i.Info();
            }
        }
    }

    fun add(enclosure : Enclosure){
        enclosures.add(enclosure);
    }
}



fun main() {
    var enc1 = Enclosure("львы", "4", "1", "3", "рычат")
    var enc2 = Enclosure("волки", "6","4","2", "воют")
    var enc3 = Enclosure("обезьяны", "7", "3", "4", "кричат")
    var enc4 = Enclosure("питоны", "3","3","0", "шипят")

    var menu = Menu();

    menu.add(enc1)
    menu.add(enc2)
    menu.add(enc3)
    menu.add(enc4)

    menu.check();
}