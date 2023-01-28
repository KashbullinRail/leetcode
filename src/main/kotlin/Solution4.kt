
import java.util.Arrays

class Solution4 {
    fun containsDuplicate(nums: IntArray): Boolean {
        Arrays.sort(nums)
        for (i in 0..nums.size-2) {
                if (nums[i] == nums[i+1]) {
                    return true
                }
        }
        return false
    }
}