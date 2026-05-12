class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        int l = res.length();
        for (int i=0; i<strs.length; i++) {
            if (strs[i].length()< l) {
                l = strs[i].length();
                res = res.substring(0,l);
            }  
            while (l > 0) {
                if (!res.substring(0,l).equals(strs[i].substring(0,l))) {
                    l -= 1;
                }else {
                    break;
                }                       
            }
        }
        return res.substring(0,l);
    }
}