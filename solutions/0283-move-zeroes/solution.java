class Solution {
    public void moveZeroes(int[] nums) {
        // int n = nums.length;
        // int zeroes = 0;
        // int a = 0;
        // for(int i = 0;i<n;i++){
        //     // count zeros
        //     if(nums[i]==0){
        //         zeroes++;

        //     }
        //     else{
        //         nums[a++]=nums[i];

        //     }

            
        // }
        // // add the rest of elements as zero in last
        // for(int i = n-1;i>=n-zeroes;i--){
        //     nums[i]=0;
        // }


        // count the number of zeroes and add them at last
        int index = 0;
        int zero = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
            else{
                zero++;
            }
            
        }
        
        // now fill zeroes from last
        while(zero>0){
            nums[index] = 0;
            index++;
            zero--;
        }
        
    }
}
