class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        point1 = 0
        res = 0
        string_length = len(s)
        string_map = {} # initialize a map
    
        for point2 in range(string_length):
            if s[point2] in string_map and string_map[s[point2]] >= point1:                          
                point1 = string_map.get(s[point2]) + 1
            string_map.update({s[point2]: point2})
            res = max(res, point2 - point1 + 1)
          
        return res


            



        