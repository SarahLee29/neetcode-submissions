"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        intervals.sort(key=lambda x: x.start)
        p1 = 0
        p2 = 1
        while p1 < len(intervals) - 1:
            if intervals[p1].end > intervals[p2].start:
                return False
            else:
                p1 += 1
                p2 += 1
        return True

