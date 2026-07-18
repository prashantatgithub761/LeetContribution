class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-1;
        int q = n-1;
        
        
        for(int i = m+n-1;i>=0;i--){
            if(q<0){
                break;
            }
            

            if(p>=0 && nums1[p]>=nums2[q]){
                nums1[i]=nums1[p--];
            }
            else{
                nums1[i]=nums2[q--];
            }
            
            
        }
    }
}
