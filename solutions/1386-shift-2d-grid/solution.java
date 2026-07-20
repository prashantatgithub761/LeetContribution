class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        // k steps of shifting 
        
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        k = k%total;
        
        int[][] ans = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                //crnt Index 
                int index = i*n+j;
                int newIndex = (index+k)%total;
                int newRow = newIndex / n;
                int newCol = newIndex % n;
                ans[newRow][newCol] = grid[i][j];
            }
        }
        List<List<Integer>> result = new ArrayList<>();

        for (int a = 0; a < m; a++) {
            List<Integer> row = new ArrayList<>();
            for (int b = 0; b < n; b++) {
                row.add(ans[a][b]);
            }
            result.add(row);
        }

        return result;

    }
}

        


       

        
    

