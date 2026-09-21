class Solution {
    public int reverseDegree(String s) {
        int i = 1;
        int sum=0;
        for(char c:s.toCharArray()){
            sum+=('Z' - Character.toUpperCase(c) + 1)*i;
            i++;

            

        }
        return sum;
    }
}
