import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String blue = "\u001B[34m";
        String reset = "\u001B[0m";


        double operand1  = 2;
        double operand2 = 0;
        double result;
        String sign;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n����� ���� �� ������ ��������� ���������� �������� �  ������ "+operand1 +" � "+operand2);
        System.out.println(blue+"���������, ������ �������� ��� ������ �������� : "+reset);
        sign= sc.nextLine();

        switch (sign){
            case ("+"): {
                result = operand1 + operand2;
                System.out.println("��������� ��������� "+operand1 + " � "+operand2 +" � "+green+result);
                break;
            }
            case ("-"):{
                result =operand1-operand2;
                System.out.println("��������� �������� "+operand1 + " � "+operand2 +" � "+green+result);
                break;
            }
            case ("*"):{
                result=operand1*operand2;
                System.out.println("��������� �������� "+operand1 + " � "+operand2 +" � "+green+result);
                break;
            }
            case ("/"):{
                if (operand2 == 0) {
                    System.out.println(red+"�������! ĳ���� �� 0 �� �����!");
                    break;
                }else {
                    result=operand1/operand2;
                    System.out.println("��������� ������ "+operand1 + " � "+operand2 +" � "+green+result);
                    break;}


            }
        }


    }
}
