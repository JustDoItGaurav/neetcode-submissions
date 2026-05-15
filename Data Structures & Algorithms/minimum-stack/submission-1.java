class MinStack {
    Stack<Integer> stack;
    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int val) {

        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp=new Stack<>();
        int min=Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            int x=stack.pop();
            min=Math.min(min,x);
            temp.push(x);
        }
        while(!temp.isEmpty()){
            int x=temp.pop();
            stack.push(x);
        }
        return min;
    }
}
