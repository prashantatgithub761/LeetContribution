class Solution {
    public void sortColors(int[] nums) {
        // count number of zero , one and two
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;

            }
            else if (nums[i]==1){
                one++;

            }
            else if(nums[i]==2){
                two++;
            }
        }
        // fill in the array
        int count =0;
        for(int i = 0;i<zero;i++){
            nums[count++] = 0;
        }
        for(int i = 0;i<one;i++){
            nums[count++] = 1;
        }
        for(int i = 0;i<two;i++){
            nums[count++] = 2;
        }
        
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i]==2){
        //         nums[i]=two;
        //     }
        //     else if(nums[i]==1){
        //         nums[i]=one;
        //     }
        //     else if(nums[i]==0){
        //         nums[i]=zero;
        //     }
        // }
    }
}
