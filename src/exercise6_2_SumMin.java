import java.util.Scanner;

public class exercise6_2_SumMin {
    public static void main(String[] args) {
        int a ;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("������ ����� �����: ");
        a= sc.nextInt();
        System.out.print("������ ����� �����: ");
        b=sc.nextInt();

        int result=0;
        for (int i = a+1; i < b; i++) {
            result+=i;
        }
        System.out.println("����� ��� ����� �� ��������� ������� : "+result);


    }
}
