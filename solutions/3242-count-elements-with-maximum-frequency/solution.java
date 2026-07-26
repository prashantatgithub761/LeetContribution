class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        // now we have map of values with their freq
        int max = -1;
        for(int s: map.values()){
            if(s>max){
                max = Math.max(max,s);
            }
        }
        int sum = 0;
        for(int t : map.values()){
            if(t==max){
                sum+=t;
            }
        }
        return sum;



    }
}
