class Solution {
    public int minimumDeletions(int[] nums) {
        
        int n = nums.length;

        int a = 0;
        int b = 0;
        int min = nums[0];
        int max = nums[0];
        for(int i = 0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
                a = i;
            }
            if(nums[i]>max){
                max = nums[i];
                b = i;
            }
        }
        int p = Math.max(a, b) + 1;  // both from left

        int q = n - Math.min(a, b);  // both from right

        int r = (Math.min(a, b) + 1)+ (n - Math.max(a, b)); // one from each side

        return Math.min(p, Math.min(q, r));
    }
}
