import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        if (input<0||input>100){
            System.out.println("������� ���� ����� �� ������ � ��������� ������� 0-100");

        }else if (input>=0&&input<=14){
            System.out.println("������� ���� �����  ������ � ��������� ������� [0 � 14]");
        } else if (input>=15&&input<=35) {
            System.out.println("������� ���� �����  ������ � ��������� ������� [15-35]");
            } else if (input>=36&&input<=50) {
            System.out.println("������� ���� �����  ������ � ��������� ������� [36-50]");
        } else if (input>=51&&input<=100) {
            System.out.println("������� ���� �����  ������ � ��������� ������� [51-100]");
        }

    }
}
