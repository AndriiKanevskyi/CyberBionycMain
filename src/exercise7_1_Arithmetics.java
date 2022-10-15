import java.util.Scanner;

public class exercise7_1_Arithmetics {
    public static void main(String[] args) {

        int x ;
        char operation ;
        int y ;
        Scanner sc = new Scanner(System.in);

        System.out.print("������ ������ ������� :");
        x= sc.nextInt();

        System.out.print("������ �������� :");
        operation=sc.next().charAt(0);

        System.out.print("������ ������ ������� :");
        y= sc.nextInt();


        switch (operation)
        {
            case '+':
                add(x,y);
                break;
            case '-':
                sub(x,y);
                break;
            case '*':
                mul(x,y);
                break;
            case '/':
                div(x,y);
                break;
            default:
                System.out.println("���� �������� �� ����");
        }

    }

    public static void add (int x, int y) {
        System.out.println("���������� �������� :"+(x+y));
    }

    public static void sub  (int x, int y){
        System.out.println("���������� �������� :"+(x-y));
    }

    public static void mul  (int x, int y){
        System.out.println("���������� �������� :"+(x*y));
    }

    public static void div  (int x, int y){
     if (y==0){
         System.out.println("�������! ĳ���� �� 0 �� �����");
     }else {
         System.out.println("���������� �������� :"+(x/y));
     }
    }

}
