class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        p1 = 0
        p2 = 1
        l = len(nums)
        while l >= 2:
            while p2 < l:
                if nums[p1] > nums[p2]:
                    nums[p1], nums[p2] = nums[p2], nums[p1]
                p1+= 1
                p2+= 1
            l -= 1
            p1 = 0
            p2 = 1


        