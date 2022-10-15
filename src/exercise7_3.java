public class exercise7_3 {
    public static void main(String[] args) {
        int b = 0;
        for (int a = 2; a <= 6; a++) {
            b=power(a);
            System.out.println("третій ступінь числа "+a+" це число  "+b);
        }

    }

    public static int power(int a){
        return a*a*a;

    }
}
