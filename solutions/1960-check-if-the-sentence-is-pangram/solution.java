class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        boolean[] seen = new boolean[26];
        
        for(char c: sentence.toCharArray()){
            int i = c - 'a';
            seen[i] = true;
        }

        for(boolean present: seen){
            if(!present){
                return false;
            }
        }
        return true;

        
    }
}
