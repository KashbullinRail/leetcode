class Solution18 {


        fun climbStairs(n: Int): Int {
            var first = 1
            var second = 0
            var current = 0

            for(i in 0..n+1 ){
                if(i<2){
                    current = i
                }else {
                    current = first+second
                    second = first
                    first = current

                }
            }

            return current
        }

}