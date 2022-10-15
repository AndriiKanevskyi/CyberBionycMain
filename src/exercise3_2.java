public class exercise3_2 {
    public static void main(String[] args) {
        int x = 17;
        int y = 6;
        int z = 96;
        System.out.println(Arithmetic_Average.getArithmeticAverage(x,y,z));

    }

     public static   class Arithmetic_Average{
        public  static double getArithmeticAverage(int x,int y, int z){
            double result = (double) (x+y+z)/3;
            return result;
        }
    }
}
