import java.util.Scanner;

public class exercise7_5_Calculator {
    public static void main(String[] args) {

        System.out.println("Введіть три числа");
        Scanner sc= new Scanner(System.in);

        int op1= sc.nextInt();
        int op2= sc.nextInt();
        int op3= sc.nextInt();

        calculate(op1,op2,op3);



    }

    public static void calculate (int x, int y, int u){
        int result= (x+y+u)/3;
        System.out.println("Середє арефмечичне введених чисел це "+result);
    }
}
