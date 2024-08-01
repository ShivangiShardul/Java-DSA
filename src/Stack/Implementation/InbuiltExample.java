package Stack.Implementation;

import java.util.Stack;

class InbuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(56);
        stack.push(34);
        stack.push(2);
        stack.push(11);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
