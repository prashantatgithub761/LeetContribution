import java.util.HashMap;
class Solution {
    public int maximumLengthSubstring(String s) {
        // go in every window and count the freq
        // if all values are <3 then update its 
        // length with maxlength by comparing both

        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        

        int right = 0;
        while(right<s.length()){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2){
               char remove = s.charAt(left);
               map.put(remove,map.get(remove)-1);
               left++;
            
            }
            max = Math.max(max,right-left+1);
            right++;
              
        }

        return max;




        

    }
}
