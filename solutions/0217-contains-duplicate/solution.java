class Solution {
    public boolean containsDuplicate(int[] nums) {

        // for(int i = 0;i<nums.length-1;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // HashSet<Integer> a = new HashSet<>();
        // for(int i : nums){
        //     if(a.contains(i)){
        //         return true;
        //     }
        //     a.add(i);
        // }
        // return false;


        // Arrays.sort(nums);
        // for(int i = 0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

       
        // Initialize with nums.length to avoid background resizing
        HashSet<Integer> seen = new HashSet<>(nums.length);
        
        for (int num : nums) {
            // If the set already has the number, it's a duplicate
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    





        // HashSet<Integer> a= new HashSet<>();
        // for(int x : nums){
        //     if(a.contains(x)){
        //         return true;
        //     }
        //     a.add(x);

        // }
        // return false;
    }
}
