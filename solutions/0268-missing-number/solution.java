class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n+1)*n/2;
        int crsum=0;
        // sum of arr
        for(int x:nums){
            crsum+=x;
        }
        return sum-crsum;
    }
}
