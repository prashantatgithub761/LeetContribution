class Solution {
    public void moveZeroes(int[] nums) {
        // take a pointer at end to fill zero 
        // and one to traverse the array to fill non zero 

        int a = 0;
        int b = 0;
        int n = nums.length;
        while(b<n){
            if(nums[b]!=0){
                // swap with a
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b++;
            }
            else{
                b++;
            }

        }
        
    }
}