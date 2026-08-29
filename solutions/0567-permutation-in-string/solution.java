class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
          return false;
        }

        // create a hashmap of s1

        HashMap<Character, Integer> maps1 = new HashMap<>();
        for(char c:s1.toCharArray()){
            maps1.put(c,maps1.getOrDefault(c,0)+1);
        }

        // now create another maps2 of s1 length
        HashMap<Character, Integer> maps2 = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            maps2.put(s2.charAt(i),maps2.getOrDefault(s2.charAt(i),0)+1);
        }

        if(maps1.equals(maps2)){
            return true;

        }
        // now traverse the another windows 

        int i = 0;
        int k = s1.length();
        for(int j = k;j<s2.length();j++){
            // now put the freq. of j and remove of i 
            maps2.put(s2.charAt(j),maps2.getOrDefault(s2.charAt(j),0)+1);
            maps2.put(s2.charAt(i),maps2.get(s2.charAt(i))-1);
            if (maps2.get(s2.charAt(i)) == 0) {
               maps2.remove(s2.charAt(i));
            }
            i++;
            if(maps2.equals(maps1)){
                return true;
            }
        }
        return false;








        
        
        
        
    }
}
