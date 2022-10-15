public class exercise5_3_LogicOperations {
    public static void main(String[] args) {
       // int x = 5, y = 10, ³ z = 15
       int x =5;
       int y =10;
       int z = 15;

       x += y >> x++ * z;
        System.out.println(x);
       z = ++x & y * 5;
        System.out.println(z);
       y /= x + 5 | z;
        System.out.println(y);
       z = x++ & y * 5;
        System.out.println(z);
       x = y << x++ ^ z;
        System.out.println(x);

    }
}
