class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()){
                char x=stack.peek();
                if(x=='(' && ch==')' || x=='[' && ch==']' || x=='{' && ch=='}'){
                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }

        
        return stack.isEmpty();
    }
}
