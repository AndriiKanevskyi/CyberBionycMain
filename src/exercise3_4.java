public class exercise3_4 {
    public static void main(String[] args) {
        double r = 5;
        double h = 5;
        System.out.println(Volume.getSquare(r,h));
        System.out.println(Volume.getVolume(r,h));

    }

    public static class  Volume {

        public static double getSquare(double r,double h){
          double s = 2*Math.PI*r*(r+h);//����� ������� ������� ������������ �� ��������: S = 2?R2 + 2?R2 = 2?R(R+h).
            return s;
        }
        public static double getVolume(double r, double h){
            //��'�� V ������� ������� � R �� ������� � h, ������������ �� ��������: V = ?R2h.
            double v = Math.PI*(r*r)*h;

            return v;
        }
    }
}
