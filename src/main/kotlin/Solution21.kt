//class Solution21 {
//
//    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
//        if (root == null)
//            return null
//
//        if (p!!.`val` < root.`val` && q!!.`val` < root.`val`)
//            return lowestCommonAncestor(root.left, q, p)
//
//        if (p!!.`val` > root.`val` && q!!.`val` > root.`val`)
//            return lowestCommonAncestor(root.right, q, p)
//
//        return root
//    }
//
//}