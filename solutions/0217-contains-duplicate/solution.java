class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> a= new HashSet<>();
        for(int x : nums){
            if(a.contains(x)){
                return true;
            }
            a.add(x);

        }
        return false;
    }
}
