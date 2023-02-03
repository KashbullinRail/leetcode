//class Solution: VersionControl() {
//    override fun firstBadVersion(n: Int) : Int {
//        var start = 1
//        var end = n
//
//        while (start <= end) {
//            val mid = start + (end - start)/2
//            if (isBadVersion(mid)) {
//                end = mid - 1
//            } else {
//                start = mid + 1
//            }
//        }
//        return start
//    }
//}