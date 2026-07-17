class Solution {
    public void rotate(int[] nums, int k) {
        // int[] num1 = new int[nums.length];
        // int c = 0;
        // for(int i = k+1;i<nums.length;i++){
        //     num1[c++] = nums[i];

        // }
        // for(int i = 0;i<k+1;i++){
        //     num1[c++] = nums[i];
        // }
        

        int n = nums.length;
        
        k=k%n;

        int left = 0;
        int right = n-1;
        while(left<right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;

        }
        
        // now reverse these both segment 
        left = 0;
        right = k-1;
        while(left<right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
        left = k;
        right = n-1;
        while(left<right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }

        
    }
}
