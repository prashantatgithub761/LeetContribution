class Solution {
    public int findDuplicate(int[] nums) {
        int ans = -1;
        HashSet<Integer> a = new HashSet<>();
        for(int i :nums){
            if(a.contains(i)){
                ans=i;
            }
            else{
                a.add(i);
            }
        }
        return ans;
    }
}