import java.util.Scanner;

public class Exercise8_1_Bank {
    static int borg = 700;

    public static void main(String[] args) {


        while (borg>0){
            Scanner sc = new Scanner(System.in);
            int wnesok = sc.nextInt();
            check(wnesok);
        }




    }
    static void check(int wnesok){
      borg=borg-wnesok;

      if (borg>0){
          System.out.println("�������� �� �������� ���������� �������!");
          System.out.println("�� ������� ��������� ����� ���������� �������� :"+borg+"���.");
      }

      if (borg<0){
          System.out.println("�������� �� �������� ���������� �������!");
          System.out.println("��� ���� ������� ��������, ����� ��������� ������ :"+(borg*-1)+"���.");
      }

        if (borg == 0){
            System.out.println("�������� �� �������� ���������� �������!");
            System.out.println("��� ���� ������� ��������!");
        }



    }
}
