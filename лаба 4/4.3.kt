class Volier(var name : String, var amount : String, var male : String, var female : String, var sound : String){
    fun Info(){
        var res = "Вольер с $name. В нем обитает $amount животных. Среди них $male мужских особей и $female женских.Они $sound";
        println(res)
    }
}

class Menu(){
    var voliers = mutableListOf<Volier>()

    fun check(){
        println("Введите название вольера, к которому хотите подойти: ")
        for (i in voliers){
            println(i.name)
        }
        var ch = readLine().toString()
        for (i in voliers){
            if(i.name == ch){
                i.Info()
            }
        }
    }

    fun add(volier : Volier){
        voliers.add(volier)
    }
}



fun main() {
    var vol1 = Volier("львы", "4", "1", "3", "рычат")
    var vol2 = Volier("волки", "6","4","2", "воют")
    var vol3 = Volier("обезьяны", "7", "3", "4", "кричат")
    var vol4 = Volier("питоны", "3","3","0", "шипят")

    var vols = Menu();

    vols.add(vol1)
    vols.add(vol2)
    vols.add(vol3)
    vols.add(vol4)

    vols.check()
}
