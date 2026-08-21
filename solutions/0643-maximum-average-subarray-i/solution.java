class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
        double max = sum;
        // now slide the window to finds the max sum
        int i = 0;
        for(int j = k;j<nums.length;j++){
            sum+=nums[j];
            sum-=nums[i];
            i++;
            if(sum>max){
                max = sum;
            }
        }
        double ans = max/k;
        return ans;

        
    
    }
}
