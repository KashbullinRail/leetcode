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