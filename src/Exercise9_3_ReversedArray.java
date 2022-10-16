/*
¬икористовуючи IntelliJ IDEA, створ≥ть клас ReversedArray.
—творити метод myReverse(int [] array), €кий приймаЇ €к аргумент масив ц≥лочислових елемент≥в
≥ повертаЇ ≥нвертований масив (елементи масиву у зворотному пор€дку).

—творити метод int [] subArray (int [] array, int index, int count).
ћетод повертаЇ частину отриманого €к аргумент масиву, починаючи з позиц≥њ, €ка зазначена в аргумент≥ index,
 розм≥рн≥стю, що в≥дпов≥даЇ значенню аргументу count.

 якщо аргумент count м≥стить значенн€ б≥льше,
  н≥ж к≥льк≥сть елемент≥в, що вход€ть до частини вих≥дного масиву (в≥д зазначеного ≥ндексу index до
  ≥ндексу останнього елемента), то п≥д час формуванн€ нового масиву розм≥рн≥стю в count,
  заповн≥ть одиниц€ми т≥ елементи, €к≥ не були скоп≥йован≥ з вих≥дного масиву.
 */

import java.util.Arrays;

public class Exercise9_3_ReversedArray {
    public static void main(String[] args) {
        int[] example = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("ѕрац€ реверсу :");
        System.out.println(Arrays.toString(example));
        System.out.println(Arrays.toString(myReverse(example)));
        System.out.println("");
        System.out.println("ѕрац€ створенн€ нового массиву в≥д зазначеного ≥ндексу index до ≥ндексу останнього елемента ");
        System.out.println(Arrays.toString(subArray(example,0,5)));
        System.out.println("ѕрац€ створенн€ нового массиву в≥д зазначеного ≥ндексу index до ≥ндексу б≥льшого н≥ж розм≥р першого массиву");
        System.out.println(Arrays.toString(subArray(example,0,15)));


    }

    static int[] myReverse(int [] array){
        int [] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i]=array[array.length-1-i];// длинна масива -1 т.к. начиначиетьс€ с 0
        }
        return reverseArray;
    }


    static int [] subArray (int [] array, int index, int count){
        /*
        якщо аргумент count м≥стить значенн€ б≥льше,
  н≥ж к≥льк≥сть елемент≥в, що вход€ть до частини вих≥дного масиву (в≥д зазначеного ≥ндексу index до
  ≥ндексу останнього елемента), то п≥д час формуванн€ нового масиву розм≥рн≥стю в count,
  заповн≥ть одиниц€ми т≥ елементи, €к≥ не були скоп≥йован≥ з вих≥дного масиву.
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
якщо довжена маживу Ї довшою н≥ж index+count
 */

        int result2 [] = new int[count];
        result2=Arrays.copyOfRange(array,index,index+count);
        return result2;




    }
}
