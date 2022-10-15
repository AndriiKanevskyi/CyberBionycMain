public class exercise3_3 {
    public static void main(String[] args) {
        double pi = Math.PI;
        double r = 2.45;
        System.out.println(Circle.getSquareCircle(r));;
    }
    public static class  Circle {

        public static double getSquareCircle(double r){
            double rsquare=r*r;
        return (Math.PI*rsquare);
        }
    }
}
