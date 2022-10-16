import java.util.Arrays;

/*
������� ��� ������ 3�3, �������� ��, ������� ����� ����� �������.
 � ����� ����� ������ ��������� ��������� ������ ����, �������������� ������.
 */
public class Exercise9_6 {
    public static void main(String[] args) {

        int[][] array1 = generateRandomDeepArray();
        int[][] array2 = generateRandomDeepArray();
        int[][] resultOfSum = sumOfArrays(array1,array2);


        System.out.println("������ ����� :");
        System.out.println(Arrays.deepToString(array1));
        System.out.println("������ ����� :");
        System.out.println(Arrays.deepToString(array2));
        System.out.println("����� ����� � ������ ��������� ������ ���� :");
        System.out.println(Arrays.deepToString(resultOfSum));

    }
    // ��������� �������
    static int [][] generateRandomDeepArray(){
      int [][] result = new int[3][3];
        for (int i = 0; i< result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]=(int) (Math.random() * (100 - 1) + 1);// ������-�������� �����
            }
        }
        return result;
    }

    // ��������� ������ � ��������� ���������� � �����
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
