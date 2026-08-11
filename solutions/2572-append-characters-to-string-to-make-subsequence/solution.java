class Solution {
    public int appendCharacters(String s, String t) {
        int a = 0;
        int b = 0;
        int n1 = s.length();
        int n2 = t.length();
        int count = 0;
        int Max = 0;
        while(a<n1&&b<n2){
            if(s.charAt(a)==t.charAt(b)){
                count++;
                b++;
                
                

            }
            // else{
            //     count=0;
            // }
            Max=Math.max(Max,count);

            a++;
        }
        return n2-Max;

    }
    
}
