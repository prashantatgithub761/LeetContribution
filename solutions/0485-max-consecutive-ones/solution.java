class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int max = 0;
        // int count = 0;
        // if(nums.length<2){
        //     if(nums[0]==0){
        //         return 0;
        //     }
        //     else if(nums[0]==1){
        //         return 1;
        //     }
        // }
        // for(int i = 0;i<nums.length-1;i++){
            
        //     if(nums[i]==1&&nums[i+1]==1){
        //         count++;
        //     }
        //     else{
        //         count=0;
        //     }
        //     max = Math.max(max,count);
        // }
        // return max+1;
        int count = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                
                    count++;
            }

             else{
                    count=0;
            }
            
            max = Math.max(max,count);
        }
        return max;
    }
}
