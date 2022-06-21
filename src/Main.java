import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result = 1;
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {
            result = i * result;
        }

        System.out.println(result);
    }
}
