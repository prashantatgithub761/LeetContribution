class Solution {
    public int removeDuplicates(int[] nums) {
        int a = 0;
        int b = 1;
        int n = nums.length;
        while(b<n){
            //if same
            if(nums[a]==nums[b]){
                b++;
            }
            else{
                
                nums[a+1] = nums[b];
                a++;
                b++;
            }


        }
        return a+1;
    }
}