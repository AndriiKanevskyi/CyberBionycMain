import java.util.Scanner;

public class exercise6_7_Fibonacci {
    public static void main(String[] args) {
        int start ;
        int finish ;

        System.out.print("¬в≥деть точку старту :");
        Scanner sc = new Scanner(System.in);
        start= sc.nextInt();

        System.out.print("¬в≥деть точку ф≥н≥шу :");
        finish=sc.nextInt();

        int iterNum=finish-start;
        int n0 = start;
        int n1 = start;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= iterNum; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        }

    }


