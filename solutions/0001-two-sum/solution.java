// class Solution {
//     public int[] twoSum(int[] nums, int target) {


//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],i);
//         }
//         for(int i = 0;i<nums.length;i++){
//             int val = target-nums[i];
//             if(map.containsKey(val)&&map.get(val)!=i){
                
//                 return new int[]{i,map.get(val)};
//             }
//         }
//         return new int[]{-1,-1};










//         // int n = nums.length;
//         // int left = 0;
//         // int right = n-1;
//         // while(left<right){
//         //     int sum = nums[left]+nums[right];
//         //     if(sum == target){
//         //         // return left,right
//         //         return new int[]{left,right};
//         //     }
//         //     else if (sum>target){
//         //         // move left ki taraf
//         //         right--;
//         //     }
//         //     else{
//         //         //move toward right
//         //         left++;
//         //     }
//         // }
//         // return null;
        
//     }
    
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        int[] result = new int[2];
        int i = 0;
        int j = 1;
        int gap = 1;

        while(true){
            if(target == nums[i] + nums[j]){
                result[0] = i;
                result[1] = j;
                break;
            } else if(j == nums.length - 1){
                gap++;
                i = 0;
                j = gap;
            } else {
                i++;
                j++;
            }
        }
        return result;
    }
}
