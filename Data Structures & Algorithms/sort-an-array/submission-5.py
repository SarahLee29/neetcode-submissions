class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        self.quick_sort(nums, 0, len(nums) - 1)
        return nums

    def quick_sort(self, nums, lo, hi):
        if lo >= hi:
            return

        p = self.partition(nums, lo, hi)

        self.quick_sort(nums, lo, p)
        self.quick_sort(nums, p + 1, hi)

    def partition(self, nums, lo, hi):
        pivot = nums[(lo + hi) // 2]

        i = lo
        j = hi

        while True:

            while nums[i] < pivot:
                i += 1

            while nums[j] > pivot:
                j -= 1

            if i >= j:
                return j

            nums[i], nums[j] = nums[j], nums[i]

            i += 1
            j -= 1
            
                



        