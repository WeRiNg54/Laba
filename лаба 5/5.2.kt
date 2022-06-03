fun main() {
    val nums = mutableListOf<Int>()

    while (true){
        val n = readLine()!!.toIntOrNull()
        if (n != null) nums.add(n)
        else {
            for (i in 0..nums.last()-1){
                println(nums.removeAt(0))
            }
            break
        }
    }
}