public class exercise6_3_Printing_Shapes {
    public static void main(String[] args) {
        //Використовуючи IntelliJ IDEA, створіть клас Printing_Shapes.
        // Використовуючи цикли та метод:
        // System.out.print("*"), System.out.print(" "), System.out.print("\n") (для переходу на новий рядок).
        // Виведіть на екран:
        //· прямокутник;
        //· прямокутний трикутник;
        //· рівносторонній трикутник;
        //· ромб.

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("");

        System.out.println("");//Прямокутный трыкутнык
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



        //ромб не вдалось зробити






    }
}
