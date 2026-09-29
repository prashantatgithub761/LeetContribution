class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int a = 0;
        int b = row * col - 1;

        while (a <= b) {
            int mid = a + (b - a) / 2;
            int value = matrix[mid / col][mid % col];

            if (value == target) {
                return true;
            } else if (value < target) {
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }

        return false;
    }
}