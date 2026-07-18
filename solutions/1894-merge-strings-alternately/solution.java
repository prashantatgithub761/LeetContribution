class Solution {
    public String mergeAlternately(String word1, String word2) {
        // make a string builder and two pointers
        StringBuilder ans = new StringBuilder();
        int index1 = word1.length()-1;
        int index2 = word2.length()-1;
        int p = 0;
        int q = 0;
        while(p<=index1 && q<=index2){
            char a = word1.charAt(p++);
            char b = word2.charAt(q++);
            ans.append(a);
            
            ans.append(b);
            
        }
        while(p<=index1){
            char a = word1.charAt(p++);
            
            ans.append(a);
        }
        while(q<=index2){
            char b = word2.charAt(q++);
            
            ans.append(b);
        }
        return ans.toString();



        
    }
}
