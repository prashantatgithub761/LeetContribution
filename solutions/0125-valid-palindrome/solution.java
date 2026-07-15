class Solution {
    public boolean isPalindrome(String s) {
        // first add all the characters in a single string
        StringBuilder string = new StringBuilder();

        // it will give us a string with no spaces

        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                string.append(Character.toLowerCase(c));
            }
            else{
                continue;
            }


        }
        
        // now use two pointers from both ends
        int left = 0;
        int right = string.length()-1;
        while(left<=right){
            if(string.charAt(left)!=string.charAt(right)){
                return false;

            }
            else{
                left++;
                right--;
            }
        }
        return true;

    }
}
