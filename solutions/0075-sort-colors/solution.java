class Solution {
    public void sortColors(int[] nums) {
        int a = 0;
        int b = nums.length-1;
        for(int i = 0;i<=b;i++){
            if(nums[i]==0){
                // swap it with a
                int temp = nums[a];
                nums[a] = nums[i];
                nums[i] = temp;
                a++;
            }
            else if(nums[i]==2){
                // swap it with b
                int te = nums[b];
                nums[b] = nums[i];
                nums[i] = te;
                b--;
                i--;
                
            }
            
        }
    }
}
