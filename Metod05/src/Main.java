public class Main {
    public static void main(String[] args) {
        Main myObject = new Main();
        myObject.checkEven(9);
    }

    public void checkEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}