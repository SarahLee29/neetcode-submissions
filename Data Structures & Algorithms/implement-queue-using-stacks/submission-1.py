class MyQueue:

    def __init__(self):
        self.stack1 = []  
        self.stack2 = []
        self.l1 = len(self.stack1) 
        self.l2 = len(self.stack2)     

    def push(self, x: int) -> None:
        self.stack1.append(x) 
    
    def pop(self) -> int:
        current = len(self.stack1)
        if current > 0:
            while current > 0:
                self.stack2.append(self.stack1.pop())
                current -= 1
            res = self.stack2.pop()
            current = len(self.stack2)
            if self.stack2:
                while current > 0:
                    self.stack1.append(self.stack2.pop())
                    current -= 1
            return res 
        else:
            return None
               

    def peek(self) -> int:
        current = len(self.stack1)
        if current > 0:
            while current > 0:
                self.stack2.append(self.stack1.pop())
                current -= 1
            res = self.stack2.pop()
    
            self.stack1.append(res)
            current = len(self.stack2)
            if self.stack2:
                while current > 0:
                    self.stack1.append(self.stack2.pop())
                    current -= 1
            return res 
        else:
            return None
        
        

    def empty(self) -> bool:
        if self.stack1:
            return False
        return True
        


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()