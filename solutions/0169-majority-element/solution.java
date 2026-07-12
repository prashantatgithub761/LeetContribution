class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // create a hashmap to store count of every element 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            
            if(map.containsKey(num)){
                // increate the rank 
                map.put(num,map.get(num)+1);

            }
            else {
                // count of i is 1
                map.put(num,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if (entry.getValue() > n / 2) {
              return entry.getKey();
            }
        }
       
        // and then traverse through the hashmap if any element have count>mid/2
        // return that element
        return -1;




        
    }
}
