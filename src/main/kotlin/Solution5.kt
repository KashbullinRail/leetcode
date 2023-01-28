import java.util.*
import kotlin.collections.HashSet
import kotlin.math.sinh

class Solution5 {
    fun minimumOperations(nums: IntArray): Int {
        if (nums.all { it.equals(0) }) {
            return 0
        }
        var dev: Int = 0
        var sinking: Int = 0
        Arrays.sort(nums)
       loop@ for (i in 0..nums.size - 1) {
            if (nums[i] == 0) continue
            if (nums[i] > 0){
                sinking++
                dev = nums[i]
                for (k in i..nums.size-1){
                    if(nums[k] != 0) {
                        nums[k] = nums[k]-dev
                    }
                }
            }
        }
        return sinking
    }


//    fun efer(nums: IntArray): Int {
//        if (!nums.all { it.equals(0) }){
//            println(true)
//        }
//    return 0
//    }

}