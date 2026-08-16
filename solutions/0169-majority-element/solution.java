class Solution {
    public int majorityElement(int[] nums) {
        // we use HashMap to store count
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }

}
