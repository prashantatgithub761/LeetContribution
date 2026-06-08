class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zeroes = 0;
        int a = 0;
        for(int i = 0;i<n;i++){
            // count zeros
            if(nums[i]==0){
                zeroes++;

            }
            else{
                nums[a++]=nums[i];

            }

            
        }
        // add the rest of elements as zero in last
        for(int i = n-1;i>=n-zeroes;i--){
            nums[i]=0;
        }
        
    }
}
