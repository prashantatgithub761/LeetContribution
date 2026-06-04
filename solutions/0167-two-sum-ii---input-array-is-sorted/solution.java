class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int c1 = 0;
        int c2 = numbers.length-1;
      
        while(c1<c2){
            int a = numbers[c1];
            int b = numbers[c2];
            int sum = a+b;
            if(sum==target){
                return new int[]{c1 + 1, c2 + 1};
            }
            else if(sum<target){
                c1++;

            }
            else{
                c2--;
            }
            
        }
        return new int[]{};
    }
}
