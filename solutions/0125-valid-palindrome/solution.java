class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder clean = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                clean.append(Character.toLowerCase(ch));
            }
        }

        String str = clean.toString();

        String s1 = revString(str);
        return str.equals(s1);
    }

    // function to return reverse of a string
    public String revString(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(arr);
    }
}
