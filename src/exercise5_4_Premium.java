import java.util.Scanner;

public class exercise5_4_Premium {
    public static void main(String[] args) {
     int salary;
     int experience;
     //salary+=salary*0.15;
        Scanner sc = new Scanner(System.in);
        System.out.println("¬вед≥ть розм≥з зар.плати");
        salary=sc.nextInt();
        System.out.println("¬вед≥ть стаж прац≥");
        experience= sc.nextInt();

        if(experience>=0&&experience<5){
            salary+=salary*0.10;
            System.out.println("¬аша зарплата з прем≥Їю виносить : "+salary);
        }
        if(experience>=5&&experience<10){
            salary+=salary*0.15;
            System.out.println("¬аша зарплата з прем≥Їю виносить : "+salary);
        }
        if(experience>=10&&experience<15){
            salary+=salary*0.25;
            System.out.println("¬аша зарплата з прем≥Їю виносить : "+salary);
        }
        if(experience>=15&&experience<20){
            salary+=salary*0.35;
            System.out.println("¬аша зарплата з прем≥Їю виносить : "+salary);
        }
        if(experience>=20&&experience<25){
            salary+=salary*0.45;
            System.out.println("¬аша зарплата з прем≥Їю виносить : "+salary);
        }
        if(experience>25){
            salary+=salary*0.5;
            System.out.println("¬аша зарплата з прем≥Їю виносить : "+salary);
        }



    }
}
