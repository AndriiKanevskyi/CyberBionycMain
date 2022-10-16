/*
�������������� IntelliJ IDEA, ������� ���� ReversedArray.
�������� ����� myReverse(int [] array), ���� ������ �� �������� ����� ������������ ��������
� ������� ������������ ����� (�������� ������ � ���������� �������).

�������� ����� int [] subArray (int [] array, int index, int count).
����� ������� ������� ���������� �� �������� ������, ��������� � �������, ��� ��������� � �������� index,
 ���������, �� ������� �������� ��������� count.

 ���� �������� count ������ �������� �����,
  �� ������� ��������, �� ������� �� ������� ��������� ������ (�� ����������� ������� index ��
  ������� ���������� ��������), �� �� ��� ���������� ������ ������ ��������� � count,
  �������� ��������� � ��������, �� �� ���� ��������� � ��������� ������.
 */

import java.util.Arrays;

public class Exercise9_3_ReversedArray {
    public static void main(String[] args) {
        int[] example = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("����� ������� :");
        System.out.println(Arrays.toString(example));
        System.out.println(Arrays.toString(myReverse(example)));
        System.out.println("");
        System.out.println("����� ��������� ������ ������� �� ����������� ������� index �� ������� ���������� �������� ");
        System.out.println(Arrays.toString(subArray(example,0,5)));
        System.out.println("����� ��������� ������ ������� �� ����������� ������� index �� ������� ������� �� ����� ������� �������");
        System.out.println(Arrays.toString(subArray(example,0,15)));


    }

    static int[] myReverse(int [] array){
        int [] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i]=array[array.length-1-i];// ������ ������ -1 �.�. ������������� � 0
        }
        return reverseArray;
    }


    static int [] subArray (int [] array, int index, int count){
        /*
        ���� �������� count ������ �������� �����,
  �� ������� ��������, �� ������� �� ������� ��������� ������ (�� ����������� ������� index ��
  ������� ���������� ��������), �� �� ��� ���������� ������ ������ ��������� � count,
  �������� ��������� � ��������, �� �� ���� ��������� � ��������� ������.
         */
        if (index+count> array.length){
            int [] result1 = new int[count];
            result1=Arrays.copyOfRange(array,index,index+count);


            for (int i = array.length; i < result1.length ; i++) {
                result1[i]= 1;
            }
            return result1;
        }
/*
���� ������� ������ � ������ �� index+count
 */

        int result2 [] = new int[count];
        result2=Arrays.copyOfRange(array,index,index+count);
        return result2;




    }
}
