public class exercise6_4 {
    public static void main(String[] args) {
    //���� ���� ����� N (> 0). �������������� ���� ����
    // ������� ���� 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)
    int n = 10;

        for (int i = 1; i <= n; i++) {
         int result = 1;
         result=result+1/(i*(-1));

        }

    }
}
