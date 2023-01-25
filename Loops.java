import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // For Loop
        // for (int i = 0; i < 11; i++) {
        // System.out.print(i);
        // // System.out.print(": Hello");
        // }

        int i = 0;
        // While Loop
        // while (i < 11) {
        // System.out.println(i);
        // i = i + 1;
        // }

        // Do While Loop
        // do {
        // System.out.println(i);
        // i = i + 1;
        // } while (i < 11);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        // int sum = 0;

        // for (int b = 1; b <= number; b++) {
        // System.out.print(b);
        // System.out.print("+");
        // sum = sum + b;
        // }
        // System.out.print("=");
        // System.out.print(sum);

        for (int j = 1; j < 11; j++) {
            System.out.print(number);
            System.out.print("*");
            System.out.print(j);
            System.out.print("=");
            System.out.println(number * j);
        }

    }
}