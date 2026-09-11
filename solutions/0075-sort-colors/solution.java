class Solution {
    public void sortColors(int[] nums) {
    //     // int a = 0;
    //     // int b = nums.length-1;
    //     // for(int i = 0;i<=b;i++){
    //     //     if(nums[i]==0){
    //     //         // swap it with a
    //     //         int temp = nums[a];
    //     //         nums[a] = nums[i];
    //     //         nums[i] = temp;
    //     //         a++;
    //     //     }
    //     //     else if(nums[i]==2){
    //     //         // swap it with b
    //     //         int te = nums[b];
    //     //         nums[b] = nums[i];
    //     //         nums[i] = te;
    //     //         b--;
    //     //         i--;
                
    //     //     }
            
    //     // }
        

    //     int st = 0;
    //     int lst = nums.length-1;
    //     int mid = 0;

    //     while(mid<=lst){
    //         if(nums[mid]==0){
    //             swap(nums,st,mid);
    //             st++;
    //         }
    //         else if(nums[mid]==2){
    //             swap(nums,mid,lst);
    //             lst--;
    //             mid--;

                
    //         }
            

    //         mid++;
    //     }


    // }
    // void swap(int[] nums,int i, int j){
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }

      // ekk pointer shuru mae 
      int a = 0;
      // ekk at the end
      int b = nums.length-1;

      for(int i = 0;i<=b;i++){
        // b tkk iss liye chlayaa kyuki 2 dikhte hi hun b ghtayenge takki last mae 2 swap naa hoo

        if(nums[i]==0){
            // now swap this with element at a
            int temp = nums[a];
            nums[a] = nums[i];
            nums[i] = temp;
            a++;

        }
        if(nums[i]==2){
           // place at end
           int temp = nums[b];
           nums[b] = nums[i];
           nums[i] = temp;
           b--;
           i--;
        }

      }


    }


}
