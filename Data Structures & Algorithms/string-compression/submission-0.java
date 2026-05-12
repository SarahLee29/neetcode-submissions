class Solution {
    public int compress(char[] chars) {       
        StringBuilder sb = new StringBuilder();    
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            count++;
            if (i + 1 == chars.length || chars[i] != chars[i+1]){			
                sb.append(chars[i]);
                if (count > 1) sb.append(count);	
                count = 0;			
            }		
        }
        
        char[] res = sb.toString().toCharArray();
        for (int i = 0; i < res.length; i++) {
            chars[i] = res[i];
        }
        return res.length;
    }
}