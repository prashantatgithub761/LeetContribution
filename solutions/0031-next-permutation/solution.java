class Solution {
    public void nextPermutation(int[] nums) {

        // 1. find the breakThrough
        int n = nums.length;
        int i = -1;

        for(int ind = n-2;ind>=0;ind--){
            if(nums[ind]<nums[ind+1]){
                i=ind;
                break;
            }
        }
        if(i==-1){
            reverse(nums,0,n-1);
            return;
        }

        // now find the min element from right of i that is > than element at i 
        int min = 101;
        int k = 0;

        for(int j = i+1;j<n;j++){
            if(nums[j]>nums[i]){
                min = Math.min(min,nums[j]);
                k = j;
                
                // now i have breakpoint and the element to which i have to swap

            }
        }
        // swap the elements
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;

        // now sort the element after i
        reverse(nums,i+1,n-1);






    }


    void reverse(int[] nums, int a, int b){
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
        // 1. Find the first smaller number from the right


        // int i = n-2;
        // while(i>=0&&nums[i]>=nums[i+1]){
        //     i--;
        // }












    //     int i = nums.length - 2;

    //     while (i >= 0 && nums[i] >= nums[i + 1]) {
    //         i--;
    //     }


    //     // 2. Swap it with the first larger number from the right













    //     if (i >= 0) {
    //         int j = nums.length - 1;

    //         while (nums[j] <= nums[i]) {
    //             j--;
    //         }

    //         swap(nums, i, j);
    //     }

    //     // 3. Reverse the part after i
    //     int left = i + 1;
    //     int right = nums.length - 1;

    //     while (left < right) {
    //         swap(nums, left, right);
    //         left++;
    //         right--;
    //     }
    

    // void swap(int[] nums, int a, int b) {
    //     int temp = nums[a];
    //     nums[a] = nums[b];
    //     nums[b] = temp;
    // }
}
