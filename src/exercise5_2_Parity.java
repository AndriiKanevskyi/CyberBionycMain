import java.util.Scanner;

public class exercise5_2_Parity {
    public static void main(String[] args) {
        byte in =0;
        Scanner sc = new Scanner(System.in);
        in=sc.nextByte();
        if (in%2==0){
            System.out.println("����� ����� -1");
        }else {
            System.out.println("����� �������-1");
        }
        if ((in&1)==0){
            System.out.println("����� �����- 2");
        }else {
            System.out.println("����� �������-2");
        }
    }
}
