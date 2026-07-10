class Solution {
    public boolean isValid(String s) {
        Stack<Character> St = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                St.push(ch);
            }
            else if(ch==')' && !St.isEmpty() && St.peek()=='('){
                St.pop();

            }
            else if(ch==']' && !St.isEmpty() && St.peek()=='['){
                St.pop();

            }
            else if(ch=='}' && !St.isEmpty() && St.peek()=='{'){
                St.pop();

            }
            else{
                return false;
            }
        }

        return St.isEmpty();
        
    }
}
