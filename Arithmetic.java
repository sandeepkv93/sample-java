public class Arithmetic {
    static int addTwoNumbers(int x, int y) {
        return x + y;
    }

    static int subtractTwoNumbers(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 10;
        int b = 20;
        System.out.println("Sum of " + a + " and " + b + " is: " + addTwoNumbers(a, b));
        System.out.println("Diff of " + a + " and " + b + " is: " + subtractTwoNumbers(a, b));
    }
}