class Solution15 {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (ransomNote.length > magazine.length) return false
        val a = ransomNote.toByteArray()
        var b = magazine.toByteArray()
        for (i in 0 until a.size) {
           loop@ for (k in 0 until b.size) {
                if (a[i] == b[k]) {
                    println(b[k])
                    b[k] = -1
                    println(b[k])
                    break@loop
                } else {
                    println("false")
                    if (k == b.size - 1) return false
                }
            }
        }
        return true
    }

}