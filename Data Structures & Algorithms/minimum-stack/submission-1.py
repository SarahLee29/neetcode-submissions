class MinStack:

    def __init__(self):
        self.lst = list()
        self.help_stack = list() # record current min in main stack

    def push(self, val: int) -> None:
        self.lst.append(val)  
        if self.help_stack:
            if val <= self.help_stack[-1]:
                self.help_stack.append(val)
            else:
                self.help_stack.append(self.help_stack[-1]) 
        else:
            self.help_stack.append(val) 

    def pop(self) -> None:
        del self.lst[-1]  
        del self.help_stack[-1]     

    def top(self) -> int:
        return self.lst[-1]        

    def getMin(self) -> int:
        return self.help_stack[-1]
        
