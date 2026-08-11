class Solution {
    public String reverseWords(String s) {

        int i = 0;
        int j = 0;
        int n = s.length();
        char[] a = s.toCharArray();

        for(char c : s.toCharArray()){

            if(c==' '||j==n-1){
                if(j==n-1){
                    reverseWord(a,i,j);

                }
                    
                
                // Call the ReverseMethod
                else{
                    reverseWord(a,i,j-1);
                    

                }
                i = j+1;
                j++;
                
                


            }
            else{
                j++;
            }


        }
        return new String(a);
        
    }
    void reverseWord(char[] arr,int start, int end){
        int e = start;
        int f = end;
        
        while(e<f){
            char temp = arr[f];
            arr[f] = arr[e];
            arr[e] = temp;
            f--;
            e++;
        }
        
    }

}
