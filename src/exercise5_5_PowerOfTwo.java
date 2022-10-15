import java.util.Scanner;

public class exercise5_5_PowerOfTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = in.nextInt();

        if((n > 0) && ((n & (n - 1)) == 0))
            System.out.println("Введено число є стопенем двійки");
        else
            System.out.println("Введено число не є стопенем двійки");


    }
}
