class Solution {
    public int singleNumber(int[] nums) {
        // could use hashmap by counting count nd if count is one return it otherwise -1
        int ans = 0;
        for(int x : nums){
            ans ^= x;

        }
        return ans;
    }
}
