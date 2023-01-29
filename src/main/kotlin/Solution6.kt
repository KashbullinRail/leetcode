class Solution6 {

    fun numIslands(grid: Array<CharArray>): Int {
        if (grid == null || grid.size == 0) return 0

        var numberOfIsland = 0

        for (i in 0..grid.size - 1) {
            for (k in 0..grid[i].size - 1) {
                if (grid[i][k].equals('1')){
                    numberOfIsland++
                    searchIslandBorder(grid, i, k)
                }
            }
        }
        println(numberOfIsland)
        return numberOfIsland
    }

    private fun searchIslandBorder(grid: Array<CharArray>, i: Int, k: Int) {
        if (i < 0 || i > grid.size-1 || k < 0 || k > grid[i].size-1 || grid[i][k].equals('0')) return

        grid[i][k] = '0'

        searchIslandBorder(grid, i+1, k)
        searchIslandBorder(grid, i-1, k)
        searchIslandBorder(grid, i, k+1)
        searchIslandBorder(grid, i, k-1)
    }


}