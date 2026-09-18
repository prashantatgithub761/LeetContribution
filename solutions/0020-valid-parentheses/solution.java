class Solution {
    public boolean isValid(String s) {
        // Stack<Character> St = new Stack<>();
        // for(char ch: s.toCharArray()){
        //     if(ch=='('||ch=='{'||ch=='['){
        //         St.push(ch);
        //     }
        //     else if(ch==')' && !St.isEmpty() && St.peek()=='('){
        //         St.pop();

        //     }
        //     else if(ch==']' && !St.isEmpty() && St.peek()=='['){
        //         St.pop();

        //     }
        //     else if(ch=='}' && !St.isEmpty() && St.peek()=='{'){
        //         St.pop();

        //     }
        //     else{
        //         return false;
        //     }
        // }

        // return St.isEmpty();

/*
        // Make a Stack 
        // Push if u get oppening 
        pop is closing and in last if the stack is open return true 
        else false

        
        
        */

        Stack<Character> St = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '(' || c=='{' || c=='['){
                St.push(c);
            }
            else if(c==')' && !St.isEmpty() && St.peek()=='('){
                St.pop();

            }
            else if(c==']' && !St.isEmpty() && St.peek()=='['){
                St.pop();

            }
            else if(c=='}' && !St.isEmpty() && St.peek()=='{'){
                St.pop();

            }
            else{
                return false;
            }

            
        }
        return St.isEmpty();
    }
}

