package Stack.Implementation;

public class StackMain{
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack();

        stack.push(23);
        stack.push(56);
        stack.push(34);
        stack.push(2);
        stack.push(11);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
