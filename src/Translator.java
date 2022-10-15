import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

// можна спробувати наступні фрази або довільні композиції з слів :
// Лондон,це,столиця,Англії,.,Київ,України,Росія,гімно,круто,база,Джонсонюк,перемога

// Лондон це столиця Англії
// Київ це столиця України
// Росія це гімно
// Лондон це Джонсонюк
// перемога це база

public class Translator {
    static String red = "\u001B[31m";

    static String blue = "\u001B[34m";
    static String reset = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(blue+"Доброго дня. Я молода программа перекладач. Поки що я знію тількі 11 слів і можу перекладати ціли речення. ");
        System.out.println("Якщо ви попросите перекласти слово якого я не знаю- я дам вам знати а ті слова які знаю-перекладу");
        System.out.println();
        System.out.println("Введіть слово або фразу яку ви хочете перевести на Англійску мову"+reset);
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(getTranslate(word));
        System.out.println();

        System.out.println(blue+"Можете спропобувати ще декілька фраз"+reset);

        System.out.println(blue+"Введіть соло або фразу яку ви хочете перевести на Англійску мову"+reset);
        word = sc.nextLine();
        System.out.println(getTranslate(word));
        System.out.println();

        System.out.println(blue+"Можете спропобувати ще декілька фраз"+reset);

        System.out.println(blue+"Введіть соло або фразу яку ви хочете перевести на Англійску мову"+reset);
        word = sc.nextLine();
        System.out.println(getTranslate(word));
        System.out.println();

        System.out.println(red+"Перекладач вже втомився  =( Давайте наступного разу "+reset);

    }

    public static String getTranslate(String toTranslate){
        System.out.println(blue+"Ця саме на Англійскій звучить наступно :"+reset);
        String result="";

        HashMap<String, String> library = new HashMap<>();
        library.put("Лондон","London");
        library.put("це","is");
        library.put("столиця","the capital of");
        library.put("Англії","Great Britain");
        library.put(".",".");
        library.put("Київ","Kyiv");
        library.put("України","Ukraine");
        library.put("Росія","Russia");
        library.put("гімно","bullshit");
        library.put("круто","cool");
        library.put("Джонсонюк","Mr.Boris Johnson");
        library.put("перемога","victory");
        library.put("база","base");

        StringTokenizer tknz = new StringTokenizer(toTranslate," ");



        int numOfTocens = tknz.countTokens();




        for (int i = 0; i < numOfTocens; i++) {
           String pereklad = library.getOrDefault(tknz.nextToken(),"<цього слова я не знаю>");
           result=result+pereklad+" ";
        }

        return result;
    }

}
