class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : operations) {
            if (operation.equals("C")) {
                stack.pop();
            } else if (operation.equals("D")) {
                stack.push(stack.peek()*2);
            } else if (operation.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a+b);
                
            } else{
                stack.push(Integer.parseInt(operation));
            }
        }
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}