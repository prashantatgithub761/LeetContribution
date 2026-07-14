class Solution {
    public int maxArea(int[] height) {
        int maxlevel = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){

            int wl = Math.min(height[left],height[right]);
            int area = (right-left)*wl;
            maxlevel=Math.max(area,maxlevel);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxlevel;
        
    }
}
