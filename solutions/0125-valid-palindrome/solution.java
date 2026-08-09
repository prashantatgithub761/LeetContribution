class Solution {
    public boolean isPalindrome(String s) {
        


        // traverse into the String 
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(Character.isLetterOrDigit(left) && Character.isLetterOrDigit(right)){
                if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                    return false;
                }
                i++;
                j--;

            }
            else if (!Character.isLetterOrDigit(left)){
                i++;
            }
            else if (!Character.isLetterOrDigit(right)){
                j--;
            }
        }
        return true;

    }
}
