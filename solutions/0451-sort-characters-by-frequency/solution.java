class Solution {
    public String frequencySort(String s) {
        //find freq
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
           if(map.containsKey(c)){
              map.put(c,map.getOrDefault(c,0)+1);
           }
           else{
            map.put(c,1);
           }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
         // Step 3: Sort by frequency in descending order
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: Build the answer
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            while (freq-- > 0) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
