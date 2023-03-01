import java.util.Scanner;

public class Metod7 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        boolean areEqual = checkEqualNumbers(num1, num2);

        if (areEqual) {
            System.out.println(num1 + " och " + num2 + " är lika.");
        } else {
            System.out.println(num1 + " och " + num2 + " är inte lika.");
        }
    }

    public static boolean checkEqualNumbers(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
