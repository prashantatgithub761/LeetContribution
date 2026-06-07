class Solution {
    public int[] concatWithReverse(int[] nums) {
        int result[] = new int[nums.length*2];
        int c = 0;
        // getting elements 
        for(int i = 0;i<nums.length;i++){
            result[c++] = nums[i];
        }
        int rev[] = reverseArray(nums);

        //for rev.
        for(int i = 0;i<rev.length;i++){
            result[c++]=rev[i];
        }
        return result;
        
    }
    public int[] reverseArray(int nums[]) {
        // code here
        int len = nums.length;
        int st = 0;
        int lst = len-1;
        int temp;
        while(st<lst){
            temp = nums[st];
            nums[st++]=nums[lst];
            nums[lst--] = temp;
            
        }
        return nums;
    }
}
