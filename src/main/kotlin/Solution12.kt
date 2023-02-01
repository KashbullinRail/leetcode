class Solution12 {
//
//    fun maxProfit(prices: IntArray): Int {
//        var max = 0
//        for (i in 0..prices.size-1) {
//            for (k in i + 1..prices.size - 1) {
//                if ((prices[k] - prices[i]) > max) {
//                    max = prices[k] - prices[i]
//                }
//            }
//        }
//        return max
//    }

    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0
        var prof = 0
        var min = prices[0]
        for (i in 1 until prices.size) {
            min = Math.min(min, prices[i])
            prof = Math.max(prices[i] - min, prof)
        }
        return prof
    }






}