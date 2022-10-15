public class exercise3_4 {
    public static void main(String[] args) {
        double r = 5;
        double h = 5;
        System.out.println(Volume.getSquare(r,h));
        System.out.println(Volume.getVolume(r,h));

    }

    public static class  Volume {

        public static double getSquare(double r,double h){
          double s = 2*Math.PI*r*(r+h);//ѕлоща поверхн≥ цил≥ндра вираховуЇтьс€ за формулою: S = 2?R2 + 2?R2 = 2?R(R+h).
            return s;
        }
        public static double getVolume(double r, double h){
            //ќб'Їм V цил≥ндра рад≥усом Ц R та висотою Ц h, вираховуЇтьс€ за формулою: V = ?R2h.
            double v = Math.PI*(r*r)*h;

            return v;
        }
    }
}
