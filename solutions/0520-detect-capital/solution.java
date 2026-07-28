class Solution {
    public boolean detectCapitalUse(String word) {
        // first count capital in digits
        // if capital == word.lenght()
        // if capital == 0 
        // if capital == 1 and first char is upper 
        // in all the above conditions return true otherwise false

        int capital = 0;

        for(int i = 0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){

             capital++;
            }
        }
        if(capital==word.length()){
            return true;

        }
        else if(capital == 0){
            return true;
        }
        else if(capital==1&&Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;

    }
}
