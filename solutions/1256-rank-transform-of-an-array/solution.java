class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // sort the arr and Assign its rank 
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        // replace each element with its rank
        int rank = 1;
        HashMap<Integer,Integer> Rank = new HashMap<>();
        for(int i=0;i<arr.length;i++){
          if(Rank.containsKey(sorted[i])){
            continue;

          }
          else{
            Rank.put(sorted[i],rank);
            rank++;
          }
        }
        int[] ans = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            ans[i]=Rank.get(arr[i]);
        }
        return ans;

        
    }
}
