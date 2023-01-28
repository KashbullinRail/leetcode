class Solution3 {
    fun isPalindrome(s: String): Boolean {
//        val ss = s.toLowerCase()
//        var str: String = ""
//        var bb: Boolean = false
//        if (ss.isBlank()) {
//            bb = true
//        } else {
//            for (i in ss.indices) {
//                if (Regex("[a-z]").matches(ss[i].toString())) {
//                    str = str + ss[i].toString()
//                }
//                if (Regex("[0-9]").matches(ss[i].toString())) {
//                    str = str + ss[i].toString()
//                }
//            }
//            println(str)
//            if (str.isNotEmpty()) {
//                loop@ for (k in 0..(str.length - 1) / 2) {
//                    if (str[k] == str[str.length - 1 - k]) {
//                        bb = true
//                    } else {
//                        bb = false
//                        println(bb)
//                        break@loop
//                    }
//                }
//            } else {
//                bb = true
//            }
//        }
//        println(bb)
//        return bb
//    }
        if (s == null) return false
        if (s.length == 1) return true

        var left = 0
        var right = s.length - 1

        while (left < right) {
            var l = s[left]
            var r = s[right]
            if (!Character.isLetter(l) && !Character.isDigit(l)) {
                left++
                continue
            }
            if (!Character.isLetter(r) && !Character.isDigit(r)) {
                right--
                continue
            }
            l = Character.toLowerCase(l)
            r = Character.toLowerCase(r)
            if (l != r) {
                return false
            }
            left++
            right--
        }
        return true
    }
}