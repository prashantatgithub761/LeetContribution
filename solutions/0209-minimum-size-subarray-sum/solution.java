class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int Min_window = Integer.MAX_VALUE;
        int n = nums.length;
        int left = 0;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                Min_window = Math.min(Min_window,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return Min_window==Integer.MAX_VALUE?0:Min_window;
        
        
    }
}
