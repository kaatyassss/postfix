fun main() {
    val s = readLine().toString()
    print(calc(s))
}

fun calc(s:String):Double{
    val arr = s.split(" ")
    val st = mutableListOf<Double>()

    for(i in arr.indices){
        when(arr[i]) {
            "+" -> {
                val r = st.last()
                st.removeLast()
                val l = st.last()
                st.removeLast()
                st.add(l + r)
            }
            "-" -> {
                val r = st.last()
                st.removeLast()
                val l = st.last()
                st.removeLast()
                st.add(l - r)
            }
            "*" -> {
                val r = st.last()
                st.removeLast()
                val l = st.last()
                st.removeLast()
                st.add(l * r)
            }
            "/" -> {
                val r = st.last()
                st.removeLast()
                val l = st.last()
                st.removeLast()
                st.add(l / r)
            }
            else -> st.add(arr[i].toDouble())
        }
    }
    return st[0]
}