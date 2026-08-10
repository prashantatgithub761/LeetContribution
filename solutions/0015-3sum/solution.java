import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        List<List<Integer>> ans = new ArrayList<>();

        
        for(int i = 0;i<n;i++){
            if (i > 0 && nums[i] == nums[i - 1]){
             continue;
            }
            int target = -nums[i];

            // now find two digits who's summ is -ve of digit
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum == target){
                    ans.add(Arrays.asList(nums[i],nums[right],nums[left]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]){
                        left++;

                    }
                      

                    while (left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                      
                    
                }
                else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
            
        

        }
        return ans;
       
        
        
    }
}
