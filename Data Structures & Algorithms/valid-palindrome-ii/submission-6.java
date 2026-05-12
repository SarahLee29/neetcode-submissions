class Solution {
    public boolean validPalindrome(String s) {
    int left = 0, right = s.length() - 1;
        return isValid2(s,0,left, right);
}

private boolean isValid2(String s, int count, int left, int right) {

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (count != 0) {
                    return false;
                }
                count++;
                return isValid2(s, count,left+1, right) || isValid2(s, count, left, right-1);
            } else {
                left++;
                right--;
            }
        }
        return true;

    }

}