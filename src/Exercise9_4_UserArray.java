/*
�������������� IntelliJ IDEA, ������� ���� UserArray.
�������� �����, ���� ������������ ��������� ������� ������, ���������� �� ��������, �� 1 �������.
 �������� ������ ����� �������� ��� �������� �� ������� �������.


 �������� �����, ���� ������ ��� ���������, ������ �������� ���� int [] array,
 ������ �������� ���� int value. � �� ������ ��������� ��������� ��������� ������� ��������� ������
 � ����� �� �������� 0, �������� ������� ������ ������ �� ���������� �� 1 �������,
 � �������� ������������ ������ �� ������ �������� ����� ����������� � ����� ����� ��������� � ������� 1.
 */

import java.util.Arrays;

public class Exercise9_4_UserArray {
    public static void main(String[] args) {
        int [] example = {1,2,3,4,5};
        System.out.println("���������� ��� ������� :");
       System.out.println(Arrays.toString(example));
        System.out.println("���������� ������� ������� �� 1 ");
       System.out.println(Arrays.toString(lenghtPlusOne(example)));
        System.out.println("���������� ������� ������� �� 1, ������� 1 ������� ������� � ������� ���� �������� ");
        System.out.println(Arrays.toString(lenghtPlusOne(example,100)));
    }

 static int [] lenghtPlusOne(int[] input) {
        int [] result= Arrays.copyOf(input,input.length+1);
        return result;
 }

    static int [] lenghtPlusOne(int[] input,int value){
        int [] result = new int[input.length+1];
        result[0]=value;
        for (int i = 1; i < result.length; i++) {
            result[i]=input[i-1];
        }
      return result;
    }


}
