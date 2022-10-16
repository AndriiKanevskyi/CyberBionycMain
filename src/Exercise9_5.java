import java.util.Arrays;

/*
Створіть два масиви 3х3, заповніть їх,
створіть третій масив порожній.
У третій масив внесіть результат додавання перших двох.
 */
public class Exercise9_5 {
    public static void main(String[] args) {

        int [][] array1 =  new int[3][3];
        int [][] array2 = new int[3][3];
        int [][] result = new int[3][3];

        for (int i = 0; i< array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j]=(int) (Math.random() * (100 - 1) + 1);// псевдо-випадкові числа

            }
        }

        for (int i = 0; i< array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j]=(int) (Math.random() * (100 - 1) + 1);// псевдо-випадкові числа

            }
        }

        for (int i = 0; i< result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]=array1[i][j]+array2[i][j];

            }
        }

        System.out.println("Перший масив :");
        System.out.println(Arrays.deepToString(array1));
        System.out.println("Другий масив :");
        System.out.println(Arrays.deepToString(array2));
        System.out.println("Третій масив з суммой складання перших двух :");
        System.out.println(Arrays.deepToString(result));


    }
}
