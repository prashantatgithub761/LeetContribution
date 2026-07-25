class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int x: nums1){
            set1.add(x);
        }
        for(int x: nums2){
            set2.add(x);

        }
        ArrayList<Integer> list = new ArrayList<>();
        int c = Math.min(nums1.length,nums2.length)-1;
        for(int i:set1){
            if(set2.contains(i)){
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
          ans[i] = list.get(i);
        }

        return ans;



        
    }
}
