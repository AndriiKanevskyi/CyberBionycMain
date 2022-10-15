import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

// ����� ���������� ������� ����� ��� ������ ���������� � ��� :
// ������,��,�������,���볿,.,���,������,����,����,�����,����,���������,��������

// ������ �� ������� ���볿
// ��� �� ������� ������
// ���� �� ����
// ������ �� ���������
// �������� �� ����

public class Translator {
    static String red = "\u001B[31m";

    static String blue = "\u001B[34m";
    static String reset = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(blue+"������� ���. � ������ ��������� ����������. ���� �� � ��� ���� 11 ��� � ���� ����������� ���� �������. ");
        System.out.println("���� �� ��������� ���������� ����� ����� � �� ����- � ��� ��� ����� � � ����� �� ����-���������");
        System.out.println();
        System.out.println("������ ����� ��� ����� ��� �� ������ ��������� �� �������� ����"+reset);
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(getTranslate(word));
        System.out.println();

        System.out.println(blue+"������ ������������ �� ������� ����"+reset);

        System.out.println(blue+"������ ���� ��� ����� ��� �� ������ ��������� �� �������� ����"+reset);
        word = sc.nextLine();
        System.out.println(getTranslate(word));
        System.out.println();

        System.out.println(blue+"������ ������������ �� ������� ����"+reset);

        System.out.println(blue+"������ ���� ��� ����� ��� �� ������ ��������� �� �������� ����"+reset);
        word = sc.nextLine();
        System.out.println(getTranslate(word));
        System.out.println();

        System.out.println(red+"���������� ��� ��������  =( ������� ���������� ���� "+reset);

    }

    public static String getTranslate(String toTranslate){
        System.out.println(blue+"�� ���� �� �������� ������� �������� :"+reset);
        String result="";

        HashMap<String, String> library = new HashMap<>();
        library.put("������","London");
        library.put("��","is");
        library.put("�������","the capital of");
        library.put("���볿","Great Britain");
        library.put(".",".");
        library.put("���","Kyiv");
        library.put("������","Ukraine");
        library.put("����","Russia");
        library.put("����","bullshit");
        library.put("�����","cool");
        library.put("���������","Mr.Boris Johnson");
        library.put("��������","victory");
        library.put("����","base");

        StringTokenizer tknz = new StringTokenizer(toTranslate," ");



        int numOfTocens = tknz.countTokens();




        for (int i = 0; i < numOfTocens; i++) {
           String pereklad = library.getOrDefault(tknz.nextToken(),"<����� ����� � �� ����>");
           result=result+pereklad+" ";
        }

        return result;
    }

}
