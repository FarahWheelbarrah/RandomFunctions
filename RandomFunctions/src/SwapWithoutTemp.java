public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Swapping...");
        a = a + b; // a is now 10
        b = a - b; // b is now 3
        a = a - b; // a is now 7
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}