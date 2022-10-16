/*
Використовуючи IntelliJ IDEA, створіть клас UserArray.
Створити метод, який виконуватиме збільшення довжини масиву, переданого як аргумент, на 1 елемент.
 Елементи масиву мають зберегти своє значення та порядок індексів.


 Створити метод, який приймає два аргументи, перший аргумент типу int [] array,
 другий аргумент типу int value. У тілі методу реалізуйте можливість додавання другого аргументу методу
 в масив за індексом 0, водночас довжина нового масиву має збільшитися на 1 елемент,
 а елементи одержуваного масиву як перший аргумент мають скопіюватися в новий масив починаючи з індексу 1.
 */

import java.util.Arrays;

public class Exercise9_4_UserArray {
    public static void main(String[] args) {
        int [] example = {1,2,3,4,5};
        System.out.println("Початковий вид массиву :");
       System.out.println(Arrays.toString(example));
        System.out.println("Подовження довжини массиву на 1 ");
       System.out.println(Arrays.toString(lenghtPlusOne(example)));
        System.out.println("Подовження довжини массиву на 1, додаючи 1 елемент спереду і надання йому значення ");
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
