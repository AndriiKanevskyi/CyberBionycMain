import java.util.Scanner;

public class exercise5_5_PowerOfTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("������ �����: ");
        int n = in.nextInt();

        if((n > 0) && ((n & (n - 1)) == 0))
            System.out.println("������� ����� � �������� �����");
        else
            System.out.println("������� ����� �� � �������� �����");


    }
}
