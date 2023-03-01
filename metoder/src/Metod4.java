public class Metod4 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        int sum = addNumbers(num1, num2);
        System.out.println("Summan av " + num1 + " och " + num2 + " är " + sum + ".");
    }

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
