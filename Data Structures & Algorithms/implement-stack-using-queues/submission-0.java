class MyStack {
    public Queue<Integer> q; 
    public Queue<Integer> q1;

    public MyStack() {
        q = new LinkedList<>();
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x); 
    }
    
    public int pop() {
        while (q.size() > 1) {
            q1.offer(q.poll());
        }
        int res = q.poll();
        Queue<Integer> temp = q;
        q = q1;
        q1 = temp; 
        return res;       
    }
    
    public int top() {
        while (q.size() > 1) {
            q1.offer(q.poll());
        }
        int res = q.poll();
        q1.offer(res);
        Queue<Integer> temp = q;
        q = q1;
        q1 = temp;
        return res;  
    }
    
    public boolean empty() {
        return q.size() == 0;        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */