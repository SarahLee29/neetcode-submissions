class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        map = {}
        res = []
        for i in range(len(points)):
            map.update({tuple(points[i]): math.sqrt((points[i][0])**2 + (points[i][1])**2)})
        sorted_list = sorted(map.items(), key = lambda item: item[1])
        for i in range(k):
            res.append(list(sorted_list[i][0]))
        return res

        