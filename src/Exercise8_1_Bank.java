import java.util.Scanner;

public class Exercise8_1_Bank {
    static int borg = 700;

    public static void main(String[] args) {


        while (borg>0){
            Scanner sc = new Scanner(System.in);
            int wnesok = sc.nextInt();
            check(wnesok);
        }




    }
    static void check(int wnesok){
      borg=borg-wnesok;

      if (borg>0){
          System.out.println("ƒ€куюЇмо за внесенн€ щом≥с€чного платежа!");
          System.out.println("ƒо повного погашенн€ боргу залишилось сплатити :"+borg+"грн.");
      }

      if (borg<0){
          System.out.println("ƒ€куюЇмо за внесенн€ щом≥с€чного платежа!");
          System.out.println("¬аш борг повн≥стю погашено, сумма переплати складаЇ :"+(borg*-1)+"грн.");
      }

        if (borg == 0){
            System.out.println("ƒ€куюЇмо за внесенн€ щом≥с€чного платежа!");
            System.out.println("¬аш борг повн≥стю погашено!");
        }



    }
}
