class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        lo = 0
        hi = len(matrix) * len(matrix[0]) - 1
        return self._binary_search(matrix, lo, hi, target)

    def _binary_search(self, m, lo, hi, t):
        if lo > hi:
            return False
        mid = lo + (hi - lo) // 2
        lines = len(m)
        columns = len(m[0])
        l = mid // columns
        c = mid % columns
        if t > m[l][c]:
            lo = mid + 1
            return self._binary_search(m, lo, hi, t)
        elif t < m[l][c]:
            hi = mid - 1
            return self._binary_search(m, lo, hi, t)
        else:
            return True
            


         