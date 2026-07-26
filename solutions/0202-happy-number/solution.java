class Solution {


    public int sumofDigit (int n){

       

       int sum = 0;
       int digit = 0;
       while(n>0){
          digit = n%10;
          
          n=n/10;
          sum = sum+(digit*digit);
        }
        return sum;
    


    }


    public boolean isHappy(int n) {
        
        // calulate the sum 
        


        // while(n!=1){
        //     // made a set check if its already their if their return false else sum of its digit and update sum again by calculating
        //     HashSet set = new HashSet<>();
        //     if(set.contains(n)){
        //         return false;
        //     }
            
        //     set.add(n);
        //     n = sumofDigit(n);
            


        // }
        // return true;


        // floyd cycle detection 

        int slow = n;
        int fast = n;


        while(true){
           

            slow = sumofDigit(slow);
            fast = sumofDigit(sumofDigit(fast));

            if(fast == 1){
                return true;
            }
            else if (slow==fast){
                return false;
            }





        }
        
    }
}
