class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int n = s.length();
        boolean wordStarted = false;
        for(int i = n-1;i>=0;i--){
            
           
            
            if(s.charAt(i)!=' '){
                wordStarted = true;
                
            }
            else if(s.charAt(i)==' ' && wordStarted==false) {
                continue;
            }

            if(s.charAt(i)!=' '){
                result++;
            }

            else if(s.charAt(i)==' ' && wordStarted == true){
                break;
               
            }
        }
        return result;
        
        
        
    }
}
