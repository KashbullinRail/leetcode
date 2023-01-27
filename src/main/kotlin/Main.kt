fun main(args: Array<String>) {

//    Solution1().twoSum(IntArray(6) { it * 1 }, 5)
//    Solution1().twoSum(IntArray(2){3}, 6)

//    Solution2().isValid("(]{}[]")
    Solution2().isValid("{([])}")

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
        loop@ for (i in 0..s.length - 1 step 2) {
            if (s[i] == '(') if (!(s[i + 1] == ')')) {
                if (!(s[s.length - i - 1] == ')')) state = false
            }
            if (s[i] == '[') if (!(s[i + 1] == ']')) {
                if (!(s[s.length - i - 1] == ']')) state = false
            }
            if (s[i] == '{') if (!(s[i + 1] == '}')) {
                if (!(s[s.length - i - 1] == '}')) state = false
            }
            println(state)
            if (!state) break@loop
            println("${s[i]}, ${s[i + 1]}")
        }
        return state
    }
}




















