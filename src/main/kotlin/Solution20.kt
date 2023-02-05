//class Solution20 {
//
//    fun isBalanced(root: TreeNode?): Boolean {
//        return branchDepth(root) != -1
//    }
//    private fun branchDepth(root: TreeNode?): Int {
//        root ?: return 0
//        val lDepth = branchDepth(root.left)
//        val rDepth = branchDepth(root.right)
//        val delta = Math.abs(lDepth - rDepth)
//        return when {
//            lDepth == -1 ||
//                    rDepth == -1 ||
//                    Math.abs(lDepth - rDepth) > 1 -> -1
//            else -> 1 + maxOf(lDepth, rDepth)
//        }
//    }
//}