import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise9_2_CustomerArray {

    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("������ ����� ���� ������� ���� � ����� �� 1 �� 100");
        size= sc.nextInt();


        int [] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i]=(int) (Math.random() * (100 - 1) + 1);
        }

        System.out.println("������ � ����� � ��� ����� :"+Arrays.toString(list));

        Arrays.sort(list);

        System.out.println("�������� �������� � ������� �� :"+list[list.length-1]);
        System.out.println("��������� �������� � ������� �� :"+list[0]);

        int sum=0;

        for (int i = 0; i < list.length; i++) {
        sum+=list[i];
        }
        System.out.println("����� ��� ���� ��  :"+sum);

        double mid = (double) sum/ (double) list.length;
        System.out.println("�������� ����������� �������� � ������� �� :"+mid);



        System.out.println("�� ������ ����� � ������ �� :");
        for (int i = 0; i < list.length; i++) {
            if (list[i]%2!=0){
                System.out.print(list[i]+" ");
            }
        }

    }



}
