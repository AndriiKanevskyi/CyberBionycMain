public class Exercise8_2_Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        System.out.println(result);
        return result;
    }
}
