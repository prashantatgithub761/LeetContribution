class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int x:nums){
            if(a.containsKey(x)){
                a.put(x,a.get(x)+1);
            }
            else{
                a.put(x,1);

            }
        }
        // find largest freq
        
        int max = 0;
        for(int freq:a.values()){
            max = Math.max(max,freq);

        }
        int sum = 0;
        for(int i : a.values()){
            if(i==max){
                // add to end sum
                sum+=i;
            }
        }
        return sum;

    }
}
