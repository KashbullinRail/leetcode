fun main(args: Array<String>) {

//    Solution1().twoSum(IntArray(6) { it * 1 }, 5)
//    Solution1().twoSum(IntArray(2){3}, 6)







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
        for (i in s) {
            if (s.get(i) == "(") {

            }
        }
    }
}



















