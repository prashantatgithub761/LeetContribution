class Solution {
    public String makeGood(String s) {
        StringBuilder result = new StringBuilder();
        for(char c:s.toCharArray()){
            if(result.length()>0){
                int last = result.charAt(result.length()-1);
                if(last+32==c||last-32==c){
                    result.deleteCharAt(result.length()-1);
                    continue;
                }

            }
            result.append(c);
        }
        return result.toString();
        
    }
}
