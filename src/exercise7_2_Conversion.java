import java.util.Scanner;

public class exercise7_2_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ ������� ������ ��� �����: ");
        int count = sc.nextInt();
        System.out.println("����: ");
        double rate = sc.nextDouble();

        System.out.println(exchange(count,rate));

    }

    public static double exchange(int x, double y){
    return (double) x*y;
    }
}
