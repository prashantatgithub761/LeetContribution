class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        // get the nums in hashset to get the unique elements
        // HashSet<> set = new HashSet<>();
        // for(int i = 0;i<nums.length;i++){
        //     if(!set.contains(i)){
        //         set.add(i);
        //     }
        // }
        // now calculate the sum of array;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum = 0;
        long ans = 0;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size() == k){
            ans = Math.max(ans, sum);
        }
        
        int p = 0;
        for(int q = k;q<nums.length;q++){
            sum+=nums[q]-nums[p];
            
            map.put(nums[p], map.get(nums[p]) - 1);
            if (map.get(nums[p]) == 0) {
              map.remove(nums[p]);
            }
            

            map.put(nums[q],map.getOrDefault(nums[q],0)+1);
            p++;
            
            if(map.size() == k){
               ans = Math.max(ans, sum);
            }

        }
        return ans;
        


        
    }
}
