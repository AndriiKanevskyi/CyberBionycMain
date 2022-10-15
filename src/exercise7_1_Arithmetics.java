import java.util.Scanner;

public class exercise7_1_Arithmetics {
    public static void main(String[] args) {

        int x ;
        char operation ;
        int y ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть перший операнд :");
        x= sc.nextInt();

        System.out.print("Введіть операцію :");
        operation=sc.next().charAt(0);

        System.out.print("Введіть другий операнд :");
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
                System.out.println("Такої операції не існує");
        }

    }

    public static void add (int x, int y) {
        System.out.println("Результать операціЇ :"+(x+y));
    }

    public static void sub  (int x, int y){
        System.out.println("Результать операціЇ :"+(x-y));
    }

    public static void mul  (int x, int y){
        System.out.println("Результать операціЇ :"+(x*y));
    }

    public static void div  (int x, int y){
     if (y==0){
         System.out.println("Помилка! Ділити на 0 не можна");
     }else {
         System.out.println("Результать операціЇ :"+(x/y));
     }
    }

}
