import java.util.Arrays;

public class Exercise8_4 {
    public static void main(String[] args) {
        int op1 =3;
        int op2 =4;
        int op3 =5;
        int op4 =6;
        int op5 =7;
calculate(op1,op2,op3);

    }

    static void calculate(int op1,int op2, int op3){
    int [] list = new int[3];
    list[0]=op1;
    list[1]=op2;
    list[2]=op3;

    Arrays.sort(list);
    System.out.println("Найбільше значення з поданих це :"+list[list.length-1]);
    System.out.println("Найменьше значення з поданих це :"+list[0]);

    double midl=(double) ((op1+op2+op3)/3);

    System.out.println("Середьне арефмитичне значення з поданих це :"+midl);


    }


    static void calculate(int op1,int op2, int op3,int op4){
        int [] list = new int[3];
        list[0]=op1;
        list[1]=op2;
        list[2]=op3;
        list[3]=op4;

        Arrays.sort(list);
        System.out.println("Найбільше значення з поданих це :"+list[list.length-1]);
        System.out.println("Найменьше значення з поданих це :"+list[0]);

        double midl=(double) ((op1+op2+op3+op4)/4);

        System.out.println("Середьне арефмитичне значення з поданих це :"+midl);


    }
    static void calculate(int op1,int op2, int op3,int op4,int op5){
        int [] list = new int[3];
        list[0]=op1;
        list[1]=op2;
        list[2]=op3;
        list[3]=op4;
        list[4]=op5;

        Arrays.sort(list);
        System.out.println("Найбільше значення з поданих це :"+list[list.length-1]);
        System.out.println("Найменьше значення з поданих це :"+list[0]);

        double midl=(double) ((op1+op2+op3+op4+op5)/5);

        System.out.println("Середьне арефмитичне значення з поданих це :"+midl);


    }

}
