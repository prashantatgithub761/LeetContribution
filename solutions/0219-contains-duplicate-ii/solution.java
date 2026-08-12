import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     // Adds the element of that window into the hashtable and if that window's element contains duplicates value so return true;
     // else remove the prev. element and add new one and know check again..
     HashSet<Integer> set = new HashSet<>();
     for(int i = 0;i<nums.length;i++){
        if(set.contains(nums[i])){
            return true;

        }
        set.add(nums[i]);
        // Maintain Set Size

        if(set.size()>k){
            set.remove(nums[i-k]);
        }


     }
     return false;

    }
}
