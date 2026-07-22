class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int c = 0;
        for(int i = 0;i<n;i++){
            arr[c++] = nums[i];
            arr[c++] = nums[i+n];
        }
        return arr;
    }
}
