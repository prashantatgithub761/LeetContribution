class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int left = 0;
        

        for(int right = 1;right<nums.length;right++){
            // loop to get the uniques element

            // agr right element unique hai toh left ko right banaa doo taaki right aage badhh paaye..
            if(nums[right]!=nums[left]){
                left++;
                nums[left]=nums[right];
                

            }
        }
        return left+1;
    }
}
