import java.util.Scanner;

public class Metod6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett heltal");
        int num = scanner.nextInt();

        boolean isEven = checkEvenOdd(num);

        if (isEven) {
            System.out.println(num + " är ett jämnt tal.");
        } else {
            System.out.println(num + " är inte ett jämnt tal.");
        }
    }

    public static boolean checkEvenOdd(int num) {
        if (num % 2 == 0) {     // Går igenom jämna tal. Om man söker efter ojämna % 2 != 0.
            return true;        // om det är rätt så får vi true
        } else {
            return false;       // om det inte är rätt då får vi false.
        }
    }
}
