class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1!=n2){
            return false;
        }
        // now check freq of characters

        HashMap<Character,Integer> map1 = new HashMap<>();

        for(int i = 0;i<n1;i++){
            char c = s.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);


            }
            else{
                map1.put(c,1);
            }
        }
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i = 0;i<n1;i++){
            char c = t.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);


            }
            else{
                map2.put(c,1);
            }
        }
        for(char i : map1.keySet()){
            if(!map1.get(i).equals((map2.get(i)))){
                return false;
            }
        }
        return true;

    }
}
