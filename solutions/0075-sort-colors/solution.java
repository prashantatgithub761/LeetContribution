class Solution {
    public void sortColors(int[] nums) {
        // count number of zero , one and two
        // int zero = 0;
        // int one = 0;
        // int two = 0;
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         zero++;

        //     }
        //     else if (nums[i]==1){
        //         one++;

        //     }
        //     else if(nums[i]==2){
        //         two++;
        //     }
        // }
        // // fill in the array
        // int count =0;
        // for(int i = 0;i<zero;i++){
        //     nums[count++] = 0;
        // }
        // for(int i = 0;i<one;i++){
        //     nums[count++] = 1;
        // }
        // for(int i = 0;i<two;i++){
        //     nums[count++] = 2;
        // }
        
        //Used dutch NationalFlag

        // int low = 0;
        // int high = nums.length-1;
        // int i = 0;

        // while(i<=high){
        //     if(nums[i]==0){
        //         // swap with low
        //         int temp = nums[low];
        //         nums[low] = nums[i];
        //         nums[i]=temp;
        //         low++;
        //         i++;

        //     }
        //     else if(nums[i]==2){
        //         // put the 2 in last
        //         int temp = nums[i];
        //         nums[i]=nums[high];
        //         nums[high]=temp;
        //         high--;
                
        //     }
        //     else{
        //         // put in middle
        //         i++;

        //     }


            int i = 0;
            int j = nums.length-1;
            int a = 0;

            while(a<=j){
                if(nums[a]==0){
                    // put in first
                    int temp = nums[i];
                    nums[i]=nums[a];
                    nums[a] = temp;
                    i++;
                    a++;
                }
                else if(nums[a]==2){
                    int temp = nums[j];
                    nums[j] = nums[a];
                    nums[a]=temp;
                    j--;
                }
                else{
                    a++;
                }
                
            }
            















        }
        
        
    }

