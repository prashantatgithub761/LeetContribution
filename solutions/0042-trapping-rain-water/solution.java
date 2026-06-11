class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] Leftmax = new int[n];
        int[] Rightmax = new int[n];

        Leftmax[0] = height[0];
        for(int i = 1; i < n; i++) {
            Leftmax[i] = Math.max(Leftmax[i - 1], height[i]);
        }

        Rightmax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            Rightmax[i] = Math.max(Rightmax[i + 1], height[i]);
        }

        int waterLevel = 0;

        for(int i = 0; i < n; i++) {
            waterLevel += Math.min(Leftmax[i], Rightmax[i]) - height[i];
        }

        return waterLevel;
    }
}
