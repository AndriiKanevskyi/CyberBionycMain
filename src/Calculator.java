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

        System.out.println("\nЦього разу ми будемо проводити арефметичні операціі з  цифрми "+operand1 +" і "+operand2);
        System.out.println(blue+"Будьласка, введіть операцію яку бажаєте виконати : "+reset);
        sign= sc.nextLine();

        switch (sign){
            case ("+"): {
                result = operand1 + operand2;
                System.out.println("Результат складання "+operand1 + " і "+operand2 +" є "+green+result);
                break;
            }
            case ("-"):{
                result =operand1-operand2;
                System.out.println("Результат відіймання "+operand1 + " і "+operand2 +" є "+green+result);
                break;
            }
            case ("*"):{
                result=operand1*operand2;
                System.out.println("Результат множення "+operand1 + " і "+operand2 +" є "+green+result);
                break;
            }
            case ("/"):{
                if (operand2 == 0) {
                    System.out.println(red+"Помилка! Ділити на 0 не можна!");
                    break;
                }else {
                    result=operand1/operand2;
                    System.out.println("Результат ділення "+operand1 + " і "+operand2 +" є "+green+result);
                    break;}


            }
        }


    }
}
