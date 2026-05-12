class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        int l1 = word1.length();
        int l2 = word2.length();

        while (p1 < l1 && p2 < l2) {
            result.append(word1.charAt(p1));
            p1++;
            result.append(word2.charAt(p2));
            p2++;
        }
        if (p1 >= l1) {
            result.append(word2.substring(p2));
        } else {
          result.append(word1.substring(p1));
        }
        return result.toString();        
    }
}