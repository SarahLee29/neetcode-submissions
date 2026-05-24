class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        c0 = 0
        c1 = 0
        c2 = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                c0 += 1
            elif nums[i] == 1:
                c1 += 1
            else:
                c2 += 1
        nums[0:c0] = [0] * c0
        nums[c0: c0+c1] = [1] * c1
        nums[c0+c1: len(nums)] = [2] * c2


        


        