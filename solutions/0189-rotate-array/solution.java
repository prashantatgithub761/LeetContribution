class Solution {
    public void rotate(int[] nums, int k) {
        
        // rev whole arr 
        // rev both parts
        int n = nums.length-1;
        k = k%nums.length;
        if(k<0)
        {
           k+=nums.length;
        }
        
        rev(nums,0,n);

        
        // both the part should be rev as well
        rev(nums,0,k-1);
        rev(nums,k,n);
        
    }
    void rev(int[] nums, int a , int b){
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}
