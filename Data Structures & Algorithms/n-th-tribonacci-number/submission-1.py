class Solution:
    def tribonacci(self, n: int) -> int:
        seq = [0, 1 ,1]
        def rec(n):
            if n < len(seq):
                return seq[n]
            
            val = rec(n-1) + rec(n-2) + rec(n-3)
            seq.append(val)          
            return val
        return rec(n)
    


        
        
        