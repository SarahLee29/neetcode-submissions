class MinStack:

    def __init__(self):
        self.lst = list()

    def push(self, val: int) -> None:
        self.lst.append(val)        

    def pop(self) -> None:
        del self.lst[-1]       

    def top(self) -> int:
        return self.lst[-1]        

    def getMin(self) -> int:
        sorted_lst = sorted(self.lst)
        return sorted_lst[0]
        
