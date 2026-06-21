class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int right = n-1;
        int left = 0;
        while(right>=left){
            int mid = left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if (target<nums[mid]){
                // move toward left
                right=mid-1;
                

            }
            else{
                left = mid+1;

            }
        }
        return -1;
        
    }
}
