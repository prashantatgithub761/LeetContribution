class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int max = 0;
    for(int x : nums){
        if(x==1){
            count++;
            
        }
        else{
            if (count > max) max = count;
            count = 0;
        }

    }
    return Math.max(max,count);
    }
}
