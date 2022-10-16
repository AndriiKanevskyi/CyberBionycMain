import java.util.Arrays;

public class Exercise9_7_Arrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Нормальний массив :\n"+ Arrays.toString(array));
        System.out.println("Розвернутий массив :");
        System.out.print("[");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+", ");
        }
        System.out.print("]");

    }
}
