class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] results = new int[nums.length];
        int post = 0;
        int neg = 1;
        for(int num: nums){
            if (num > 0) {
                results[post] = num;
                post += 2;
            } else {
                results[neg] = num;
                neg += 2;
            }
        }
        return results;
    }
}
