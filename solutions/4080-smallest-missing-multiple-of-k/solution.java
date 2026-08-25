class Solution {
    public int missingMultiple(int[] nums, int k) {
        int min = 999;
        //first create the hashSet
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i = 1;i<200;i++){
            int num = i*k;
            if(!set.contains(num)){
                min = Math.min(min,num);

            }
        }
        return min;
    }
}
