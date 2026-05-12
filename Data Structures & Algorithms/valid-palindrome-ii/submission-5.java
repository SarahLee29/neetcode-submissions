class Solution {
    public boolean validPalindrome(String s) {
    return isValid(s, 0, s.length() - 1, false);
}

private boolean isValid(String s, int left, int right, boolean skipped) {
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            // If already skipped a character, return false
            if (skipped) {
                return false;
            }
            // Try skipping either the left or the right character
            return isValid(s, left + 1, right, true) || isValid(s, left, right - 1, true);
        }
        left++;
        right--;
    }
    return true;
}

}