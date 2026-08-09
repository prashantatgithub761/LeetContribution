class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        
        
        int[] ans = new int[n--];
        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];
            if(leftsq>rightsq){
                ans[n--] = leftsq;
                left++;

            }
            else {
                ans[n--] = rightsq;
                right--;
            }
            
        }
        return ans;
    }
        
}
