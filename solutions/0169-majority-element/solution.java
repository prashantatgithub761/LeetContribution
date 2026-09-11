class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // traverse in the key of map 
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue()>n/2){
        //         return entry.getKey();
        //     }



        // }

        for(int a:map.keySet()){
            if(map.get(a)>n/2){
                return a;
            }
        }
        return -1;
        // and if key's value>n/2
        // return the key
        
        
    }

}
