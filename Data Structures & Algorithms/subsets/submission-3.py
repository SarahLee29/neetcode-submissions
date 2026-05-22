class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        path = []
        def backtrack (start):
          
            if start >= len(nums):
                res.append(path[:])
                return
          
            path.append(nums[start])
            backtrack(start+1)
            path.pop()
            backtrack(start+1)
        backtrack(0)
        return res


        