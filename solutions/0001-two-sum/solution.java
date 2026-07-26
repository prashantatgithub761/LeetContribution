import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // int n = nums.length;

        // // Step 1: store value + index
        // int[][] arr = new int[n][2];
        // for(int i = 0; i < n; i++){
        //     arr[i][0] = nums[i]; // value
        //     arr[i][1] = i;       // index
        // }

        // // Step 2: sort based on value
        // Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // // Step 3: two pointer
        // int left = 0, right = n - 1;

        // while(left < right){
        //     int sum = arr[left][0] + arr[right][0];

        //     if(sum == target){
        //         return new int[]{arr[left][1], arr[right][1]};
        //     }
        //     else if(sum < target){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }

        // return new int[]{-1, -1};

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }
        // for(int i = 0;i<nums.length;i++){
        //     int val = target-nums[i];
        //     if(map.containsKey(val)&&map.get(val)!=i){
                
        //         return new int[]{i,map.get(val)};
        //     }
        // }
        // return new int[]{-1,-1};

        HashMap<Integer,Integer> map = new HashMap<>();
        // add this nums digits in map 
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);

        }

        for(int i = 0;i<nums.length;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)&&map.get(rem)!=i){
                return new int[] {i,map.get(rem)};
            }
        }
        return new int[]{-1,-1};


    }
}
