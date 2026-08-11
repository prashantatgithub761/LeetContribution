class Solution {
    public int missingInteger(int[] nums) {
        // find prefix sum of subsequent
        // now traverse in arr to find if the sum exist the update it and then check that 
        //And return such minimun that doesnt exist in arr
        
        int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            
            
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];

                
            }
            else{
                break;
            }
            
        }

        // Make the HashSet of the array
        HashSet<Integer> set = new HashSet<>();


        for(int i = 0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}
