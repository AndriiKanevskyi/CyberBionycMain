import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise9_2_CustomerArray {

    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть скількі цифр повинно бути в масиві від 1 до 100");
        size= sc.nextInt();


        int [] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i]=(int) (Math.random() * (100 - 1) + 1);
        }

        System.out.println("Всього в масиві є такі числа :"+Arrays.toString(list));

        Arrays.sort(list);

        System.out.println("Найбільше значення з поданих це :"+list[list.length-1]);
        System.out.println("Найменьше значення з поданих це :"+list[0]);

        int sum=0;

        for (int i = 0; i < list.length; i++) {
        sum+=list[i];
        }
        System.out.println("Сумма всіх цифр то  :"+sum);

        double mid = (double) sum/ (double) list.length;
        System.out.println("Середьне арефмитичне значення з поданих це :"+mid);



        System.out.println("Всі непарні цифри в массиві це :");
        for (int i = 0; i < list.length; i++) {
            if (list[i]%2!=0){
                System.out.print(list[i]+" ");
            }
        }

    }



}
