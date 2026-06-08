class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        int same = 0;
        for(int x:nums){
            if(x<pivot){
                smaller.add(x);

            }
            else if(x>pivot){
                greater.add(x);
            }
            else if(x==pivot){
                same++;
            }
        }
        // traverse the elements from all of them now
        int c = 0;
        for(int a = 0;a<smaller.size();a++){
            nums[c++] = smaller.get(a);
        }
        // adding pivot values
        for(int b=same;b>0;b--){
            nums[c++]=pivot;
        }

        //add greater values
        for(int d = 0;d<greater.size();d++){
            nums[c++] = greater.get(d);
        }
        return nums;

        
    }
}
