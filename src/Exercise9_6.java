import java.util.Arrays;

/*
Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній.
 У третій масив внесіть результат додавання перших двох, використовуючи методи.
 */
public class Exercise9_6 {
    public static void main(String[] args) {

        int[][] array1 = generateRandomDeepArray();
        int[][] array2 = generateRandomDeepArray();
        int[][] resultOfSum = sumOfArrays(array1,array2);


        System.out.println("Перший масив :");
        System.out.println(Arrays.deepToString(array1));
        System.out.println("Другий масив :");
        System.out.println(Arrays.deepToString(array2));
        System.out.println("Третій масив з суммой складання перших двух :");
        System.out.println(Arrays.deepToString(resultOfSum));

    }
    // Генератор массивів
    static int [][] generateRandomDeepArray(){
      int [][] result = new int[3][3];
        for (int i = 0; i< result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]=(int) (Math.random() * (100 - 1) + 1);// псевдо-випадкові числа
            }
        }
        return result;
    }

    // Ссумуваня масивів и вкладення результатів в новий
    static int [][] sumOfArrays(int[][] array1, int[][] array2){
        int [][] result = new int[3][3];
        for (int i = 0; i< result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]=array1[i][j]+array2[i][j];
            }
        }
        return result;

    }


}
