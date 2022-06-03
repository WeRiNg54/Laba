import kotlin.math.pow
fun main() {
    var x = 2.0
    var st = 3
    var k = 2.0
    while (st <= 11) {
        k = k + x.pow(st.toDouble()) / st
        st = st + 2
    }
    print("%.2f".format(k))
}