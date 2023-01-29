class Solution7 {
//    fun search(nums: IntArray, target: Int): Int {
//        var cursor = nums.size / 2
//
//        for (i in nums) {
//            if (nums[cursor] <= target) {
//                if (nums[cursor] == target) {
//                    return cursor
//                } else {
//                    if (cursor != nums.size - 1) {
//                        cursor++
//                    }
//                }
//            } else if (nums[cursor] >= target) {
//                if (nums[cursor] == target) {
//                    return cursor
//                } else {
//                    if (cursor != 0) {
//                        cursor--
//                    }
//                }
//            }
//        }
//        return -1
//    }

    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1

        while (low < high) {
            val cursor = low + (high - low) / 2
            if (nums[cursor] == target) return cursor
            else if (nums[cursor] > target) high = cursor - 1
            else low = cursor + 1
            println("$high,  $low")
        }
        return -1
    }


}