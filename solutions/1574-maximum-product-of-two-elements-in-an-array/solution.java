class Solution {
    public int maxProduct(int[] nums) {




        // find max element 
        // and products its element
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                
                secondmax = max;
                max = nums[i];
            }
            else if(nums[i]>secondmax){
                secondmax = nums[i];
            }
            
            

        }

        return (max-1)*(secondmax-1);





        
    }
}
