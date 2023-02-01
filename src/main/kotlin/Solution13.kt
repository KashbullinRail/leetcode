class Solution13 {

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val value = image[sr][sc]
        if (value == color) return image
        image[sr][sc] = color
        if (sc > 0) {
            val left = image[sr][sc - 1]
            if (left == value) floodFill(image, sr, sc - 1, color)
        }
        if (sc < image[sr].lastIndex) {
            val right = image[sr][sc + 1]
            if (right == value) floodFill(image, sr, sc + 1, color)
        }
        if (sr > 0 && sc in 0..image[sr].lastIndex) {
            val right = image[sr - 1][sc]
            if (right == value) floodFill(image, sr - 1, sc, color)
        }
        if (sr < image.lastIndex && sc in 0..image[sr].lastIndex) {
            val right = image[sr + 1][sc]
            if (right == value) floodFill(image, sr + 1, sc , color)
        }
        println(image)
        return image
    }


}

