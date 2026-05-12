class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        String res;
        int commonL=0;
        for (int l = Math.min(l1,l2); l>0; l--) {
            if (l1 % l == 0 && l2 % l == 0) {
                commonL = l;
                res = str1.substring(0,commonL);
        int f1 = l1 / commonL;
        int f2 = l2 / commonL;
        if (res.repeat(f1).equals(str1) && res.repeat(f2).equals(str2)) {
            return res;
            }
        }
       
        } 
        return "";
        
      
    }
}