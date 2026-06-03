class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        chars = [chr(i) for i in range(ord("A"), ord("Z") + 1)]        
        res = [0]        
        for c in range(0,26):
            l = 0
            r = 0
            current_k = k
  
            while r < len(s):              
                if s[r] != chars[c]:
                    current_k -= 1
                    
                while current_k < 0:                     
                    if s[l] != chars[c]:          
                        current_k += 1   
                        # break                 
                    l += 1  
                     
                r += 1
                res.append(r - l)  
        return max(res) 
           
                
                
                    


        