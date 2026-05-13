class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        index1 = -1
        index2 = -1
        for i in range(len(numbers)):
            index1 = i   
            complement = target - numbers[i]
            index2 = self._binary_search(complement, numbers, i + 1, len(numbers)-1)
            if index2 > 0:
                return [index1 + 1, index2 + 1]
          
        

    def _binary_search(self, c, nums, l, r):
        if l > r:
            return -1
        res = -1
        mid = l + (r - l)//2
        if c < nums[mid]:
            r = mid - 1
            res = self._binary_search(c, nums, l, r)
            return res
        elif c > nums[mid]:
            l = mid + 1
            res = self._binary_search(c, nums, l, r)
            return res
        else:
            return mid





        