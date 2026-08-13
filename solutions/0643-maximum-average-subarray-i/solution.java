class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int left = 0;
        // int right = k-1;
        
        // int sum = 0;
        // for(int i = left;i<=right;i++){
        //     sum+=nums[i];

        // }
        
        // // now find to max avg
        // int MaxSum = sum;
        // while(right<nums.length-1){
        //     sum = sum+nums[++right]-nums[left++];
            
        //     MaxSum = Math.max(MaxSum,sum);
        // }
        // return (double)MaxSum/k;


        // find sum of first window
        int sum = 0;
        
        for(int i = 0;i<k;i++){
            sum+=nums[i];
            

        }

        // now traverse into the all windows and update max 
        int i = 0;
        
        int max = sum;

        for(int j = k;j<nums.length;j++){
            sum+=nums[j]-nums[i];
            i++;
            max = Math.max(max,sum);

        }
        
        
        return (double)max/k;

        
    }
}
