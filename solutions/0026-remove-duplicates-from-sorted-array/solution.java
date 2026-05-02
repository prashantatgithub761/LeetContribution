class Solution {
    public int removeDuplicates(int[] nums) {
        // if (nums.length == 0) return 0;

        // int j = 1;  // pointer for unique elements
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] != nums[i - 1]) {
        //         nums[j] = nums[i];  // place unique element
        //         j++;
        //     }
        // }
        // return j;  // length of unique elements
        if(nums.length==0) return 0;

         
        int unique = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                // add into arr and inc unique
                nums[unique] = nums[i];
                unique++;
            }

        }
        return unique;



    }
}
