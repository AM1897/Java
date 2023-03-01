import java.util.Scanner;

public class Metod5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv ett heltal: ");
        int sum = scanner.nextInt();

        checkEvenOdd(sum);
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " är ett jämnt tal.");
        } else {
            System.out.println(num + " är inte ett jämnt tal.");
        }
    }
}
