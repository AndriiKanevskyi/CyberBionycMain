public class exercise6_3_Printing_Shapes {
    public static void main(String[] args) {
        //�������������� IntelliJ IDEA, ������� ���� Printing_Shapes.
        // �������������� ����� �� �����:
        // System.out.print("*"), System.out.print(" "), System.out.print("\n") (��� �������� �� ����� �����).
        // ������� �� �����:
        //� �����������;
        //� ����������� ���������;
        //� ������������ ���������;
        //� ����.

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("");

        System.out.println("");//����������� ���������
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("");




        for(int i = 0; i<5; i++)
        {
            for(int j =0; j<5-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<(i*2+1); k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }



        //���� �� ������� �������






    }
}
