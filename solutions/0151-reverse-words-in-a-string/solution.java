class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        // 1. Reverse the entire string
        reverse(arr, 0, n - 1);
        
        // 2. Clean up spaces and reverse individual words back to normal
        return cleanSpacesAndReverseWords(arr, n);
    }
    
    // Helper function to reverse a portion of the array
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
    
    private String cleanSpacesAndReverseWords(char[] arr, int n) {
        int i = 0, j = 0;
        
        while (j < n) {
            // Skip leading and multiple spaces
            while (j < n && arr[j] == ' ') j++; 
            if (j == n) break;
            
            // Add a single space before the next word (if it's not the first word)
            if (i > 0) arr[i++] = ' ';
            
            int start = i;
            
            // Copy the word characters
            while (j < n && arr[j] != ' ') {
                arr[i++] = arr[j++];
            }
            
            // Reverse the individual word to fix its order
            reverse(arr, start, i - 1);
        }
        
        // Return the valid portion of the array as a String
        return new String(arr, 0, i);
    }
}
