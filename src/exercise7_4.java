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

        System.out.println("������ ������ ����� "+x+" �� �����  "+b);
        System.out.println("����� ������ ����� "+x+" �� �����  "+c);
        System.out.println("��������� ������ ����� "+x+" �� �����  "+d);
    }

}
