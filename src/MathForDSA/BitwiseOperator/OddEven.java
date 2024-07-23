package MathForDSA.BitwiseOperator;

class OddEven {
    public static void main(String[] args) {
        int n = 68;
        boolean result = oddEven(n);

        if (!result){
            System.out.println(n + " is a even number");
        } else{
            System.out.println(n + " is a odd number");
        }
    }

    static boolean oddEven(int n) {
        return (n & 1) == 1;
    }
}
