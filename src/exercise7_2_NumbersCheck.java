import java.util.Scanner;

public class exercise7_2_NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (positive(num)==true){
            System.out.println("¬ведене число Ї позитивним");
        }else {System.out.println("¬ведене число Ї негативним");}


        if (liczbadililnykiw(num)>2){
            System.out.println("¬ведене число не Ї простим ");
        }else System.out.println("¬ведене число Ї простим ");

        if (dileniabezzalyshku(num)==true){
            System.out.println("¬ведене число д≥литьс€ без залишку на  2, 5, 3, 6, 9 ");
        }else System.out.println("¬ведене число не д≥литьс€ без залишку на  2, 5, 3, 6, 9 ");

    }
    public static boolean positive (int x){
        return x>0;
    }

    public static int liczbadililnykiw (int x){
        int result=0;
        for (int i = 1; i <= x; i++)
        {
            if(0 == (x % i)){
                result++;}
        }
        return result;
    }


    public static boolean dileniabezzalyshku (int x){
        int result = 0;
        int [] liczebnyky = new int[5];
        
        liczebnyky[0]=2;
        liczebnyky[1]=5;
        liczebnyky[2]=3;
        liczebnyky[3]=6;
        liczebnyky[4]=9;

        for (int i = 0; i < liczebnyky.length; i++) {
         if (x%liczebnyky[i]==0){
             result++;
         }
        }
        if (result>0){return true;}else {return false;}
    }




}

