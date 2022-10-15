public class exercise7_4 {
    public static void main(String[] args) {


        for (int i = 2; i <7 ; i++) {
            int a = i;
            power234(a);
            System.out.println("");

        }



    }

    public static void power234 (int x){
        int b = x*x;
        int c = x*x*x;
        int d = x*x*x*x;

        System.out.println("другий ступінь числа "+x+" це число  "+b);
        System.out.println("третій ступінь числа "+x+" це число  "+c);
        System.out.println("четвертий ступінь числа "+x+" це число  "+d);
    }

}
