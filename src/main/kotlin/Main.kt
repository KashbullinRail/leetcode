fun main(args: Array<String>) {

//    Solution1().twoSum(IntArray(6) { it * 1 }, 5)
//    Solution1().twoSum(IntArray(2){3}, 6)

//    Solution2().isValid("(]{}[]")
//    Solution2().isValid("{[]}")

    Solution3().isPalindrome("A man, a plan, a canal: Panama")
//    Solution3().isPalindrome("0P")
}

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val finalArray = IntArray(2)
        for (i in 0 until nums.size) {
            for (k in i + 1 until nums.size) {
                val fakeTarget = nums[i] + nums[k]
                if (fakeTarget == target) {
                    finalArray[0] = i
                    println(finalArray[0])
                    finalArray[1] = k
                    println(finalArray[1])
                    return finalArray
                }
            }
        }
        return finalArray
    }
}

class Solution2 {
    fun isValid(s: String): Boolean {
        var state: Boolean = true
        if (s.length < 2) {
            state = false
        } else {
            if ((s[0] == ')') || (s[0] == ']') || (s[0] == '}')) {
                state = false
            } else {
                loop@ for (i in 0..s.length - 1 step 2) {
                    println(s[i])
                    if (s[i] == '(') if (!(s[i + 1] == ')')) {
                        if (!(s[s.length - i - 1] == ')')) state = false
                    }
                    if (s[i] == '[') if (!(s[i + 1] == ']')) {
                        if (!(s[s.length - i - 1] == ']')) state = false
                    }
                    if (s[i] == '{') if (!(s[i + 1] == '}')) {
                        if (!(s[s.length - i - 1] == '}')) state = false
                    }
                    if (!state) break@loop
                    println("${s[i]}, ${s[i + 1]}")
                }
            }
        }
        println(state)
        return state
    }
}

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



















