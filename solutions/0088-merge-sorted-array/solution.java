class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m + n];

        int a = 0;
        int b = 0;
        int c = 0;

        // Compare elements while both arrays have elements
        while (a < m && b < n) {
            if (nums1[a] <= nums2[b]) {
                arr[c++] = nums1[a++];
            } else {
                arr[c++] = nums2[b++];
            }
        }

        // Copy remaining elements of nums1
        while (a < m) {
            arr[c++] = nums1[a++];
        }

        // Copy remaining elements of nums2
        while (b < n) {
            arr[c++] = nums2[b++];
        }

        // Copy merged array back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}
